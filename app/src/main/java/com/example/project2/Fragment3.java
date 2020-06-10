package com.example.project2;

import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
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

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_3, container, false);
        imageView = root.findViewById(R.id.slideShow);
        AnimationDrawable animationDrawable=(AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();
//        for (int i = 0; i < personImages.size(); i++)
//        {
//            imageView.setImageResource(personImages.get(i));
//
//        }

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



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters






}
