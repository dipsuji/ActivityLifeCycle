package com.activity.lifecycle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "Second Activity onCreate....................");
        Toast.makeText(this,"Second Activity onCreate..........", Toast.LENGTH_SHORT).show();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                finish();
        }
        return true;

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Second Activity onStart....................");
        Toast.makeText(this,"Second Activity onStart..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Second Activity onResume....................");
        Toast.makeText(this,"Second Activity onResume..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Second Activity onPause....................");
        Toast.makeText(this,"Second Activity onPause..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Second Activity onStop....................");
        Toast.makeText(this,"Second Activity onStop..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Second Activity onDestroy....................");
        Toast.makeText(this,"Second Activity onDestroy..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Second Activity onRestart....................");
        Toast.makeText(this,"Second Activity onRestart..........", Toast.LENGTH_SHORT).show();
    }

}
