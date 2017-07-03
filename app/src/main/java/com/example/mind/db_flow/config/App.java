package com.example.mind.db_flow.config;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by mind on 3/7/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        FlowManager.init(new FlowConfig.Builder(this).build());

        FlowManager.init(getApplicationContext());
        //FlowManager.init(new FlowConfig.Builder(this).build());
       // FlowManager.init(new FlowConfig.Builder(this).build());
    }
}

