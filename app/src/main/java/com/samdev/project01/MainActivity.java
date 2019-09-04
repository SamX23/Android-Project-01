package com.samdev.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.samdev.project01.option_menu.AboutUs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text) {
        Log.d(HOME_ACTIVITY_TAG, text);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("onCreate");
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.But01);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.But02);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.But03);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.But04);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.But05);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.But01:
                break;
            case R.id.But02:
                break;
            case R.id.But03:
                break;
            case R.id.But04:
                break;
            case R.id.But05:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onRestart() {

        super.onRestart();//call to restart after onStop

        showLog("onRestart");

    }

    @Override
    protected void onStart() {

        super.onStart();//soon be visible

        showLog("onStart");

    }

    @Override
    protected void onResume() {

        super.onResume();//visible

        showLog("onResume");

    }

    @Override
    protected void onPause() {

        super.onPause();//invisible

        showLog("onPause");

    }

    @Override
    protected void onStop() {

        super.onStop();

        showLog("onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
        showLog("onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.option_1) {
            return true;
        }
        if (id == R.id.option_2) {
            return true;
        }
        if (id == R.id.option_3) {
            return true;
        }
        if (id == R.id.about_us) {
            Intent about_us = new Intent(this, AboutUs.class);
            this.startActivity(about_us);
            return true;
        }

        if (id == R.id.keluar) {
            onDestroy();
        }
        return super.onOptionsItemSelected(item);
    }
}