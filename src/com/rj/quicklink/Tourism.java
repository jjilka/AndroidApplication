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
import android.widget.ListView;
import android.widget.Toast;

public class Tourism extends ListActivity {
	String pen;
	static final String[] pens= {
		"AIRLINES",
		"CARS AND BUS",
		"TOURISM"
};
ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tourism);
		setListAdapter(new Icon(this,pens));
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
	protected void onListItemClick(ListView parent, View v,int position, long id){
		super.onListItemClick(parent, v, position, id);
		Object o=this.getListAdapter().getItem(position);
		
		 if(position==0){
            Intent i = new Intent(this, Airlines.class);
            startActivity(i);
		}
		 else if(position==1){
		            Intent i = new Intent(this, IT.class);
		            startActivity(i);
				}
		 else if(position==2){
	            Intent i = new Intent(this, Designers.class);
	            startActivity(i);
			}
	
		
	}}