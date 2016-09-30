package com.rj.quicklink;




import com.rj.quicklink.R;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Applications extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
        "Facebook",
        "Twitter",
        "Whatsapp",
        "Wechat",
        "Line",
        "Instagram",
        "Skype",
        "Nimbuzz",
        "Shazam",
        "Truecaller",
        "Mobile9",
        "Appzmob",
        "Mobango"
        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.applications);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pens));
		lv=getListView();
		lv.setTextFilterEnabled(true);
		
		
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
	public void onListItemClick(ListView parent, View v,int position, long id){
		super.onListItemClick(parent, v, position, id);
		Object o=this.getListAdapter().getItem(position);
		
		pos= position;
		Toast.makeText(this,"Loading...Please Wait", Toast.LENGTH_SHORT).show();
		if(position==0)
 	   {
 		   
 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/mobile/"));
 			startActivity(webIntent);
 	   }
		else if(position==1)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/download"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==2)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.whatsapp.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==3)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.wechat.com/en/download.html"));
 	   startActivity(webIntent);
 	   } 
 	   else if(position==4)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://line.naver.jp/en/#"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==5)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=com.instagram.android"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==6)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.skype.com/en/download-skype/skype-for-mobile/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==7)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.nimbuzz.com/en/"));
    	   	startActivity(webIntent);
    	   } else if(position==8)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.shazam.com/music/web/getshazam.html"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==9)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://truecaller.com"));
 	   startActivity(webIntent);
 	   }
    	   else if(position==10)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://gallery.mobile9.com/c/softwares/1/"));
    	   	startActivity(webIntent);
    	   } else if(position==11)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://appzmob.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==12)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://in.mobango.com/"));
    	   	startActivity(webIntent);
    	   }
           
         }
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}