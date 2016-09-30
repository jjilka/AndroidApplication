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

public class Banking extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
        "Axis Bank",
        "Bank of India",
        "Bank of Maharashtra",
        "Canara Bank",
        "Central Bank of India",
        "Citibank",
        "HDFC Bank",
        "ICICI Bank",
        "IDBI Bank",
        "Kotak",
        "Punjab national bank",
        "Reserve Bank of India",
        "State Bank of India",
        "Standard Chartered",
        "Union Bank of India",
        "United Bank of India",
        "Yes Bank"
        
        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.banking);
		
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
 		   
 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.axisbank.com/"));
 			startActivity(webIntent);
 	   }
		else if(position==1)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bankofindia.co.in/english/home.aspx"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==2)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bankofmaharashtra.in/"));
 	   startActivity(webIntent);
 	   }
 	   else if(position==3)
 	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.canarabank.com/English/Home.aspx"));
 	   startActivity(webIntent);
 	   } 
 	   else if(position==4)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.centralbankofindia.co.in/site/indexcbi.aspx"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==5)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.citibank.co.in/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==6)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.hdfcbank.com/"));
    	   	startActivity(webIntent);
    	   }
 	   else if(position==7)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.icicibank.com/index.html"));
    	   	startActivity(webIntent);
    	   } else if(position==8)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.idbi.com/index.asp"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==9)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kotak.com/"));
 	   startActivity(webIntent);
 	   }
    	   else if(position==10)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.pnbindia.com/"));
    	   	startActivity(webIntent);
    	   } else if(position==11)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.rbi.org.in/scripts/banklinks.aspx"));
    	   	startActivity(webIntent);
    	   } else if(position==12)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.sbi.co.in/"));
    	   	startActivity(webIntent);
    	   }
    	else if(position==13)
	   {
 	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.standardchartered.com/en/"));
 	   startActivity(webIntent);
 	   }
    	   else if(position==14)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.unionbankofindia.co.in/"));
    	   	startActivity(webIntent);
    	   } 
           else if(position==16)
 	   {
    	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yesbank.in/"));
    	   	startActivity(webIntent);
           
           }
           else if(position==15)
     	   {
        	   	Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.unitedbankofindia.com/English/HomePage.aspx"));
        	   	startActivity(webIntent);
               
               }
        
         }
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}