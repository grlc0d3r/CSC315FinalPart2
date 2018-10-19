package com.karynboyd.csc315finalpart2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    private static final String TAG = AboutActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void launchMainActivity(View view) {
        Log.d(TAG, "Button clicked!");
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
