package com.example.studentdbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    static String DbName = "college.db";
    static String Tablename = "students";
    static String col1 = "id";
    static String col2 = "name";
    static String col3 = "admno";
    static String col4 = "rollno";
    static String col5 = "college";

    public DatabaseHelper(Context context) {
        super(context, DbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + Tablename + "(" + col1 + " integer primary key autoincrement," +
                col2 + " text," +
                col3 + " text," +
                col4 + " text," +
                col5 + " text)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertdata(String name, String admno, String rollno, String clg)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col2,name);
        cv.put(col3,admno);
        cv.put(col4,rollno);
        cv.put(col5,clg);
        long status=db.insert(Tablename,null,cv);
        if (status==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }


}
