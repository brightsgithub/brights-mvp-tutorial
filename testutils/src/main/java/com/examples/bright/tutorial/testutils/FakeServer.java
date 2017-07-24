package com.examples.bright.tutorial.testutils;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * https://github.com/square/okhttp/tree/master/mockwebserver
 *
 * This library makes it easy to test that your app Does The Right Thing when it makes HTTP and
 * HTTPS calls. It lets you specify which responses to return and then verify that requests were
 * made as expected.
 *
 * Because it exercises your full HTTP stack, you can be confident that you're testing everything.
 * You can even copy & paste HTTP responses from your real web server to create representative
 * test cases. Or test that your code survives in awkward-to-reproduce
 * situations like 500 errors or slow-loading responses
 *
 * Created by bright on 23/07/2017.
 */

public class FakeServer {

    private final static int PORT = 8080;
    private MockWebServer mockWebServer;
    private long delay;

    public void useFakeServer() {

        // Create a MockWebServer. These are lean enough that you can create a new
        // instance for every unit test.
        mockWebServer = new MockWebServer();

        MyDispatcher myDispatcher = new MyDispatcher();
        mockWebServer.setDispatcher(myDispatcher);
        try {
            // Start the server.
            mockWebServer.start(PORT);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setBodyDelayInSeconds(final long delay) {
        this.delay = delay;
    }

    /**
     * By default MockWebServer uses a queue to specify a series of responses. Use a Dispatcher
     * to handle requests using another policy. One natural policy is to dispatch on the
     * request path. You can, for example, filter the request instead of using server.enqueue().
     */
    private class MyDispatcher extends Dispatcher {

        @Override
        public MockResponse dispatch(RecordedRequest recordedRequest) throws InterruptedException {

            // Only the path is needed, not the query string
            String requestPath = recordedRequest.getPath();
            if (requestPath.contains("?")) {
                requestPath = requestPath.substring(0, requestPath.indexOf('?'));
            }

            Log.v("FakeServer", "requestPath is: "+ requestPath);

            // Place all the paths you expect to have a mocked response here in the if else blocks:
            // This is so, any test layer using a service, can obtained the mocked data

            // This is the get get comics path
            if (requestPath.equals("/v1/public/comics")) {
                return getMockResponseForJson(200, TestJson.COMICS_10_RECORDS);
            }

            return getMockResponseForJson(500, "OUCH! need to state our fake json response!");
        }

        /**
         * Mock responses default to an empty response body and a 200 status code.
         * You can set a custom body with a string, input stream or byte array.
         * Also add headers with a fluent builder API.
         * @param statusCode
         * @param json
         * @return
         */
        private MockResponse getMockResponseForJson(int statusCode, String json) {
            MockResponse response = new MockResponse();
            if (json != null) {
                response.setBody(json);
            }
            response.setResponseCode(statusCode);
            response.setBodyDelay(delay, TimeUnit.SECONDS);
            return response;
        }
    }

    /**
     * Cleanup per test.
     */
    public void performCleanUp() {
        try {
            mockWebServer.shutdown();
            mockWebServer = null;
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
