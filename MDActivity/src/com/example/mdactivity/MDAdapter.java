package com.example.mdactivity;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MDAdapter extends BaseAdapter{

	private Context context;
	private ArrayList<String> mlist;
	private LayoutInflater inflater;
	
	public MDAdapter(Context context,ArrayList<String> mlist)
	{
		this.context = context;
		this.mlist = mlist;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = inflater.inflate(R.layout.md_list_details, parent, false);
		TextView profileName = (TextView) convertView.findViewById(R.id.profileName);
		profileName.setText(mlist.get(position));
		
		return convertView;
	}

}
