package com.my.kiranpatil;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;

public class SlotActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private TextView textview1;
	private ImageView imageview1;
	private ImageView imageview2;
	private TextView textview4;
	private TextView textview5;
	private ImageView imageview3;
	private ImageView imageview4;
	private TextView textview6;
	private TextView textview8;
	private ImageView imageview5;
	private ImageView imageview6;
	private TextView textview10;
	private TextView textview9;
	private ImageView imageview7;
	private ImageView imageview8;
	private TextView textview11;
	private TextView textview13;
	private TextView textview15;
	
	private Intent slot = new Intent();
	private SharedPreferences data;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.slot);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview15 = (TextView) findViewById(R.id.textview15);
		data = getSharedPreferences("dat", Activity.MODE_PRIVATE);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "1");
				startActivity(slot);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "2");
				startActivity(slot);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "3");
				startActivity(slot);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "4");
				startActivity(slot);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "5");
				startActivity(slot);
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "6");
				startActivity(slot);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "7");
				startActivity(slot);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot.setClass(getApplicationContext(), BookActivity.class);
				slot.setAction(Intent.ACTION_VIEW);
				slot.putExtra("sl1", "8");
				startActivity(slot);
			}
		});
	}
	private void initializeLogic() {
	}

}
