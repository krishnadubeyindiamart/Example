package com.example.mdactivity;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MDActivity extends Activity implements OnClickListener{

	private ListView mlv;
	private MDAdapter adapter;
	private ArrayList<String> mlist;
	private MDRecyclerAdapter recycleradapter;
	private RecyclerView mRecyclerView;
	private Button btn;
	private boolean flag = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.md_recycle);
		
		//mlv = (ListView) findViewById(R.id.list_md);
		
		mlist = new ArrayList<String>();
		for(int i=0;i<20;i++)
		{
			mlist.add("KRISHNA");
		}
		
		btn = (Button) findViewById(R.id.showView);
		
		
		mRecyclerView = (RecyclerView)findViewById(R.id.list_Recycler);
		//
		mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));//for gridView
	    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
		
		recycleradapter = new MDRecyclerAdapter(MDActivity.this, mlist);
		mRecyclerView.setAdapter(recycleradapter);
		//adapter = new MDAdapter(MDActivity.this, mlist);
		//mlv.setAdapter(adapter);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.showView:
			if(flag)
			{
				mRecyclerView.setLayoutManager(new LinearLayoutManager(this));//for listView
				mRecyclerView.setItemAnimator(new DefaultItemAnimator());
			    flag = false;
			    btn.setText("ListView");
			}else{
				mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));//for gridView
			    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
			    
				flag = true;
			    btn.setText("GridView");
			}
			break;

		default:
			break;
		}
		
	}
}
