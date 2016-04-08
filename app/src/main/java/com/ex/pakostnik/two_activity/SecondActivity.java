package com.ex.pakostnik.two_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);

        relativeLayout = (RelativeLayout)findViewById(R.id.second_activity);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_button_green:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case R.id.radio_button_yellow:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    case R.id.radio_button_red:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case R.id.radio_button_blue:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                }
            }
        });

    }



}
