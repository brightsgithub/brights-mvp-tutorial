Bright’s Clean Architecture MVP/RXAndroid/Dagger2 Tutorial
------------------------------------------------------------

This is a simple application that accesses an API to display:

1) A list of Comics
2) When a Comic has been clicked on, the detail view is shown

This is an MVP implementation divided up into modules.

I have decided to go with modules to enforce a separation of concerns using the Clean Architecture approach to enforce 'The Dependency Rule'

By utilizing modules, each module is its own independent unit, and each module has its own instumented tests and unit tests.


Presentation layer
------------------

View -  The View does nothing but simply render the view to the user and is made as dumb as possible with no logic

Presenter - is responsible for the view logic in terms of formatting data and handling user interaction click events. Its task is to handle events to the user and update the model and
                     display the updated model.


Domain Layer
------------------

Is a pure Java implementation, and its responsibility is to perform business logic, access Data layer and return that result back to the presenter.

Model is an interactor interface that implements the UseCase. This is the interaction that interacts with the business logic of the app and the Data layer of the app.
This is where the data is returned as a stream using Observables.

Data Layer
------------------
This is simply used to obtain the data from a resource via a repository and the implementation could be, Preferences i.e. local storage , it could be from a local DB, cache, Network. In our case it is network based.


Tests Utils
------------------
Shared module, that is shared by other modules under instrumentation tests. Other modules have included this as a "androidTestCompile project(':testutils')"
so they may refer to this whilst testing.


BuildTypes for testing
------------------
I have a build type 'debugForTesting' which should be using to run unit and instrumentation tests. This allows the app under test, to use the mock server.
The mock server response is a hardcoded json response, which is a copy and paste from the real server response.

the normal debug buildType will hit the server.

I have not configured the release build type, as it's outside the scope of this tutorial ;)



Libraries used
------------------
* Circular progress bar
* Dagger 2 - for dependency injection
* Butterknife - So that we don’t have to keep calling find view by id and onClick listers are easier
* Picasso - for image fetching from network
* Mockito - used for mocking during tests
* Gson - to map Json data to domain objects
* OkHttp3 - used for networking and mock server
* Retrofit - to make networking calls easier, which is a wrapper around okHttp3
* RxJava/Android - So the app is reactive/asynchronous  and can make use of streams


![alt tag](https://github.com/brightsgithub/brights-mvp-tutorial/blob/master/comics_list.png)
![alt tag](https://github.com/brightsgithub/brights-mvp-tutorial/blob/master/comic_detail.png)