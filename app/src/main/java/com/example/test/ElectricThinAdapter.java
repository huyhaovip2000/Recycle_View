package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElectricThinAdapter extends RecyclerView.Adapter<ElectricThinAdapter.ThingViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<ElectricThing> electricThings;

    public ElectricThinAdapter(Context context, ArrayList<ElectricThing> electricThings) {
        layoutInflater = LayoutInflater.from(context);
        this.electricThings = electricThings;
    }


    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.item_recycleview, parent, false);

        return new ThingViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {

        ElectricThing electricThing = electricThings.get(position);
        holder.tvName.setText(electricThing.getName());
        holder.tv_people.setText(String.valueOf(electricThing.getPeopleRate()));
        holder.tv_NewPrice.setText(String.valueOf(electricThing.getNewPrice()));
        holder.tv_reducePercent.setText(String.valueOf(electricThing.getReducePercent()));
        holder.imageView.setImageResource(electricThing.getImageThing());
        holder.ratingBar.setRating(electricThing.getRate());

    }

    @Override
    public int getItemCount() {
        return electricThings.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tv_NewPrice, tv_reducePercent, tv_people;
        ImageView imageView;
        RatingBar ratingBar;

        ElectricThinAdapter electricThinAdapter;

        public ThingViewHolder(@NonNull View itemView, ElectricThinAdapter adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tv_people = itemView.findViewById(R.id.tv_people);
            tv_reducePercent = itemView.findViewById(R.id.tv_reducePercent);
            tv_NewPrice = itemView.findViewById(R.id.tv_NewPrice);
            imageView = itemView.findViewById(R.id.imageView);
            ratingBar = itemView.findViewById(R.id.ratingBar);

            this.electricThinAdapter = adapter;

        }
    }
}
