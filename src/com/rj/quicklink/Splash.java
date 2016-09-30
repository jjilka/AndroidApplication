package com.rj.quicklink;

import com.rj.quicklink.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ProgressBar;

public class Splash extends Activity {
	ProgressBar pb;

	private final int SPLASH_DISPLAY_LENGHT = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		pb=(ProgressBar)findViewById(R.id.progressBar1);
		
		 new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. */
	                Intent mainIntent = new Intent(Splash.this,List.class);
	                Splash.this.startActivity(mainIntent);
	                Splash.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGHT);
	}

	

}
