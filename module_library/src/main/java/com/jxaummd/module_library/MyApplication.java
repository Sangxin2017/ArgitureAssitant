package com.jxaummd.module_library;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import android.util.Log;

import android.widget.Toast;



/**
 * Created by sangx on 2018/1/14.
 */

public class MyApplication extends Application {
    private static Context context;

    public static final int LOG_LEVEL_DEBUUG = 1;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
//        NineGridView.setImageLoader(new PicassoImageLoader());
//        SDKInitializer.initialize(getApplicationContext()); //初始化Contxt信息，百度地图特有的

    }


    //获取context
    public static Context getContext() {
        return context;
    }

    //封装Toast
    public static void MyToast(String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }


    //封装广播
    public static void broadcastUpdate(Context context, final String action) {
        final Intent intent = new Intent(action);
        context.sendBroadcast(intent);   //发送广播通知
    }

    //打印日志
    public static void PrintLog(String Tag, String content, int level) {
        switch (level) {
            case LOG_LEVEL_DEBUUG:
                Log.d(Tag, content);
                break;
            default:
        }
    }


}
