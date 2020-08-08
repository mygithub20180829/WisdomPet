package com.liuwang.wisdompet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by liuwang on 2019/8/6.
 */

public class DBhelper extends SQLiteOpenHelper {

    public DBhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table regist (_id integer primary key autoincrement," +
                "username varchar(20),password varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table regist (_id integer primary key autoincrement," +
                "username varchar(20)),password varchar(20)");
        this.onCreate(db);
    }
}
