package com.example.project2;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {


    ArrayList<Integer> personImages;
    Context context;

    public CustomAdapter(Context context, ArrayList<Integer> personImages) {
        this.context = context;
        this.personImages = personImages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        // set the data in items
        holder.image.setImageResource(personImages.get(position));
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
            }
        });}

        @Override
        public int getItemCount() {
            return personImages.size();
        }

         class MyViewHolder extends RecyclerView.ViewHolder {
            // init the item view's
            ImageView image;

            public MyViewHolder(View itemView) {
                super(itemView);

                // get the reference of item view's
                image = itemView.findViewById(R.id.image);

            }
        }




}
