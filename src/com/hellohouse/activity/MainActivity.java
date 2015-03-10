package com.hellohouse.activity;

import com.hellohouse.utils.DoubleClickExitHelper;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;

public class MainActivity extends BaseActivity {

	private static final String TAG = "MainActivity";
	private DoubleClickExitHelper mDoubleClickExitHelper = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mDoubleClickExitHelper = new DoubleClickExitHelper(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return false;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Log.i(TAG, "exit");
			return mDoubleClickExitHelper.onKeyDown(keyCode, event);
		}
		return super.onKeyDown(keyCode, event);
	}
	
	

}
