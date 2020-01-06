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
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

	private Timer timer = new Timer();

	private ImageView imageview2;
	private ProgressBar progressbar3;

	private Intent Book = new Intent();
	private Calendar calen = Calendar.getInstance();
	private TimerTask time;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {

		imageview2 = (ImageView) findViewById(R.id.imageview2);
		progressbar3 = (ProgressBar) findViewById(R.id.progressbar3);
	}
	private void initializeLogic() {
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						Book.setClass(getApplicationContext(), BookActivity.class);
						startActivity(Book);
					}
				});
			}
		};
		timer.schedule(time, (int)(3000));
	}

	@Override
	public void onBackPressed() {
		finish();
	}
	private void _calender () {

	}

	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

}
