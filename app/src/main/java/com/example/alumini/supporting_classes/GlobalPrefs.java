package com.example.alumini.supporting_classes;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.alumini.R;


public class GlobalPrefs {
    public  Context mContext;


    public GlobalPrefs(Context context){
        mContext = context;
    }

    public  void putString(String key, String value){
        SharedPreferences.Editor editor = mContext.getSharedPreferences(
                mContext.getString(R.string.preference_file_key), Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.apply();

    }
    public  String getString(String preferenceKey){
        SharedPreferences preferences = mContext.getSharedPreferences(mContext.getString(R.string.preference_file_key)
                , Context.MODE_PRIVATE);


        return preferences.getString(preferenceKey,"");
    }

    public  void putBooloean(String key, boolean value){
        SharedPreferences.Editor editor = mContext.getSharedPreferences(
                mContext.getString(R.string.preference_file_key), Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public  boolean getBoolean(String key){
        SharedPreferences preferences = mContext.getSharedPreferences(mContext.getString(R.string.preference_file_key)
        , Context.MODE_PRIVATE);
        return preferences.getBoolean(key,false);
    }
}
