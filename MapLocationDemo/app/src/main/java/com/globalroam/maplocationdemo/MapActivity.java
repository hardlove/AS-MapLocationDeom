package com.globalroam.maplocationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.maps.MapView;
import com.globalroam.maplocationdemo.map.utils.LocationClientManager;

/**
 * Created by Administrator on 2016/8/23 0023.
 */
public class MapActivity extends AppCompatActivity {
    private static final String TAG = "MapActivity";

    private TextView back;
    private TextView title;
    private TextView send;
    private MapView mapView;
    private ImageView center;
    private LocationClientManager.OnLocationChangeCallBack onLocationChangeCallBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        initView();
        onLocationChangeCallBack = new LocationChangeCallBack();
        LocationClientManager.getInstance(this).registerOnLocationChangeCallBack(onLocationChangeCallBack);

    }

    private void initView() {
        back = (TextView) findViewById(R.id.back);
        title = (TextView) findViewById(R.id.title);
        send = (TextView) findViewById(R.id.send);
        mapView = (MapView) findViewById(R.id.mapView);
        center = (ImageView) findViewById(R.id.center);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocationClientManager.getInstance(this).unRegisterOnLocationChangeCallBack(onLocationChangeCallBack);
        mapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }



    class LocationChangeCallBack implements LocationClientManager.OnLocationChangeCallBack {
            @Override
            public void succeed(AMapLocation aMapLocation) {
                Log.i(TAG, "get location succeed." + aMapLocation.getLatitude() + "," + aMapLocation.getLongitude() + " adress:" + aMapLocation.getAddress());

            }

            @Override
            public void failed(int errorCode, String errorInfo) {
                Log.e(TAG, "get location failed. errorCode:" + errorCode + "  errorInfo:" + errorInfo);
            }

    }
}
