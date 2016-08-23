package com.amap.navi.demo.activity;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.amap.navi.demo.R;
import com.amap.api.navi.AMapNaviViewOptions;

/**
 * 创建时间：16/2/24 18:50
 * 项目名称：newNaviDemoDebugSource
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class CustomCarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);

        AMapNaviViewOptions options = mAMapNaviView.getViewOptions();
        //// TODO: 16/3/2 最好有一个正经的示例图片
        options.setCarBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.b1));
        options.setFourCornersBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.lane00));
        mAMapNaviView.setViewOptions(options);
    }
}
