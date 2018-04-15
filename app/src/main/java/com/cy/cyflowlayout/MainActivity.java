package com.cy.cyflowlayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_tv).setOnClickListener(this);
        findViewById(R.id.btn_tv_scroll).setOnClickListener(this);
        findViewById(R.id.btn_layout_scroll).setOnClickListener(this);
        findViewById(R.id.btn_layout__multi_scroll).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tv:
                startAppcompatActivity(TVActivity.class);
                break;
            case R.id.btn_tv_scroll:
                startAppcompatActivity(TVScrollActivity.class);

                break;
            case R.id.btn_layout_scroll:
                startAppcompatActivity(LayoutScrollActivity.class);

                break;
            case R.id.btn_layout__multi_scroll:
                startAppcompatActivity(LayoutMultiScrollActivity.class);

                break;
        }
    }
}
