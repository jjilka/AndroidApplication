package com.rj.quicklink;

import com.rj.quicklink.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class WebEdu extends Activity {
	Blogs bl=new Blogs();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webedu);        
        
      WebView wv = (WebView) findViewById(R.id.webView1);   
       wv.setWebViewClient(new WebViewClient() {
        	@Override


        	public boolean shouldOverrideUrlLoading(WebView view, String url) 
        	{
        	view.loadUrl(url);
            return true;
        	}
        	
});
       int pos4=Education.getPosition();
	   if(pos4==0)
	   {
		   wv.loadUrl("http://mu.ac.in/");
	   }
	   else if(pos4==1)
	   {
	   	wv.loadUrl("http://stupidsid.com/");
	   	
	   }
	   else if(pos4==2)
	   {
	   	wv.loadUrl("http://www.shiksha.com/");
	   	
	   }
	   else if(pos4==3)
	   {
	   	wv.loadUrl("http://www.campuskeeda.com/index.html");
	   	
	   }
	   else if(pos4==4)
	   {
	   	wv.loadUrl("http://www.meritnation.com/");
	   	
	   }
	   else if(pos4==5)
	   {
	   	wv.loadUrl("http://studylink.com/index.html");
	   	
	   }
	   else if(pos4==6)
	   {
	   	wv.loadUrl("http://www.openculture.com/");
	   	
	   }
	   else if(pos4==7)
	   {
	   	wv.loadUrl("http://www.blackboard.com/");
	   	
	   }
	   else if(pos4==8)
	   {
	   	wv.loadUrl("https://www.coursera.org/");
	   	
	   }
	   else if(pos4==9)
	   {
	   	wv.loadUrl("http://www.sciencedirect.com/");
	   	
	   }
	   else if(pos4==10)
	   {
	   	wv.loadUrl("http://academicearth.org/");
	   	
	   }
	   else if(pos4==11)
	   {
	   	wv.loadUrl("https://www.udacity.com/");
	   	
	   }
	   }
    public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.home:
        startActivity(new Intent(this, List.class));
        return true;
        case R.id.about:
        startActivity(new Intent(this, About.class));
        return true;
        case R.id.exit:
        	Intent intent = new Intent(getApplicationContext(), List.class);
        	intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        	intent.putExtra("EXIT", true);
        	startActivity(intent);
            return true;
        default:
        return super.onOptionsItemSelected(item);
        }}}