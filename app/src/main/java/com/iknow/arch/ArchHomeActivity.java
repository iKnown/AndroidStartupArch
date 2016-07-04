package com.iknow.arch;

import android.os.Bundle;

import com.iknow.arch.base.BaseActivity;
import com.iknow.arch.feature.home.IHome;

/**
 * @Author: J.Chou
 * @Email: who_know_me@163.com
 * @Created: 2016年05月10日 5:41 PM
 * @Description:
 */

public class ArchHomeActivity extends BaseActivity implements IHome {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arch_activity_layout);
    }
}
