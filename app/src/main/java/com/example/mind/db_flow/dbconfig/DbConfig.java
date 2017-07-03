package com.example.mind.db_flow.dbconfig;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by mind on 3/7/17.
 */

@Database(name = DbConfig.NAME, version = DbConfig.VERSION)
public class DbConfig {

    public static final String NAME = "StudentDb"; // we will add the .db extension

    public static final int VERSION = 1;
}
