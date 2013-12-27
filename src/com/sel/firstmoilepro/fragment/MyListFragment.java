package com.sel.firstmoilepro.fragment;



import com.sel.firstmoilepro.R;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class MyListFragment extends ListFragment {
	
	String[] arr={
		"andy",
		"bily",
		
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_list, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		this.setListAdapter(new ArrayAdapter<String>(
				getActivity(),android.R.layout.simple_list_item_1,arr));
		super.onCreate(savedInstanceState);
	}
}
