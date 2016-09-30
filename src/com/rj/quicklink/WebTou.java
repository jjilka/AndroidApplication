package com.rj.quicklink;

import com.rj.quicklink.R;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class WebTou extends Activity {
	Social in=new Social();
	Advertisement ad=new Advertisement();
	Applications ap=new Applications();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);        
        
      WebView wv = (WebView) findViewById(R.id.webView1);   
       wv.setWebViewClient(new WebViewClient() {
        	@Override


        	public boolean shouldOverrideUrlLoading(WebView view, String url) 
        	{
        	view.loadUrl(url);
            return true;
        	}
        	
});}}