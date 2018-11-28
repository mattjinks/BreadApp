package com.example.hp.bread;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView loadingScreen = (ImageView) findViewById(R.id.loading_icon);
        loadingScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchResultsIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(searchResultsIntent);
            }
        });
    }
}
