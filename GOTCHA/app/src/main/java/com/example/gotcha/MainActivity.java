package com.example.gotcha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.VP);
        TabLayout tl = findViewById(R.id.TL);
        // Connecting the viewpager with the tabLayout
        tl.setupWithViewPager(vp);

        //Declaring the adapter
        FragmentAdapter Adapter = new FragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(Adapter);

        // Add Icons
        tl.getTabAt(0).setIcon(R.drawable.ic_coffee_shop);
        tl.getTabAt(1).setIcon(R.drawable.coffeebag);
        tl.getTabAt(2).setIcon(R.drawable.ic_user);



    }
}