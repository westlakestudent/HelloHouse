package com.hellohouse.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/**
 *
 * WelcomeActivity
 * @author chendong
 * 2015年3月10日 上午10:04:09
 * @version 1.0.0
 *
 */
public class WelcomeActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 final View view = View.inflate(this, R.layout.welcome, null);
		setContentView(view);
		AlphaAnimation aa = new AlphaAnimation(0.2f,1.0f);
		aa.setDuration(2000);
		view.startAnimation(aa);
		aa.setAnimationListener(new AnimationListener()
		{
			@Override
			public void onAnimationEnd(Animation arg0) {
				redirectTo();
			}
			@Override
			public void onAnimationRepeat(Animation animation) {}
			@Override
			public void onAnimationStart(Animation animation) {}
			
		});
	}

	private void redirectTo(){
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
}
