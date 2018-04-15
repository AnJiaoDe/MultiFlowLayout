[CSDN](https://blog.csdn.net/confusing_awakening/article/details/79951308)

[APK下载](https://github.com/AnJiaoDe/MultiFlowLayout/tree/master/app/build/outputs/apk)

如有任何问题或者是建议，可以QQ群:安娇德IT技术交流群757173381讨论，开源库会根据需求持续更新。

**使用方法**

将libray模块复制到项目中,或者直接在build.gradle中依赖:

```
allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
```

```
dependencies {
	        compile 'com.github.AnJiaoDe:MultiFlowLayout:1.1.1'
	}
```

**1.TextView**

![这里写图片描述](https://img-blog.csdn.net/20180415175125404?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvbmZ1c2luZ19hd2FrZW5pbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

```
<?xml version="1.0" encoding="utf-8"?>
<com.cy.cyflowlayoutlibrary.FlowLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/fl"
    android:layout_width="match_parent"
    app:width_space="10dp"//宽间距
    app:height_space="10dp"//高间距
    android:padding="10dp"
    android:layout_height="400dp">

</com.cy.cyflowlayoutlibrary.FlowLayout>

```

```
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

```
**2.TextView+Scroll**


![这里写图片描述](https://img-blog.csdn.net/20180415175440996?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvbmZ1c2luZ19hd2FrZW5pbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

```
<?xml version="1.0" encoding="utf-8"?>
<com.cy.cyflowlayoutlibrary.FlowLayoutScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/flsv"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    app:height_space="10dp"
    app:width_space="10dp">

</com.cy.cyflowlayoutlibrary.FlowLayoutScrollView>

```

```
package com.cy.cyflowlayout;

import android.os.Bundle;
import android.view.View;

import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;
import com.cy.cyflowlayoutlibrary.FlowLayoutScrollView;

import java.util.ArrayList;
import java.util.List;

public class TVScrollActivity extends BaseActivity {
    private FlowLayoutAdapter<String> flowLayoutAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvscroll);
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
        ((FlowLayoutScrollView)findViewById(R.id.flsv)).setAdapter(flowLayoutAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}

```
**3.layout+scroll+remove+add**

![这里写图片描述](https://img-blog.csdn.net/20180415175648221?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvbmZ1c2luZ19hd2FrZW5pbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

```
<?xml version="1.0" encoding="utf-8"?>
<com.cy.cyflowlayoutlibrary.FlowLayoutScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/flsv"
    android:padding="6dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</com.cy.cyflowlayoutlibrary.FlowLayoutScrollView>

```

```
package com.cy.cyflowlayout;

import android.os.Bundle;
import android.view.View;

import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;
import com.cy.cyflowlayoutlibrary.FlowLayoutScrollView;

import java.util.ArrayList;
import java.util.List;

public class LayoutScrollActivity extends BaseActivity {
    private FlowLayoutAdapter<String> flowLayoutAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

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
        flowLayoutAdapter = new FlowLayoutAdapter<String>(list) {
            @Override
            public void bindDataToView(ViewHolder holder, int position, String bean) {

                holder.setText(R.id.tv,bean);
            }

            @Override
            public void onItemClick(int position, String bean) {

                remove(position);

            }

            @Override
            public int getItemLayoutID(int position, String bean) {
                return R.layout.item_layout;
            }
        };
        ((FlowLayoutScrollView)findViewById(R.id.flsv)).setAdapter(flowLayoutAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}

```

**4.layout+multi+scroll+remove+add**


![这里写图片描述](https://img-blog.csdn.net/20180415175804558?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvbmZ1c2luZ19hd2FrZW5pbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

```
<?xml version="1.0" encoding="utf-8"?>
<com.cy.cyflowlayoutlibrary.FlowLayoutScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/flsv"
    android:padding="6dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</com.cy.cyflowlayoutlibrary.FlowLayoutScrollView>

```

```
package com.cy.cyflowlayout;

import android.os.Bundle;
import android.view.View;

import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;
import com.cy.cyflowlayoutlibrary.FlowLayoutScrollView;

import java.util.ArrayList;
import java.util.List;

public class LayoutMultiScrollActivity extends BaseActivity {
    private FlowLayoutAdapter<String> flowLayoutAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_multi_scroll);

        List<String> list=new ArrayList<>();
        list.add("会囧哥");
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
        flowLayoutAdapter = new FlowLayoutAdapter<String>(list) {
            @Override
            public void bindDataToView(ViewHolder holder, int position, String bean) {

                holder.setText(R.id.tv,bean);


            }

            @Override
            public void onItemClick(int position, String bean) {

                if (position==0||position==1||position==2){

                    return;
                }
                remove(position);

            }

            @Override
            public int getItemLayoutID(int position, String bean) {
                if (position==0||position==1||position==2){
                    return R.layout.item_layout2;
                }
                return R.layout.item_layout;
            }
        };
        ((FlowLayoutScrollView)findViewById(R.id.flsv)).setAdapter(flowLayoutAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}

```

 
 参考：[Android 自定义控件](https://blog.csdn.net/confusing_awakening/article/category/6994167)
