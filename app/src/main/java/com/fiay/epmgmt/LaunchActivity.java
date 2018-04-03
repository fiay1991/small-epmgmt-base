package com.fiay.epmgmt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import net.wequick.small.Small;

/**
 * APP项目总入口，负责调用APP插件
 */
public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Small.setUp(LaunchActivity.this, new net.wequick.small.Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Toast.makeText(LaunchActivity.this, "跳转到splashscreen", Toast.LENGTH_SHORT).show();
                Small.openUri("splash", LaunchActivity.this);
                killSelf();
            }
        });
    }

    /**
     * 关闭LaunchActivity
     */
    private void killSelf() {
        this.finish();
    }
}
