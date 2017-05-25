package com.apteka.pharmacy.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apteka.pharmacy.R;

public class FirstHelpHolder extends RecyclerView.ViewHolder  {


    public TextView firstHelpName;
    public ImageView firstHelpImage;
    private final Context context;

    public FirstHelpHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();

        firstHelpName = (TextView) itemView.findViewById(R.id.first_help_name);
        firstHelpImage = (ImageView) itemView.findViewById(R.id.first_help_image);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mClickListener.onItemClick(v, getAdapterPosition());
            }
        });

    }
    private FirstHelpHolder.ClickListener mClickListener;

    //Interface to send callbacks...
    public interface ClickListener{
        public void onItemClick(View view, int position);


    }

    public void setOnClickListener(FirstHelpHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }


}