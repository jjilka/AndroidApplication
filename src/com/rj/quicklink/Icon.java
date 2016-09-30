package com.rj.quicklink;

import com.rj.quicklink.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class Icon extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
 
	public Icon(Context context,  String[] values) {
		super(context, R.layout.icon, values);
		this.context = context;
		this.values = values;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.icon, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
 
		if (s.equals(" APPLICATIONS")) {
			imageView.setImageResource(R.drawable.app);
		} else if (s.equals("  HOSPITALS")) {
			imageView.setImageResource(R.drawable.hosp);
		} else if (s.equals("  BOOKS")) {
			imageView.setImageResource(R.drawable.book);
		}
		else if (s.equals(" SHOPPING")) {
			imageView.setImageResource(R.drawable.shop);
		}
		else if (s.equals("  TRAVEL")) {
			imageView.setImageResource(R.drawable.trav);
		}
		else if (s.equals("  STOCK")) {
			imageView.setImageResource(R.drawable.stock);
		}
		else if (s.equals("  FOOD")) {
			imageView.setImageResource(R.drawable.food);
		}
		else if (s.equals("MOVIES")) {
			imageView.setImageResource(R.drawable.movi);
		}
		else if (s.equals("SONGS")) {
			imageView.setImageResource(R.drawable.music);
		}else if (s.equals("AIRLINES")) {
			imageView.setImageResource(R.drawable.air);
		}else if (s.equals("CARS AND BUS")) {
			imageView.setImageResource(R.drawable.car);
		}
		else if (s.equals("  ENTERTAINMENT")) {
			imageView.setImageResource(R.drawable.movi);
		}
		else if (s.equals(" BLOGS")) {
			imageView.setImageResource(R.drawable.blog);
		}
		else if (s.equals(" EDUCATION")) {
			imageView.setImageResource(R.drawable.edu);
		}
		else if (s.equals(" ELECTRONICS")) {
			imageView.setImageResource(R.drawable.ele);
		}
		else if (s.equals(" GOVERNMENT")) {
			imageView.setImageResource(R.drawable.gov);
		}
		else if (s.equals(" JOBS")) {
			imageView.setImageResource(R.drawable.job);
		}
		else if (s.equals(" NEWS")) {
			imageView.setImageResource(R.drawable.news);
		}
		else if (s.equals(" SOCIAL NETWORK")) {
			imageView.setImageResource(R.drawable.social1);
		}
		else if (s.equals(" SPORTS")) {
			imageView.setImageResource(R.drawable.sport);
		}
		else if (s.equals("TOURISM")) {
			imageView.setImageResource(R.drawable.tou);
		}
		else if (s.equals(" NEWS")) {
			imageView.setImageResource(R.drawable.news);
		}
		else if (s.equals(" AUTOMOBILES")) {
			imageView.setImageResource(R.drawable.auto);
		}
		else if (s.equals(" BANKING")) {
			imageView.setImageResource(R.drawable.bank);
		}
		else if (s.equals(" DIAMONDS")) {
			imageView.setImageResource(R.drawable.diamond);
		}
		else if (s.equals(" MATRIMONY")) {
			imageView.setImageResource(R.drawable.mat);
		}
		else if (s.equals(" MODELLING")) {
			imageView.setImageResource(R.drawable.model);
		}
		else if (s.equals(" QUOTES")) {
			imageView.setImageResource(R.drawable.sn);
		}

 
		return rowView;
	}
}