package com.controller.obd.myobdapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.controller.obd.myobdapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReadCodeFragment extends Fragment {


    public ReadCodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_read_code, container, false);
    }

}
