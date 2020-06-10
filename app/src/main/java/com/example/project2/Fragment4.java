package com.example.project2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {

    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.animal13,
            R.drawable.animal14, R.drawable.animal15,
            R.drawable.animal16, R.drawable.animal17,
            R.drawable.animal18, R.drawable.animal13,
            R.drawable.animal14, R.drawable.animal15,
            R.drawable.animal16, R.drawable.animal17,
            R.drawable.animal18));


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    // In fragment class onCreateView actually inflates the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Fragment is part of the Viewgroup of the main activity
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_4, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(getContext(),personImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

        return root;
    }

    @Override

    public void onAttach(Context context) {
        super.onAttach(context);
        try {

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onButtonPressed");
        }
    }}
