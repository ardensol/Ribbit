package com.carlos.rabbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by carlos on 10/24/15.
 */
public class RabbitApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "7c1Oqllek83roYkkbaNZDYrEDOzDNRgsUoMfQY2B", "SycrRnweBuU3NxLu0oCbZuIyIgnmIcvpHXeka1EX");

    }
}
