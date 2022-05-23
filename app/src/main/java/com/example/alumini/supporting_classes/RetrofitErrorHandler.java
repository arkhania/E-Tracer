package com.example.alumini.supporting_classes;

import android.content.Context;

import com.sdsmdg.tastytoast.TastyToast;

/**
 * to handle the retrofit errors
 */
public class RetrofitErrorHandler {
    public void statusCodeHandler(Context context, int errorCode){
        if (errorCode == 500){
            TastyToast.makeText(context,"Oops, Our servers are sick!",TastyToast.LENGTH_SHORT,TastyToast.ERROR);
        }
    }
}
