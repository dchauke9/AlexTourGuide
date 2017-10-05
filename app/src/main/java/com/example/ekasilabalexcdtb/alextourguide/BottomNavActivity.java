package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class BottomNavActivity extends AppCompatActivity {
    View view;
    Context context = this;
    LayoutInflater layoutInflater = null;
    FrameLayout content;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    view = null;
                    content.removeAllViews();

                    layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_public,null);

                    content.addView(view);
                    return true;
                case R.id.navigation_dashboard:
                    view = null;
                    content.removeAllViews();

                    layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_shop,null);

                    content.addView(view);
                    return true;
                case R.id.navigation_notifications:
                    view = null;
                    content.removeAllViews();

                    layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_corporate_firm,null);

                    content.addView(view);
                    return true;
                case R.id.navigation_manage:
                    view = null;
                    content.removeAllViews();

                    layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_entertainment,null);

                    content.addView(view);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        content = (FrameLayout) findViewById(R.id.content);
        view = null;
        layoutInflater = null;
        content.removeAllViews();
    }

}
