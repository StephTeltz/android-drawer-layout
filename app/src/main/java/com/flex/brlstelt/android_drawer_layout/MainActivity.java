package com.flex.brlstelt.android_drawer_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * TODO remove testing git branch
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiInit();
    }

    private void uiInit() {
        // Initialize your UI elements here
        TextView tv = (TextView) findViewById(R.id.text_view);
    }
}

/**
 * TODO optimizeForDeviceType()
 * detect device model, is device phone or tablet?
 * if device = phone, optimize layout for phone (i.e., hide the drawer)
 * if device != phone, optimize layout for tablet (i.e, lock the drawer)
 */
