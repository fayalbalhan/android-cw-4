package com.example.gotcha.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.gotcha.R;


public class FragmentThree extends Fragment {



    public FragmentThree() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_three, container, false);
        EditText name = v.findViewById(R.id.FullName);
        EditText email = v.findViewById(R.id.Email);
        EditText address = v.findViewById(R.id.HomeAddress);
        EditText number = v.findViewById(R.id.PhoneNumber);

        


        return v;
    }
}