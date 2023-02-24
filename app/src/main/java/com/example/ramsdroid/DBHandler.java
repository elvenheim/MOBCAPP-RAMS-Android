package com.example.ramsdroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper{
    //name of db
    private static final String DB_Name = "APCIS_Users";

    public DBHandler (Context context){
        super(context,"APCIS_Users",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Users(Email TEXT primary key, Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Users");
    }
    public boolean checkUserPass (String user, String pass){
        SQLiteDatabase db = this.getWritableDatabase();
        @SuppressLint("Recycle") Cursor cursor = db.rawQuery("SELECT * FROM Users WHERE Email = ? AND Password = ?", new String[] {user, pass});
        if (cursor.getCount() > 0 ){
            return true;
        } else {
            return false;
        }
    }
}
