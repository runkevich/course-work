package com.apteka.pharmacy.activity;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.apteka.pharmacy.R;

public class MainActivity extends AppCompatActivity{

        private FragmentManager fragmentManager;
        private Fragment fragment;
        private FragmentTransaction fragmentTransaction;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragment = new FirstHelp();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem item) {
                    int id = item.getItemId();
                    if (id == R.id.nav_first_help) {
                        fragment = new FirstHelp();
                    } else if (id == R.id.nav_check_simptom) {
                        fragment = new CheckSimptom();
                    } else if (id == R.id.nav_tel) {
                        fragment = new TelephoneNumber();
                    }else if (id == R.id.nav_about_us) {
                        fragment = new AboutUs();
                    }
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.content_main, fragment);
                    transaction.commit();
                    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                    assert drawer != null;
                    drawer.closeDrawer(GravityCompat.START);
                    return true;
                }
            });
        }
        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            getMenuInflater().inflate(R.menu.main_recipe, menu);
//            return true;
//        }
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            int id = item.getItemId();
//            //noinspection SimplifiableIfStatement
//            if (id == R.id.action_settings) {
//                return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }
}
