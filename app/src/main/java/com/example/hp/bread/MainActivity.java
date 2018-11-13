package com.example.hp.bread;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
        implements
        Search.OnFragmentInteractionListener,
        Favorites.OnFragmentInteractionListener,
        Account.OnFragmentInteractionListener {

    @Override
    public void onFragmentInteraction(Uri uri) {
        //leave empty
    }

    private BottomNavigationView mainNav;
    private FrameLayout mainFrame;

    private Search searchFragment;
    private Account accountFragment;
    private Favorites favoritesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainNav = (BottomNavigationView) findViewById(R.id.main_nav);
        mainFrame = (FrameLayout) findViewById(R.id.main_frame);

        searchFragment = new Search();
        accountFragment = new Account();
        favoritesFragment = new Favorites();

        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.nav_search :
                        setFragment(searchFragment);
                        return true;

                    case R.id.nav_account :
                        setFragment(accountFragment);
                        return true;

                    case R.id.nav_favorites :
                        setFragment(favoritesFragment);
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(android.support.v4.app.Fragment fragment) {
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
