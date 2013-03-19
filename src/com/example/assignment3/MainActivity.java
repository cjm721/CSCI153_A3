package com.example.assignment3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	boolean[] on = new boolean[4];
	Animation[] an = new Animation[4];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public View getView(int id){
		switch(id){
		
		case R.id.iBottemLeft:
			return findViewById(R.id.bBottemLeft);

		case R.id.iBottemRight:
			return findViewById(R.id.bBotemRight);
		
		case R.id.iTopLeft:
			return findViewById(R.id.bTopLeft);
		
		case R.id.iTopRight:
			return findViewById(R.id.bTopRight);		
		}
		return null;
	}

	public void topLeft(View v){
		ImageView iv = (ImageView)findViewById(R.id.iTopLeft);
		if(!on[0]){
			an[0] = AnimationUtils.loadAnimation(this, R.anim.alpha);
			an[0].setAnimationListener(new MyAnimation(iv, this));

			iv.startAnimation(an[0]);
			on[0] = true;
		}else{
			an[0].cancel();
			on[0] = false;
		}
	}
	
	public void topRight(View v){
		ImageView iv = (ImageView)findViewById(R.id.iTopRight);
		if(!on[1]){
			an[1] = AnimationUtils.loadAnimation(this, R.anim.rotate);
			an[1].setAnimationListener(new MyAnimation(iv, this));
		
			iv.startAnimation(an[1]);
			on[1] = true;
		}else{
			an[1].cancel();
			on[1] = false;
		}
	}
	
	public void bottemLeft(View v){
		if(!on[2]){
			ImageView iv = (ImageView)findViewById(R.id.iBottemLeft);
			an[2] = AnimationUtils.loadAnimation(this, R.anim.scale);
			an[2].setAnimationListener(new MyAnimation(iv, this));
		
			iv.startAnimation(an[2]);
			on[2] = true;
		}else{
			an[2].cancel();
			on[2] = false;		
		}
	}
	
	public void bottemRight(View v){
		if(!on[3]){
			ImageView iv = (ImageView)findViewById(R.id.iBottemRight);
			an[3] = AnimationUtils.loadAnimation(this, R.anim.translate);
			an[3].setAnimationListener(new MyAnimation(iv, this));
		
			iv.startAnimation(an[3]);
			on[3] = true;
		}else{
			an[3].cancel();
			on[3] = false;
		}
	}
}
