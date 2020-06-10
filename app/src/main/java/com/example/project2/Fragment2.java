package com.example.project2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class Fragment2 extends Fragment {
    int i=0;
    ImageView imageView = null;
    ArrayList<Integer> personImages;
    ButtonManager buttonManager;
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

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_2, container, false);
        imageView = root.findViewById(R.id.solo);
        imageView.setImageResource(personImages.get(i));

//        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerViewFrag2);
//        // set a LinearLayoutManager with default vertical orientation
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        //  call the constructor of CustomAdapter to send the reference and data to Adapter
//        CustomAdapter customAdapter = new CustomAdapter(getContext(), personImages);
//        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

        // Inflate the layout for this fragment
        return root;
    }

    public void onFragmentInteraction(String msg) {


        if(msg=="next"&&i<personImages.size())
        {
            i++;
            imageView.setImageResource(personImages.get(i));


        }
        if(msg=="previous"&&i!=0)
        {
            i--;
            imageView.setImageResource(personImages.get(i));
            if (i == 0) {
                buttonManager.statusChange("prevoff");
            }
            else buttonManager.statusChange("prevon");


        }
        if (i == personImages.size() - 1)
        {
            buttonManager.statusChange("nextoff");
        }
        else             buttonManager.statusChange("nexton");

        if (i == 0) {
            buttonManager.statusChange("prevoff");
        }
       else buttonManager.statusChange("prevon");

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            buttonManager = (ButtonManager) getActivity();

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onButtonPressed");
        }
    }
    //    public void onFragmentInteraction(String uri) {
//        m_lblMessage.setText(uri);
//    }

}
