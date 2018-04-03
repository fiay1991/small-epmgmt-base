package com.fiay.epmgmt;

import android.app.Application;

import net.wequick.small.Small;

/**
 * 自定义Application用于加载Small框架
 */
public class EPMgmtApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }

}
