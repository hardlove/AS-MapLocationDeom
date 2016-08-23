package com.amap.navi.demo.activity;

import android.os.Bundle;

import com.amap.api.navi.view.TrafficButtonView;
import com.amap.navi.demo.R;

/**
 * 创建时间：16/2/24 18:50
 * 项目名称：newNaviDemoDebugSource
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class CustomTrafficButtonViewActivity extends BaseActivity {


    private TrafficButtonView mTrafficButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_traffic_button_view);
        mTrafficButtonView = (TrafficButtonView) findViewById(R.id.myTrafficButtonView);
        mAMapNaviView = (com.amap.api.navi.AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);

        //设置布局完全不可见
        com.amap.api.navi.AMapNaviViewOptions options = mAMapNaviView.getViewOptions();
        options.setLayoutVisible(false);
        mAMapNaviView.setViewOptions(options);

        mAMapNaviView.setLazyTrafficButtonView(mTrafficButtonView);
    }
}
