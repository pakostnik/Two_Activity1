package com.ex.pakostnik.two_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Su.I.M. on 06.04.16.
 */
public class TestTwoActivity extends Activity{
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
    public void onClick(View view){
        intent = new Intent(TestTwoActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onSecond(View view) {
        intent = new Intent(TestTwoActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
