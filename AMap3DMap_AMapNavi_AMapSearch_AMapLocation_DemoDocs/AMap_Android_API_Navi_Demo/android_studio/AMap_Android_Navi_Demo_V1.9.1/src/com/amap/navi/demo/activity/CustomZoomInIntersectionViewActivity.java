package com.amap.navi.demo.activity;

import android.os.Bundle;

import com.amap.api.navi.AMapNaviListener;
import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.AMapNaviViewOptions;
import com.amap.api.navi.view.ZoomInIntersectionView;
import com.amap.navi.demo.R;

/**
 * 创建时间：11/10/15 16:08
 * 项目名称：newNaviDemo
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class CustomZoomInIntersectionViewActivity extends BaseActivity implements AMapNaviListener {

    private ZoomInIntersectionView mZoomInIntersectionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_zoomin_intersection_view);
        mZoomInIntersectionView = (ZoomInIntersectionView) findViewById(R.id.myZoomInIntersectionView);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);

        //设置布局完全不可见
        AMapNaviViewOptions options = mAMapNaviView.getViewOptions();
        options.setLayoutVisible(false);
        mAMapNaviView.setViewOptions(options);

        mAMapNaviView.setLazyZoomInIntersectionView(mZoomInIntersectionView);
    }



}
