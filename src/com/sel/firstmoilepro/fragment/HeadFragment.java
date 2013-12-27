package com.sel.firstmoilepro.fragment;

import com.sel.firstmoilepro.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HeadFragment extends Fragment {

	OnHeadSelectedListener mCallback;
	
	public interface OnHeadSelectedListener{
		public void onArticleSelected();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_head, container,false);
	}
	
	
//	@Override
//	public void onAttach(Activity activity) {
//		// TODO Auto-generated method stub
//		super.onAttach(activity);
//		
//		try{
//			mCallback=(OnHeadSelectedListener)activity;
//		}catch(ClassCastException cce){
//			throw new ClassCastException(activity.toString()+"must implement OnHeadSelectedListener");
//		}
//	}
	
	
	
	
}
