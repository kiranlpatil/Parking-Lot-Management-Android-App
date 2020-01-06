package com.my.kiranpatil;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class ToastUtil {
public static void showMessage(Context _context, String _s) {
Toast.makeText(_context, _s, Toast.LENGTH_SHORT).show();
}

}