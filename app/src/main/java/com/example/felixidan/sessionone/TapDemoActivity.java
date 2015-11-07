package com.example.felixidan.sessionone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class TapDemoActivity extends ActionBarActivity {

    TextView display;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_demo);

        display = (TextView)findViewById(R.id.tapdemo_display);
    }

    public void increaseCounter(View view) {
        counter++;
        display.setText(Integer.toHexString(counter));
    }
}
