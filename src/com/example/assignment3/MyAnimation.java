package com.example.assignment3;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.*;

public class MyAnimation implements AnimationListener{

	ImageView view;
	MainActivity main;
	
	public MyAnimation(ImageView v, MainActivity a){
		view = v;
		main = a;
	}
	
	@Override
	public void onAnimationEnd(Animation an) {
		TextView button = (TextView) main.getView(view.getId());
		button.setText("Start");		
	}

	@Override
	public void onAnimationRepeat(Animation an) {
		an.setRepeatCount(an.getRepeatCount()+1);
	}

	@Override
	public void onAnimationStart(Animation an) {
		TextView button = (TextView) main.getView(view.getId());
		button.setText("Stop");
	}

}
