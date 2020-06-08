package com.example.project2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class Fragment2 extends Fragment {

    ImageView imageView = null;
    ArrayList<Integer> personImages;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        personImages = new ArrayList<>(Arrays.asList(R.drawable.animal13,
                R.drawable.animal14, R.drawable.animal15,
                R.drawable.animal16, R.drawable.animal17,
                R.drawable.animal18, R.drawable.animal13,
                R.drawable.animal14, R.drawable.animal15,
                R.drawable.animal16, R.drawable.animal17,
                R.drawable.animal18));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        ViewGroup  root = (ViewGroup) inflater.inflate(R.layout.fragment_2, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerViewFrag2);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(getContext(), personImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

        // Inflate the layout for this fragment
        return root;
    }


//    public void onFragmentInteraction(String uri) {
//        m_lblMessage.setText(uri);
//    }

}
