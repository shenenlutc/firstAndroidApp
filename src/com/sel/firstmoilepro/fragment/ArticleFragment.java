package com.sel.firstmoilepro.fragment;

import com.sel.firstmoilepro.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ArticleFragment extends Fragment {
	
	OnArticleCommunicate afCallback;
	
	public interface OnArticleCommunicate{
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		return inflater.inflate(R.layout.fragment_article,container,false);
		
	}
	
	
//	@Override
//	public void onAttach(Activity activity) {
//		// TODO Auto-generated method stub
//		super.onAttach(activity);
//		
//	}
	
	
}
