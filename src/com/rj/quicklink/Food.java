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

public class Food extends ListActivity {
	

	
static int pos;
	
	ListView lv;
	static final String[] pens= {
     "Zomato",
     "Food Panda",
     "Tasty Khana",
     "Pizza Hut",
     "Dominos",
     "McDonald India",
     "Subway",
     "KFC",
     "RECIPES"
        };
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food);
		
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
	 		   
	 		   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.zomato.com/"));
	 			startActivity(webIntent);
	 	   }
	 		  else if(position==1)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.foodpanda.in/"));
	 			  startActivity(webIntent);
	 		   }
	 		 
	 		   else if(position==2)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://tastykhana.in/"));
	 			  startActivity(webIntent);
	 		   }
	 		   else if(position==3)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.pizzahut.co.in/"));
	 			  startActivity(webIntent);
	 		   }
	 		   else if(position==4)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dominos.co.in/"));
	 			  startActivity(webIntent);
	 		   }
	 		   else if(position==5)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://mcdonaldsindia.com/home.html"));
	 			  startActivity(webIntent);
	 		   }
	 		   else if(position==6)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.subway.co.in/"));
	 			  startActivity(webIntent);
	 		   }
	 		   else if(position==7)
	 		   {
	 			   Intent webIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kfc.com/"));
	 			  startActivity(webIntent);
	 		   }
	 		  else if(position==8)
	 		   {
	 			   Intent webIntent=new Intent(this,Recipes.class);
	 			  startActivity(webIntent);
	 		   }
		
	}
           
         
	
	public static int getPosition()
	{
	return  pos;
	}	
	
}