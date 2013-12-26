package com.sel.firstmoilepro;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.TextView;

public class MessageHandleActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		Intent i=getIntent();
		String message=i.getStringExtra(MainActivity.EXTRA_MESSAGE);
		TextView tv=new TextView(this);
		
		tv.setTextSize(40);
		tv.setText(message);
		setContentView(tv);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.message_handle_activity_menu, menu);
		return true;
	}
	
	

}
