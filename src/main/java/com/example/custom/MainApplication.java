package com.example.custom;

import com.example.custom.database.TrafficDBHelper;

import android.app.Application;
import android.util.Log;

/**
 * Created by ouyangshen on 2016/10/14.
 */
public class MainApplication extends Application {

	private final static String TAG = "MainApplication";
	private static MainApplication mApp;
	public TrafficDBHelper mTrafficHelper;
	
	public static MainApplication getInstance() {
		return mApp;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mApp = this;
		mTrafficHelper = TrafficDBHelper.getInstance(this, 1);
		mTrafficHelper.openWriteLink();
		Log.d(TAG, "onCreate");
	}
	
}
