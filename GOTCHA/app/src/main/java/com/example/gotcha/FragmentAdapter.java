package com.example.gotcha;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gotcha.Fragments.FragmentOne;
import com.example.gotcha.Fragments.FragmentThree;
import com.example.gotcha.Fragments.FragmentTwo;

public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
      switch (position){
          case 0:
              return new FragmentOne();
          case 1:
              return new FragmentTwo();
          case 2:
              return new FragmentThree();
      }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
