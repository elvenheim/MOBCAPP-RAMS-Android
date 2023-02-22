package com.example.ramsdroid;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler {

    //name of db
    private static  final  String DB_Name = "APCIS_Users";

    //name of table
    private  static  final  String TName = "Users";

    //table col
    private static final String Email = "Email";
    private static final String Password = "Password";
    private static final String givenName = "givenName";
    private static final String Mid = "Mid";
    private static final String lastName = "lastName";

    public void onCreate(SQLiteDatabase db, String userEmail){

        String query = "SELECT * FROM " + DB_Name + " WHERE " + Email + " = " + userEmail;

    }


}
