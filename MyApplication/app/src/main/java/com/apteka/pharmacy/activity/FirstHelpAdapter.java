package com.apteka.pharmacy.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;

public class FirstHelpAdapter extends FirebaseRecyclerAdapter<FirstHelpObject, FirstHelpHolder>{

private Context context;

public FirstHelpAdapter(Class<FirstHelpObject> modelClass, int modelLayout, Class<FirstHelpHolder> viewHolderClass, DatabaseReference ref, Context context) {
        super(modelClass, modelLayout, viewHolderClass, ref);
        this.context = context;

        }

        @Override
        protected void populateViewHolder(FirstHelpHolder viewHolder, FirstHelpObject model, int position) {
        viewHolder.firstHelpName.setText(model.getFirstHelpName());
        Glide.with(context).load(model.getFirstHelpImage()).into(viewHolder.firstHelpImage);


        }

        @Override
        public FirstHelpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                final FirstHelpHolder viewHolder = super.onCreateViewHolder(parent, viewType);
                viewHolder.setOnClickListener(new FirstHelpHolder.ClickListener() {

                        @Override
                        public void onItemClick(View view, int position) {
                                Intent newActivity = new Intent(context, FirstHelpDescription.class);

                                newActivity.putExtra("Position", position);
                                newActivity.putExtra("lname",  viewHolder.firstHelpName.getText());
                                //newActivity.putExtra("image",);
                                context.startActivity(newActivity);
                        }
                });

                return viewHolder;
        }


 }