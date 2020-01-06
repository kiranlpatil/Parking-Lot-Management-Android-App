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
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {

	private Timer timer = new Timer();

	private Toolbar toolbar;
	private double tie = 0;
	private String str = "";

	private TextView textview3;
	private TextView textview5;
	private TextView textview7;
	private Button button1;

	private AlertDialog.Builder dial;
	private Intent go = new Intent();
	private TimerTask Tim;
	private Vibrator vib;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.payment);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {

		toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		textview3 = (TextView) findViewById(R.id.textview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview7 = (TextView) findViewById(R.id.textview7);
		button1 = (Button) findViewById(R.id.button1);
		dial = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dial.setCancelable(false);
				dial.setTitle("Payment Successful");
				dial.setMessage("Redirecting back to home page\nNow you can delete your entry slot");
				dial.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						go.setClass(getApplicationContext(), BookActivity.class);
						startActivity(go);
					}
				});
				dial.create().show();
				Tim = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								vib.vibrate((long)(300));
								ToastUtil.showMessage(getApplicationContext(), "YOU  ARE  PERMITTED  TO  DELETE  ONLY  YOUR  ENTRY ");
							}
						});
					}
				};
				timer.schedule(Tim, (int)(1000));
			}
		});
	}
	private void initializeLogic() {
		textview3.setText(String.valueOf((long)(Double.parseDouble(getIntent().getStringExtra("time")) / 60)).concat("  min."));
		textview5.setText(getIntent().getStringExtra("cost").concat("  Rs. "));
		textview7.setText(getIntent().getStringExtra("slot"));
		//android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.GREEN}), new android.graphics.drawable.ColorDrawable(Color.WHITE), null); button1.setBackground(ripdr);
	}

	@Override
	public void onBackPressed() {
		ToastUtil.showMessage(getApplicationContext(), "Pay and Exit");
	}

}
