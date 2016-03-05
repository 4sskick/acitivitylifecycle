package com.nightroomcreation.id.udemytutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textView = (TextView) findViewById(R.id.state);
        textView.setText("onCreate");
        Log.d("MAIN", "onCreate");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        textView.setText("onRestoreInstanceState");
        Log.d("MAIN", "onRestoreInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText("onRestoreInstanceState");
        Log.d("MAIN", "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setText("onResume");
        Log.d("MAIN", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText("onStart");
        Log.d("MAIN", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.setText("onRestart");
        Log.d("MAIN", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.setText("onDestroy");
        Log.d("MAIN", "onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        textView.setText("onPostResume");
        Log.d("MAIN", "onPostResume");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        textView.setText("onPostCreate");
        Log.d("MAIN", "onPostCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.setText("onStop");
        Log.d("MAIN", "onStop");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        textView.setText("onBackPressed");
        Log.d("MAIN", "onBackPressed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.setText("onPause");
        Log.d("MAIN", "onPause");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
