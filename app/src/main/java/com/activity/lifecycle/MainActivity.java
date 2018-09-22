package com.activity.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "First Activity onCreate....................");
        Toast.makeText(this,"First Activity onCreate..........", Toast.LENGTH_SHORT).show();

        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start new activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "First Activity onStart....................");
        Toast.makeText(this,"First Activity onStart..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "First Activity onResume....................");
        Toast.makeText(this,"First Activity onResume..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "First Activity onPause....................");
        Toast.makeText(this,"First Activity onPause..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "First Activity onStop....................");
        Toast.makeText(this,"First Activity onStop..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "First Activity onDestroy....................");
        Toast.makeText(this,"First Activity onDestroy..........", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "First Activity onRestart....................");
        Toast.makeText(this,"First Activity onRestart..........", Toast.LENGTH_SHORT).show();
    }

}
