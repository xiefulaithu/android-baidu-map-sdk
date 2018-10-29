package com.ai.hackathon5jni;

import android.content.Intent;
import android.util.Log;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;

class MyLocationListener extends BDAbstractLocationListener {
    private Main2Activity activity;
    public MyLocationListener(Main2Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        String addr = bdLocation.getAddrStr();
        Integer code = new Integer(bdLocation.getLocType());
        Log.e("hackathon", "hackathon5: " + code.toString());
        this.activity.updateLocation(addr);
    }
}
