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

public class Webair extends Activity {
	Blogs bl=new Blogs();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webair);        
        
      WebView wv = (WebView) findViewById(R.id.webView1);   
       wv.setWebViewClient(new WebViewClient() {
        	@Override


        	public boolean shouldOverrideUrlLoading(WebView view, String url) 
        	{
        	view.loadUrl(url);
            return true;
        	}
        	
});
       int pos4=Airlines.getPosition();
	   if(pos4==0)
	   {
		   wv.loadUrl("http://www.britishairways.com/travel/home/public/en_in");
	   }
	   else if(pos4==1)
	   {
	   	wv.loadUrl("http://www.yatra.com/");
	   	
	   }
	   else if(pos4==2)
	   {
	   	wv.loadUrl("http://www.makemytrip.com/");
	   	
	   }
	   else if(pos4==3)
	   {
	   	wv.loadUrl("http://www.airindia.com/SBCMS/Webpages/Home.aspx");
	   	
	   }
	   else if(pos4==4)
	   {
	   	wv.loadUrl("http://www.spicejet.com/");
	   	
	   }
	   else if(pos4==5)
	   {
	   	wv.loadUrl("http://www.goair.in/");
	   	
	   }
	   else if(pos4==6)
	   {
	   	wv.loadUrl("http://www.jetairways.com/EN/IN/Home.aspx");
	   	
	   }
	   else if(pos4==7)
	   {
	   	wv.loadUrl("http://www.singaporeair.com/SAA-flow.form?execution=e6s1");
	   	
	   }
	   else if(pos4==8)
	   {
	   	wv.loadUrl("http://www.flykingfisher.com/");
	   	
	   }
	   else if(pos4==9)
	   {
	   	wv.loadUrl("https://book.goindigo.in/skylights/cgi-bin/skylights.cgi?language=EN&country=IN&redirection=false&sid=");
	   	
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