package com.hellohouse.activity;

import com.hellohouse.utils.AppManager;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		AppManager.getAppManager().addActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppManager.getAppManager().finishActivity(this);
	}

	
	
	
}
