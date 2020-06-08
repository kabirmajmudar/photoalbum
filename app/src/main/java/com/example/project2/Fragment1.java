package com.example.project2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class Fragment1 extends Fragment {


    Button next,previous = null;
    CheckBox slideshow,galleryview;
    OnButtonPressListener buttonListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    // In fragment class onCreateView actually inflates the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Fragment is part of the Viewgroup of the main activity
        // Inflate the layout for this fragment
        ViewGroup  root =  (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);
        next=root.findViewById(R.id.nextImage);
        previous=root.findViewById(R.id.previousImage);
        slideshow=root.findViewById(R.id.slideShow);
        galleryview=root.findViewById(R.id.galleryView);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener.onButtonPressListener("next");
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener.onButtonPressListener("previous");
            }
        });


        return root;
    }


    @Override

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            buttonListener = (OnButtonPressListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onButtonPressed");
        }



}}
