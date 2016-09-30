package com.rj.quicklink;

import com.rj.quicklink.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class Web extends Activity {
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
        	


        	
        	
});
      
       
       
      /* {
    	   int pos2=ad.getPosition();
    	   if(pos2==0)
    	   {
    	           	wv.loadUrl("https://accounts.google.com/ServiceLogin?service=adwords&continue=https://adwords.google.com/um/gaiaauth?apt%3DNone%26ltmpl%3Djfk&hl=en_IN&ltmpl=jfk&passive=86400&skipvpage=true&sacu=1&sarp=1&sourceid=awo&subid=in-en-ha-aw-skhp0~21599740758");
    	           	
    	   }
    	   else if(pos2==1)
    	   {
    	   	wv.loadUrl("https://bg-bg.facebook.com/advertising");
    	   	
    	   	
    	   }
    	   else if(pos2==2)
    	   {
    	   	wv.loadUrl("https://blog.twitter.com/advertising");
    	   	
    	   }
    	   else if(pos2==3)
    	   {
    	   	wv.loadUrl("http://advertising.microsoft.com/en-us/splitter");
    	   	
    	   }
    	   else if(pos2==4)
    	   {
    	   	wv.loadUrl("http://www.freeads.in/business-services/advertising-agencies/mumbai/?ads=All&type=wanted");
    	   	
    	   }
    	   else if(pos2==5)
    	   {
    	   	wv.loadUrl("http://design.blurgroup.com/?gclid=CJKb6_Lb3rgCFdFz4godi04AkA");
    	   	
    	   }
    	   else if(pos2==6)
    	   {
    	   	wv.loadUrl("http://www.forecastadvtg.com");
    	   	
    	   }
    	   else if(pos2==7)
    	   {
    	   	wv.loadUrl("http://www.greysell.in");
    	   	
    	   }
    	   else if(pos2==8)
    	   {
    	   	wv.loadUrl("http://www.eggfirst.com");
    	   	
    	   }
    	   else if(pos2==9)
    	   {
    	   	wv.loadUrl("http://www.beehivecommunications.com");
    	   	
    	   }
    	   else if(pos2==10)
    	   {
    	   	wv.loadUrl("http://www.wateryourbrand.in/");
    	   	
    	   }
    	   else if(pos2==11)
    	   {
    	   	wv.loadUrl("http://www.perceptindia.in/	");
    	   	
    	   }
    	   else if(pos2==12)
    	   {
    	   	wv.loadUrl("http:/m.asklaila.com/search/Mumbai/-/List%20of%20advertising%20agencies/?searchNearby=false");
    	   	
    	   }
    	   else if(pos2==13)
    	   {
    	   	wv.loadUrl("http://www.advertisingmumbai.com/");
    	   	
    	   }
    	   else if(pos2==14)
    	   {
    	   	wv.loadUrl("http://adage.com/");
    	   	
    	   }
    	   else if(pos2==15)
    	   {
    	   	wv.loadUrl("https://www.google.co.in/?gws_rd=cr#bav=on.2,or.r_cp.r_qf.&fp=52474dfe0de989d0&psj=1&q=advertising+agencies");
    	   	
    	   }
    	   
    	   
       }*/
       {
    	   int pos3=Applications.getPosition();
    	   if(pos3==0)
    	   {
    		   
    		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/mobile/"));
    			startActivity(webIntent);
    	   }
    	   else if(pos3==1)
    	   {
    	   	wv.loadUrl("https://twitter.com/download");
    	   	
    	   }
    	   else if(pos3==2)
    	   {
    	   	wv.loadUrl("https://play.google.com/store/apps/details?id=com.whatsapp");
    	   	
    	   }
    	   else if(pos3==3)
    	   {
    	   	wv.loadUrl("http://www.wechat.com/en/download.html");
    	   	
    	   } 
    	   else if(pos3==4)
    	   {
       	   	wv.loadUrl("http://line.naver.jp/en/#");
       	   	
       	   }
    	   else if(pos3==5)
    	   {
       	   	wv.loadUrl("https://play.google.com/store/apps/details?id=com.instagram.android");
       	   	
       	   }
    	   else if(pos3==6)
    	   {
       	   	wv.loadUrl("http://www.skype.com/en/download-skype/skype-for-mobile/");
       	   	
       	   }
    	   else if(pos3==7)
    	   {
       	   	wv.loadUrl("http://www.nimbuzz.com/en/");
       	   	
       	   } else if(pos3==8)
    	   {
       	   	wv.loadUrl("http://www.shazam.com/music/web/getshazam.html");
       	   	
       	   }
       	else if(pos3==9)
 	   {
    	   	wv.loadUrl("http://truecaller.com");
    	   	
    	   }
       	   else if(pos3==10)
    	   {
       	   	wv.loadUrl("http://gallery.mobile9.com/c/softwares/1/");
       	   	
       	   } else if(pos3==11)
    	   {
       	   	wv.loadUrl("http://appzmob.com/");
       	   	
       	   } else if(pos3==12)
    	   {
       	   	wv.loadUrl("http://in.mobango.com/");
       	   	
       	   }
    	   
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
        }}
}