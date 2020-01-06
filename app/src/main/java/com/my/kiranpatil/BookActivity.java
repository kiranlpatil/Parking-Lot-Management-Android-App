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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import java.text.DecimalFormat;

public class BookActivity extends AppCompatActivity {

	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();

	private Toolbar _toolbar;
	private HashMap<String, Object> map = new HashMap<>();
	private boolean mum = false;
	private double numee = 0;
	private double limited = 0;
	private double tim = 0;
	private double costs = 0;
	private HashMap<String, Object> store = new HashMap<>();
	private String dat = "";
	private double exist = 0;
	private double n = 0;
	private double total = 0;
	private String count = "";

	private ArrayList<HashMap<String, Object>> Map = new ArrayList<>();
	private ArrayList<Double> number = new ArrayList<>();
	private ArrayList<String> num = new ArrayList<>();
	private ArrayList<Double> cost = new ArrayList<>();
	private ArrayList<String> str = new ArrayList<>();
	private ArrayList<String> stringstore = new ArrayList<>();
	private ArrayList<String> slots = new ArrayList<>();

	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private ListView listview1;
	private TextView textview1;
	private Button button20;
	private ImageView imageview1;
	private EditText edittext1;
	private TextView textview2;
	private TextView textview11;
	private Button button18;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private Button button19;
	private TextView textview10;
	private TextView textview4;
	private TextView textview9;

	private DatabaseReference firebase = _firebase.getReference("firebase");
	private ChildEventListener _firebase_child_listener;
	private Calendar cale = Calendar.getInstance();
	private TimerTask timer;
	private TimerTask tun;
	private Intent ne = new Intent();
	private AlertDialog.Builder dial;
	private SharedPreferences user123;
	private Vibrator vibr;
	private DatabaseReference storage = _firebase.getReference("history");
	private ChildEventListener _storage_child_listener;
	private Calendar cale2 = Calendar.getInstance();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.book);
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
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		listview1 = (ListView) findViewById(R.id.listview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		button20 = (Button) findViewById(R.id.button20);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview11 = (TextView) findViewById(R.id.textview11);
		button18 = (Button) findViewById(R.id.button18);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		button19 = (Button) findViewById(R.id.button19);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview9 = (TextView) findViewById(R.id.textview9);
		dial = new AlertDialog.Builder(this);
		user123 = getSharedPreferences("user", Activity.MODE_PRIVATE);
		vibr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

		button20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ne.setClass(getApplicationContext(), SlotActivity.class);
				startActivity(ne);
			}
		});

		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (edittext1.getText().toString().length() == 4) {
					if(textview11.getText().toString().equals("1")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("2")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("3")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("4")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("5")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("6")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("7")) {
						button18.setVisibility(View.VISIBLE);
					}
					if (textview11.getText().toString().equals("8")) {
						button18.setVisibility(View.VISIBLE);
					}
				}
				else {
					ToastUtil.showMessage(getApplicationContext(), "Min 4 Numbers ");
				}
			}

			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {

			}

			@Override
			public void afterTextChanged(Editable _param1) {

			}
		});

		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n = 0;
				exist = 0;
				for(int _rep = 0; _rep < (int)(Map.size()); _rep++) {
					if (Map.get((int)n).get("Slot No").toString().equals(textview11.getText().toString())) {
						textview4.setText("Requested slot is currently unavailable");
						ToastUtil.showMessage(getApplicationContext(), "Slot is currently Occupied");
						exist = 1;
					}
					n++;
				}
				if (exist == 0) {
					user123.edit().putString("exit", "1").commit();
					button19.setVisibility(View.VISIBLE);
					button18.setVisibility(View.INVISIBLE);
					map = new HashMap<>();
					map.put("Vehicle No", edittext1.getText().toString());
					user123.edit().putString("Data", edittext1.getText().toString()).commit();
					map.put("Slot No", textview11.getText().toString());
					firebase.push().updateChildren(map);
					textview4.setVisibility(View.VISIBLE);
					textview4.setText("Slots Still Available");
					tim = 0;
					costs = 1;
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									tim++;
									linear17.setVisibility(View.VISIBLE);
									textview6.setText(String.valueOf((long)(tim)));
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(timer, (int)(0), (int)(1000));
					tun = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									linear18.setVisibility(View.VISIBLE);
									textview8.setText(String.valueOf((tim / 60) * costs));
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(tun, (int)(0), (int)(1000));
					ToastUtil.showMessage(getApplicationContext(), "Your Slot has been allocated ");
					imageview1.setVisibility(View.GONE);
					button20.setVisibility(View.GONE);
					edittext1.setVisibility(View.GONE);
					cale = Calendar.getInstance();
					user123.edit().putString("fail", "1").commit();
					dat = new SimpleDateFormat("hh-mm-ss:dd-MM-yyyy").format(cale.getTime());
				}
			}
		});

		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				timer.cancel();
				tun.cancel();
				ne.setAction(Intent.ACTION_VIEW);
				ne.setClass(getApplicationContext(), PaymentActivity.class);
				ne.putExtra("time", textview6.getText().toString());
				ne.putExtra("cost", textview8.getText().toString());
				ne.putExtra("slot", textview11.getText().toString());
				user123.edit().putString("pay", "1").commit();
				vibr.vibrate((long)(300));
				startActivity(ne);
				store = new HashMap<>();
				store.put("Entry Time", dat);
				cale2 = Calendar.getInstance();
				store.put("Exit Time", new SimpleDateFormat("hh-mm-ss:dd-MM-yyyy").format(cale2.getTime()));
				store.put("Cost", textview8.getText().toString());
				store.put("Slot", textview11.getText().toString());
				store.put("Vehicle No", edittext1.getText().toString());
				storage.push().updateChildren(store);
				user123.edit().remove("fail").commit();
			}
		});

		_firebase_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				firebase.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						Map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								Map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						str.add(_childKey);
						listview1.setAdapter(new Listview1Adapter(Map));
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
				map.clear();
			}

			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {

			}

			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				firebase.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						Map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								Map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						listview1.setAdapter(new Listview1Adapter(Map));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}

			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();

			}
		};
		firebase.addChildEventListener(_firebase_child_listener);

		_storage_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {

			}

			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();

			}
		};
		storage.addChildEventListener(_storage_child_listener);
	}
	private void initializeLogic() {
		button18.setVisibility(View.INVISIBLE);
		linear17.setVisibility(View.INVISIBLE);
		linear18.setVisibility(View.INVISIBLE);
		button19.setVisibility(View.INVISIBLE);
		listview1.setVisibility(View.VISIBLE);
		InputFilter[] editFilters = edittext1.getFilters(); InputFilter[] newFilters = new InputFilter[editFilters.length + 1]; System.arraycopy(editFilters, 0, newFilters, 0, editFilters.length); newFilters[editFilters.length] = new InputFilter.LengthFilter(4); edittext1.setFilters(newFilters);
		textview11.setText(getIntent().getStringExtra("sl1"));
		if (user123.getString("fail", "").equals("1")) {
			dial.setCancelable(false);
			dial.setTitle("Earlier Payment Due ");
			dial.setMessage("Pay Fine + amount then proceed");
			dial.setPositiveButton("Pay and Proceed", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					user123.edit().remove("fail").commit();
					ToastUtil.showMessage(getApplicationContext(), "Fine Payment Successful");
				}
			});
			dial.setNegativeButton("Nope ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					finishAffinity();
				}
			});
			dial.create().show();
		}
	}

	@Override
	public void onBackPressed() {
		if (user123.getString("exit", "").equals("1")) {
			if (user123.getString("exit", "").equals(user123.getString("pay", ""))) {
				ToastUtil.showMessage(getApplicationContext(), "Delete Your Vehicle's Entry");
			}
			else {
				ToastUtil.showMessage(getApplicationContext(), "Please Proceed to Pay !!");
			}
		}
		else {
			vibr.vibrate((long)(300));
			dial.setCancelable(false);
			dial.setTitle("Want to Exit ?");
			dial.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					finishAffinity();
				}
			});
			dial.setNegativeButton("No ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					ToastUtil.showMessage(getApplicationContext(), "Again proceed booking slot");
				}
			});
			dial.create().show();
		}
	}

	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}

		@Override
		public int getCount() {
			return _data.size();
		}

		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}

		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.custom, null);
			}

			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			final TextView textview4 = (TextView) _v.findViewById(R.id.textview4);
			final LinearLayout linear3 = (LinearLayout) _v.findViewById(R.id.linear3);
			final ImageView imageview1 = (ImageView) _v.findViewById(R.id.imageview1);

			textview1.setText(Map.get((int)_position).get("Vehicle No").toString());
			textview4.setText(Map.get((int)_position).get("Slot No").toString());
			if (user123.getString("pay", "").equals("1")) {
				imageview1.setVisibility(View.VISIBLE);
				imageview1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if (textview1.getText().toString().equals(user123.getString("Data", ""))) {
							firebase.child(str.get((int)(_position))).removeValue();
							str.remove((int)(_position));
							user123.edit().remove("pay").commit();
							user123.edit().remove("Data").commit();
							user123.edit().remove("exit").commit();
						}
						else {
							dial.setTitle("!!  Access Denied  !!");
							dial.create().show();
						}
					}
				});
			}
			else {
				imageview1.setVisibility(View.INVISIBLE);
			}

			return _v;
		}
	}

}
