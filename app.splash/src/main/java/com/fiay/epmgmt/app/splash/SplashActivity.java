package com.fiay.epmgmt.app.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        TextView tv = (TextView) findViewById(R.id.textView);
        iv.setImageResource(R.drawable.miao);
        tv.setText(R.string.asset_app_name);
    }
}
