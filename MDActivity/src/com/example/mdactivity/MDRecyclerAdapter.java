package com.example.mdactivity;

import java.util.ArrayList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MDRecyclerAdapter extends RecyclerView.Adapter<MDRecyclerAdapter.ViewHolder>{

	private Context context;
	private ArrayList<String> mlist;
	
	public MDRecyclerAdapter(Context context,ArrayList<String> mlist)
	{
		this.context = context;
		this.mlist = mlist;
	}
	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public void onBindViewHolder(ViewHolder viewHolder, int i) {
		// TODO Auto-generated method stub
		viewHolder.profileName.setText(mlist.get(i));
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
		// TODO Auto-generated method stub
		View v = LayoutInflater.from(context).inflate(R.layout.md_list_details, viewGroup, false);
        
//		v.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				mlist.remove(i);
//				Toast.makeText(context, "position : "+i+ " has been deleted", Toast.LENGTH_SHORT).show();
//				notifyDataSetChanged();
//			}
//		});
		
		return new ViewHolder(v);
	}



	public static class ViewHolder extends RecyclerView.ViewHolder {
		public TextView profileName;
		public ImageView profileImage;

		public ViewHolder(View itemView) {
			super(itemView);
			profileName = (TextView) itemView.findViewById(R.id.profileName);
			profileImage = (ImageView)itemView.findViewById(R.id.profile);
		}

	}
}


