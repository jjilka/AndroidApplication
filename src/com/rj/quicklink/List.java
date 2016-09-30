package com.rj.quicklink;


import com.rj.quicklink.R;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class List extends ListActivity {
		String pen;
	static final String[] pens= {
		//"Advertising",
		//"Airlines",
		
		" APPLICATIONS",//0
		" AUTOMOBILES",//1
		//"Automobiles",
		" BANKING",//2
		" BLOGS",//3
		"  BOOKS",//4
		//"Designers",
		" DIAMONDS",//5
		" EDUCATION",//6
		" ELECTRONICS",//7
		"  ENTERTAINMENT",//8
		//"FMCG",
		"  FOOD",//9
		" GOVERNMENT",//10
		"  HOSPITALS",//11
		//"Infrastructure",
		//"IT",
		//"Jewellery",
		" JOBS",//12
		" MATRIMONY",//13
		" MODELLING",//14
	    " NEWS",//15
	    " QUOTES",//16
		" SHOPPING",//17
		" SOCIAL NETWORK",//18
		" SPORTS",//19
		"  STOCK",//20
		"  TRAVEL"//21
		//"Venture Capitalist",
};
ListView lv;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		
		setListAdapter(new Icon(this,pens));
		lv=getListView();
		lv.setTextFilterEnabled(true);
	
		if (getIntent().getBooleanExtra("EXIT", false)) {
		    finish();
		}
		
	}		

	 
	
	
	@Override
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
        	finish();
            System.exit(0);
            return true;
        default:
        return super.onOptionsItemSelected(item);
        }}
	protected void onListItemClick(ListView parent, View v,int position, long id){
		super.onListItemClick(parent, v, position, id);
		Object o=this.getListAdapter().getItem(position);
		/*if(position==0){
            Intent i = new Intent(this, Advertisement.class);
            startActivity(i);
		 }
		else if(position==1){
            Intent i = new Intent(this, Airlines.class);
            startActivity(i);
		
		else if(position==3){
            Intent i = new Intent(this, Automobiles.class);
            startActivity(i);
		}
		else if(position==4){
            Intent i = new Intent(this, Banking.class);
            startActivity(i);
		}*/
		if(position==0){
	            Intent i = new Intent(this, Applications.class);
	            startActivity(i);
			}else if(position==1){
	            Intent i = new Intent(this, Automobiles.class);
	            startActivity(i);
			}
		else if(position==2){
            Intent i = new Intent(this, Banking.class);
            startActivity(i);
		}
		else if(position==3){
            Intent i = new Intent(this, Blogs.class);
            startActivity(i);
		}/*
		else if(position==7){
            Intent i = new Intent(this, Designers.class);
            startActivity(i);
		}*/
		else if(position==4){
            Intent i = new Intent(this, Books.class);
            startActivity(i);
		}
		else if(position==5){
            Intent i = new Intent(this,Diamonds .class);
            startActivity(i);
		}
		else if(position==6){
            Intent i = new Intent(this, Education.class);
            startActivity(i);
		}
		else if(position==7){
            Intent i = new Intent(this, Electronics.class);
            startActivity(i);
		}
		else if(position==8){
            Intent i = new Intent(this, Entertainment.class);
            startActivity(i);
		}
		
		else if(position==9){
            Intent i = new Intent(this, Food.class);
            startActivity(i);
		}
		else if(position==10){
            Intent i = new Intent(this, Government.class);
            startActivity(i);
		}
		else if(position==11){
            Intent i = new Intent(this, Hospitals.class);
            startActivity(i);
		}/*
		else if(position==15){
            Intent i = new Intent(this, Infrastructure.class);
            startActivity(i);
		}
		else if(position==16){
            Intent i = new Intent(this, IT.class);
            startActivity(i);
		}
		else if(position==17){
            Intent i = new Intent(this, Jewellery.class);
            startActivity(i);
		}*/
		else if(position==12){
            Intent i = new Intent(this, Jobs.class);
            startActivity(i);
		}
		else if(position==13){
            Intent i = new Intent(this, Matrimony.class);
            startActivity(i);
		}
		else if(position==14){
            Intent i = new Intent(this, Modelling.class);
            startActivity(i);
		}
		else if(position==15){
            Intent i = new Intent(this, News.class);
            startActivity(i);
		}
		
		else if(position==16){
            Intent i = new Intent(this, Quotes.class);
            startActivity(i);
		}
		else if(position==17){
            Intent i = new Intent(this, Shopping.class);
            startActivity(i);
		}
		else if(position==18){
            Intent i = new Intent(this, Social.class);
            startActivity(i);
		}
		else if(position==19){
            Intent i = new Intent(this, Sports.class);
            startActivity(i);
		}
		else if(position==20){
            Intent i = new Intent(this, Stock.class);
            startActivity(i);
		}
		else if(position==21){
            Intent i = new Intent(this, Tourism.class);
            startActivity(i);
		}/*
		else if(position==25){
            Intent i = new Intent(this, Venture.class);
            startActivity(i);
		}*/

}}