package com.controller.obd.myobdapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.controller.obd.myobdapp.Adapters.HomeAdapter;
import com.controller.obd.myobdapp.Items.GenericItem;
import com.controller.obd.myobdapp.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    public ListView home_list;
    public Fragment fragment = null;
    public Class fragmentClass = null;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        home_list = (ListView) view.findViewById(R.id.home_list);

        List items = new ArrayList();

        int status = 1; //Identifica el icono adecuado
        int data = 0; //Lectura
        items.add(new GenericItem(status,"Readiness Code","Monitoring testing",data));
        items.add(new GenericItem(status,"Trouble Codes","Read description",data));
        items.add(new GenericItem(status,"Freeze Frame","Saved data frame",data));
        items.add(new GenericItem(status,"Terminal","Advanced Users",data));

        home_list.setAdapter(new HomeAdapter(view.getContext(),items));

        home_list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view,
                                    int position, long arg) {

                switch (position){
                    case 0:
                        Toast.makeText(view.getContext(),"Posición 0",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(view.getContext(),"Posición 1",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(view.getContext(),"Posición 2",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(view.getContext(),"Posición 3",Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });

        return view;
    }

}
