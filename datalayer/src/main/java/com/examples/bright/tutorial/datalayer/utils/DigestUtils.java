package com.examples.bright.tutorial.datalayer.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by bright on 17/07/2017.
 */

public class DigestUtils {

    private static DigestUtils SINGLETON;

    public static DigestUtils getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new DigestUtils();
        }
        return SINGLETON;
    }

    public String createHash(final String data) {
        MessageDigest messageDigest;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(data.getBytes());
            byte[] messageDigestMD5 = messageDigest.digest();

            for (byte bytes : messageDigestMD5) {
                stringBuffer.append(String.format("%02x", bytes & 0xff));
            }

//            System.out.println("data:" + data);
//            System.out.println("digestedMD5(hex):" + stringBuffer.toString());
        } catch (NoSuchAlgorithmException exception) {
            // TODO Auto-generated catch block
            exception.printStackTrace();
        }
        return stringBuffer.toString();
    }

}
