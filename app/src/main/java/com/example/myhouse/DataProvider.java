package com.example.myhouse;

public class DataProvider {

    private static volatile DataProvider sSoleInstance;

    //private constructor.
    private DataProvider() {

        //Prevent form the reflection api.
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static DataProvider getInstance() {
        //Double check locking pattern
        if (sSoleInstance == null) { //Check for the first time
            synchronized (DataProvider.class) {
                if (sSoleInstance == null) sSoleInstance = new DataProvider();
            }
        }

        return sSoleInstance;
    }




























}
