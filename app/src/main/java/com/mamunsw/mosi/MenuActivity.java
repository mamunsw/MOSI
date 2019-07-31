package com.mamunsw.mosi;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.mamunsw.mosi.Fragment.ComingsoonFragment;
import com.mamunsw.mosi.Fragment.MovieFragment;
import com.mamunsw.mosi.Fragment.NewsFragment;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navBottom = findViewById(R.id.home_bar);
        navBottom.setOnNavigationItemSelectedListener(navListen);
        getSupportFragmentManager().beginTransaction().replace(R.id.fram_home, new NewsFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListen = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.home_nav:
                    selectedFragment = new NewsFragment();
                    break;

                case R.id.movie_nav:
                    selectedFragment = new MovieFragment();
                    break;
                case R.id.soon_nav:
                    selectedFragment = new ComingsoonFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fram_home, selectedFragment).commit();

            return true;

        }

    };
    }

