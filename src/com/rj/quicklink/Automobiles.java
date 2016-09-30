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

public class Automobiles extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
        "Audi",
        "Aston Martin",
        "Avanti Motors",
        "Bentley Motors",
        "BMW",
        "Chevrolet",
        "Ferrari",
        "Fiat",
        "Ford",
        "Honda",
        "Hummer",
        "Hyundai",
        "Jaguar",
        "Kawasaki",
        "Lamborghini",
        "Landrover",
        "Lexus",
        "Mercedes",
        "MINI Cooper",
        "Mitsubishi",
        "Morgan Motor",
        "Nissan",
        "Porsche",
        "Renault",
        "Rolls Royce",
        "Suzuki",
        "Suzuki MotorCycle",
        "Tata Motors",
        "Toyota",
        "Triumph Motorcycles",
        "Volkswagen",
        "Volvo",
        "Yamaha Motor",
        "Zero Motorcycles",
        "Maps of India",
        "India Automobile"


        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.automobiles);
		
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
 		   
 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.audi.com/"));
 			startActivity(webIntent);
 	   }
		else if(position==1)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.astonmartin.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==2)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.avantimotors.com/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==3)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bentleymotors.com/"));
 	   startActivity(webIntent);
 	   } 
 	   else if(position==4)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bmw.in/in/en/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==5)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.chevrolet.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==6)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ferrari.com/Pages/Gateway.aspx?CountryId=69&CountryTitle=India"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==7)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.fiat.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==8)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ford.com/"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==9)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.honda.com/"));
 	   startActivity(webIntent);
 	   }
    	   else if(position==10)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.hummer.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==11)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.hyundai.co.uk/"));
    	   	startActivity(webIntent);
    	   } 
           else if(position==12)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jaguar.com/gl/en/marketsel"));
    	   	startActivity(webIntent);
    	   } else if(position==13)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kawasaki.com/Home/Home.aspx"));
    	   	startActivity(webIntent);
    	   } else if(position==14)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.lamborghini.com/en/home/"));
    	   	startActivity(webIntent);
    	   } else if(position==15)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.landrover.com/gl/en/lr/marketsel"));
    	   	startActivity(webIntent);
    	   } else if(position==16)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.lexus.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==17)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mbusa.com/mercedes/index"));
    	   	startActivity(webIntent);
    	   } else if(position==18)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mini.in/?cm=mcom_forward_direct"));
    	   	startActivity(webIntent);
    	   } else if(position==19)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mitsubishicars.com/MMNA/jsp/index.do"));
    	   	startActivity(webIntent);
    	   } else if(position==20)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.morgan-motor.co.uk/index.html"));
    	   	startActivity(webIntent);
    	   } else if(position==21)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.nissan-global.com/EN/"));
    	   	startActivity(webIntent);
    	   } else if(position==22)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.porsche.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==23)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.renault.co.uk/?ORIGIN=jumppage"));
    	   	startActivity(webIntent);
    	   } else if(position==24)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.rolls-roycemotorcars.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==25)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.suzuki.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==26)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.suzukimotorcycle.co.in/"));
    	   	startActivity(webIntent);
    	   } else if(position==27)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.tatamotors.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==28)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.toyota.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==29)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.triumphmotorcycles.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==30)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.vw.com/en.html"));
    	   	startActivity(webIntent);
    	   } else if(position==31)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.volvo.com/group/volvosplash-global/en-gb/Pages/volvo_splash.aspx"));
    	   	startActivity(webIntent);
    	   } else if(position==32)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yamaha-motor.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==33)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.zeromotorcycles.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==34)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://automobiles.mapsofindia.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==35)
           {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.indiaautomobile.com/"));
    	   	startActivity(webIntent);
    	   }
         }
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}