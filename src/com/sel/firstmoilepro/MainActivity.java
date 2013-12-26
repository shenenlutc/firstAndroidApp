package com.sel.firstmoilepro;

import com.sel.firstmoilepro.fragment.ArticleFragment;
import com.sel.firstmoilepro.fragment.HeadFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	public final static String EXTRA_MESSAGE="EXTRA_message";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_container);
		
		//TextView tv=(TextView)findViewById(R.id.tvArticle);
		//tv.setText("When you add a fragment [2013-12-26 16:01:15 - FirstMoilePro] adb is running normally");
		
		if(findViewById(R.id.fragment_container)!=null){
			if(savedInstanceState!=null){
				return;
			}
			HeadFragment hf=new HeadFragment();
			hf.setArguments(getIntent().getExtras());
			getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,hf).commit();
		}
		getSupportActionBar().setDisplayHomeAsUpEnabled(false);
		
	}
	
	
	public void changeFragment(View view){
		ArticleFragment af=new ArticleFragment();
		FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.fragment_container, af);
		ft.addToBackStack(null);
		ft.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main_activity_menu, menu);
		
		MenuItem settingsItem=menu.findItem(R.id.action_settings);
		MenuItem settingsItem1=menu.findItem(R.id.action_settings1);
		MenuItem settingsItem2=menu.findItem(R.id.action_settings2);
		MenuItem settingsItem3=menu.findItem(R.id.action_settings3);
		MenuItem settingsItem4=menu.findItem(R.id.action_settings4);
		//MenuItem searchItem=menu.findItem(R.id.action_search);
		//MenuItemCompat.setShowAsAction(searchItem,MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
		MenuItemCompat.setShowAsAction(settingsItem, MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
		MenuItemCompat.setShowAsAction(settingsItem1, MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		MenuItemCompat.setShowAsAction(settingsItem2, MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		MenuItemCompat.setShowAsAction(settingsItem3, MenuItemCompat.SHOW_AS_ACTION_NEVER);
		MenuItemCompat.setShowAsAction(settingsItem4, MenuItemCompat.SHOW_AS_ACTION_NEVER);
		return super.onCreateOptionsMenu(menu);
	}
	
	public void sendMessage(View view){
		Intent i=new Intent(this, MessageHandleActivity.class);
		EditText et=(EditText)findViewById(R.id.etMessage);
		String message=et.getText().toString();
		if(message.equals("")){
			message=et.getHint().toString();
		}
		//Log.v("message", String.valueOf(et.getText().toString().equals("")));
		i.putExtra(EXTRA_MESSAGE,message);
		startActivity(i);	
	}

}
