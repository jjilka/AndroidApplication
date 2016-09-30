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

public class AdvertisingAgencies extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
        "Blurgroup",
        "Deepak Advt",
        "Forecast Advtg",
        "Greysell",
        "EggFirst",
        "Beehive Communications",
        "Water Your Brand",
        "Quadrant",
        "Percept India",
        "The Circus Works",
        "Advertising Mumbai",
        "AskLaila"
        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.advertising);
		
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
 		   
 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://design.blurgroup.com/?gclid=CJKb6_Lb3rgCFdFz4godi04AkA"));
 			startActivity(webIntent);
 	   }
		else if(position==1)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.deepakadvt.co.in/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==2)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.forecastadvtg.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==3)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.greysell.in/"));
 	   startActivity(webIntent);
 	   } 
 	   else if(position==4)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.eggfirst.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==5)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.beehivecommunications.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==6)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.wateryourbrand.in/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==7)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.quadrantcom.co.in/advertising-agency-in-mumbai-11.html"));
    	   	startActivity(webIntent);
    	   } else if(position==8)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.perceptindia.in/"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==9)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thecircusworks.com/"));
 	   startActivity(webIntent);
 	   }
    	   else if(position==10)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.advertisingmumbai.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==11)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.asklaila.com/search/Mumbai/-/List%20of%20advertising%20agencies/?searchNearby=false"));
    	   	startActivity(webIntent);
    	   } 
           
         }
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}