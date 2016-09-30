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

public class WebBooks extends Activity {
	Blogs bl=new Blogs();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webbook);        
        
      WebView wv = (WebView) findViewById(R.id.webView1);   
       wv.setWebViewClient(new WebViewClient() {
        	@Override


        	public boolean shouldOverrideUrlLoading(WebView view, String url) 
        	{
        	view.loadUrl(url);
            return true;
        	}
        	
});
       int pos4=Books.getPosition();
	   if(pos4==0)
	   {
		   wv.loadUrl("http://books.google.com/");
	   }
	   else if(pos4==1)
	   {
	   	wv.loadUrl("http://www.amazon.in/Books/b/ref=topnav_storetab_b/279-1167462-9796660?ie=UTF8&node=976389031");
	   	
	   }
	   else if(pos4==2)
	   {
	   	wv.loadUrl("http://www.gutenberg.org/");
	   	
	   }
	   else if(pos4==3)
	   {
	   	wv.loadUrl("http://www.scribd.com/");
	   	
	   }
	   else if(pos4==4)
	   {
	   	wv.loadUrl("http://www.smashwords.com/?ref=ebookfriendly");
	   	
	   }
	   else if(pos4==5)
	   {
	   	wv.loadUrl("https://booki.sh/");
	   	
	   }
	   else if(pos4==6)
	   {
	   	wv.loadUrl("http://www.shelfari.com/books/subjects/Business+and+Investing");
	   	
	   }
	   else if(pos4==7)
	   {
	   	wv.loadUrl("http://www.librarything.com/");
	   	
	   }
	   else if(pos4==8)
	   {
	   	wv.loadUrl("http://www.goodreads.com/");
	   	
	   }
	   else if(pos4==9)
	   {
	   	wv.loadUrl("http://www.wattpad.com/");
	   	
	   }
	   else if(pos4==10)
	   {
	   	wv.loadUrl("http://www.free-ebooks.net/");
	   	
	   }
	   else if(pos4==11)
	   {
	   	wv.loadUrl("http://www.24symbols.com/");
	   	
	   }
	   else if(pos4==12)
	   {
	   	wv.loadUrl("http://www.readprint.com/");
	   	
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