package com.huang.drawerlayoutdemo;

import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        Button mainBtn = findViewById(R.id.main_btn);
        Button leftBtn = findViewById(R.id.left_btn);
        Button rightBtn = findViewById(R.id.right_btn);

        //点击主界面中的按钮弹出侧滑界面
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(Gravity.START);
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("huangcx", "leftBtn click");
                mDrawerLayout.closeDrawer(Gravity.START);
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("huangcx", "rightBtn click");
                mDrawerLayout.closeDrawer(Gravity.END);
            }
        });

        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                Log.d("huangcx", "DrawerLayout Open");
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
                Log.d("huangcx", "DrawerLayout Close");
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }
}
