package com.example.ashwinjoseph.navbar;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl=(DrawerLayout)findViewById(R.id.dl);
        abdt=new ActionBarDrawerToggle(this,dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view=(NavigationView)findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();

                  if(id==R.id.myprofile)
                  {
                      Toast.makeText(MainActivity.this, "MyProfile", Toast.LENGTH_SHORT).show();
                  }
                  else  if(id==R.id.settings)
                  {
                      Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                  }
                  else  if(id==R.id.editprofile)
                  {
                      Toast.makeText(MainActivity.this, "Edit Profile", Toast.LENGTH_SHORT).show();
                  }

                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
