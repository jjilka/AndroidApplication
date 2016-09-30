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

public class WebSo extends Activity {
	Social in=new Social();
	Advertisement ad=new Advertisement();
	Applications ap=new Applications();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webso);        
        
      WebView wv = (WebView) findViewById(R.id.webView1);   
       wv.setWebViewClient(new WebViewClient() {
        	@Override


        	public boolean shouldOverrideUrlLoading(WebView view, String url) 
        	{
        	view.loadUrl(url);
            return true;
        	}
        	
});
       {  
           int pos1=Social.getPosition();
          
    if(pos1==0)
    {
            	wv.loadUrl("http://m.facebook.com");
            	
    }
    else if(pos1==1)
    {
    	wv.loadUrl("http://m.twitter.com");
    	
    	
    }
    else if(pos1==2)
    {
    	wv.loadUrl("http://m.linkedin.com");
    	
    }
    else if(pos1==3)
    {
    	wv.loadUrl("https://pinterest.com/");
    	
    }
    else if(pos1==4)
    {
    	wv.loadUrl("https://accounts.google.com/ServiceLogin?service=oz&passive=1209600&continue=https://plus.google.com/?gpsrc%3Dgplp0%26partnerid%3Dgplp0");
    	
    }
    else if(pos1==5)
    {
    	wv.loadUrl("https://www.tumblr.com/");
    	
    }
    else if(pos1==6)
    {
    	wv.loadUrl("https://myspace.com/");
    	
    }
    else if(pos1==6)
    {
    	wv.loadUrl("http://www.flickr.com/");
    	
    }
           
           }}public boolean onCreateOptionsMenu(Menu menu) {
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