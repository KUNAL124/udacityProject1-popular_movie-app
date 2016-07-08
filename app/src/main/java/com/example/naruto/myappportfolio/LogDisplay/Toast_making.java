package com.example.naruto.myappportfolio.LogDisplay;
import android.content.Context;
import android.widget.Toast;
//class to create a toast
public class Toast_making {
    //create a long length toast
    public static void long_length(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    //create a short length toast
    public static void short_length(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
