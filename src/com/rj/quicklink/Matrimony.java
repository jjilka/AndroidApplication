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

public class Matrimony extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
        "Shaadi",
        "Jeevansaathi",
        "Bharat Matrimony",
        "Matrimonials India",
        "Simply Marry",
        "Merasathi",
        "Gujarati Matrimony",
        "Community Matrimony",
        "Kadiyasamaj",
        "Falguni Mehta"
        

        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matrimony);
		
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
 		   
 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.shaadi.com/"));
 			startActivity(webIntent);
 	   }
		else if(position==1)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jeevansathi.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==2)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bharatmatrimony.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==3)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.matrimonialsindia.com/"));
 	   startActivity(webIntent);
 	   } 
 	   else if(position==4)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.simplymarry.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==5)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.merasathi.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==6)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gujaratimatrimony.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==7)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.communitymatrimony.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==8)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://kadiyasamaj.com/"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==9)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.falgunimehta.com/brides.html"));
 	   startActivity(webIntent);
 	   }
    }
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}