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
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView =
                (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_search:
                        Intent searchIntent = new Intent(MainActivity.this,
                                SearchActivity.class);
                        break;
                    case R.id.ic_user_account:
                        Intent accountIntent = new Intent(MainActivity.this,
                                UserAccountActivity.class);
                        startActivity(accountIntent);
                        break;
                    case R.id.ic_favorites:
                        Intent favIntent = new Intent(MainActivity.this,
                                FavoritesActivity.class);
                        startActivity(favIntent);
                        break;
                }

                return false;
            }
        });
    }
}
