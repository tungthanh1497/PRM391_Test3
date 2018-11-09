package com.tungthanh1497.tungtt_se04896_test3_runatboot;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class RunAfterBootService extends Service {

    private static final String TAG_BOOT_EXECUTE_SERVICE = "BOOT_BROADCAST_SERVICE";

    public RunAfterBootService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}