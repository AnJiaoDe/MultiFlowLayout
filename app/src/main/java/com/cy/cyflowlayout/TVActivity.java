package com.cy.cyflowlayout;

import android.os.Bundle;
import android.view.View;

import com.cy.cyflowlayoutlibrary.FlowLayout;
import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;

import java.util.ArrayList;
import java.util.List;

public class TVActivity extends BaseActivity {

    private FlowLayoutAdapter<String> flowLayoutAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);
        List<String> list=new ArrayList<>();
            list.add("环境");
            list.add("环境");
            list.add("如果皇太后");
            list.add("人皇太后");
            list.add("环境");
            list.add("然后");
            list.add("环境");
            list.add("环境");
            list.add("然后钛合金");
            list.add("环境");
            list.add("任何人挺好");
            list.add("环境");
            list.add("发个黄庭坚");
            list.add("环境");
            list.add("分分然后");
            list.add("环境");
            list.add("环境");
            list.add("凤凰台和");
            list.add("环境");
            list.add("环境");
            list.add("环境");
            list.add("发个荣誉感");
            list.add("环境");
            list.add("复合肥");
            list.add("环境");
            list.add("发然后");
            list.add("环的风格让他很认同和境");
            list.add("的富贵华庭");
            list.add("的富");
        flowLayoutAdapter=new FlowLayoutAdapter<String>(list) {
            @Override
            public void bindDataToView(ViewHolder holder, int position, String bean) {
                holder.setText(R.id.tv,bean);
            }

            @Override
            public void onItemClick(int position, String bean) {

                showToast("点击"+position);
            }

            @Override
            public int getItemLayoutID(int position, String bean) {
                return R.layout.item_tv;
            }
        };
        ((FlowLayout)findViewById(R.id.fl)).setAdapter(flowLayoutAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}
