package com.amap.navi.demo.activity;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.AMapNaviViewOptions;
import com.amap.navi.demo.R;
import com.amap.api.navi.model.RouteOverlayOptions;

/**
 * 创建时间：16/2/24 18:50
 * 项目名称：newNaviDemoDebugSource
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */
public class CustomRouteTextureInAMapNaviViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);

        //设置布局完全不可见
        AMapNaviViewOptions options = mAMapNaviView.getViewOptions();

        RouteOverlayOptions routeOverlayOptions = new RouteOverlayOptions();

        routeOverlayOptions.setArrowOnTrafficRoute(BitmapFactory.decodeResource(getResources(),R.drawable.custtexture_aolr));
        routeOverlayOptions.setNormalRoute(BitmapFactory.decodeResource(getResources(), R.drawable.custtexture));

        routeOverlayOptions.setUnknownTraffic(BitmapFactory.decodeResource(getResources(),R.drawable.custtexture_no));
        routeOverlayOptions.setSmoothTraffic(BitmapFactory.decodeResource(getResources(), R.drawable.custtexture_green));
        routeOverlayOptions.setSlowTraffic(BitmapFactory.decodeResource(getResources(), R.drawable.custtexture_slow));
        routeOverlayOptions.setJamTraffic(BitmapFactory.decodeResource(getResources(), R.drawable.custtexture_bad));
        routeOverlayOptions.setVeryJamTraffic(BitmapFactory.decodeResource(getResources(), R.drawable.custtexture_grayred));
        options.setRouteOverlayOptions(routeOverlayOptions);

        mAMapNaviView.setViewOptions(options);

    }
}
