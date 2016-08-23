package com.amap.navi.demo.activity;

import android.os.Bundle;

import com.amap.api.navi.view.NextTurnTipView;
import com.amap.navi.demo.R;

/**
 * 创建时间：16/2/24 11:12
 * 项目名称：newNaviDemoDebugSource
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class CustomNextTurnTipViewActivity extends BaseActivity {

    private NextTurnTipView mNextTurnTipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //为了能最快的看到效果
        mStartLatlng = new com.amap.api.navi.model.NaviLatLng(39.92458861111111, 116.43543861111111);
        setContentView(R.layout.activity_custom_next_turn_tip_view);
        mAMapNaviView = (com.amap.api.navi.AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);

        //设置布局完全不可见
        com.amap.api.navi.AMapNaviViewOptions options = mAMapNaviView.getViewOptions();
        options.setLayoutVisible(false);
        mAMapNaviView.setViewOptions(options);

        mNextTurnTipView = (NextTurnTipView) findViewById(R.id.myDirectionView);
        mAMapNaviView.setLazyNextTurnTipView(mNextTurnTipView);
    }
}
