package com.apteka.pharmacy.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apteka.pharmacy.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;


public class FirstHelp extends Fragment {

    private RecyclerView firstHelpRecyclerview;
    private LinearLayoutManager linearLayoutManager;
    private FirstHelpAdapter mFirstHelpAdapter;
    private DatabaseReference mDatabaseRef;
    private DatabaseReference childRef;
    List<FirstHelpObject> list;

    public FirstHelp() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_help, container, false);
        getActivity().setTitle("Первая помощь");
        return view;
    }
        @Override
        public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            firstHelpRecyclerview = (RecyclerView)view.findViewById(R.id.r_v);
            //final TextView textView = (TextView)view.findViewById(R.id.firsthelptext);
            linearLayoutManager = new LinearLayoutManager(getActivity());
            firstHelpRecyclerview.setLayoutManager(linearLayoutManager);
            firstHelpRecyclerview.setHasFixedSize(true);



            mDatabaseRef = FirebaseDatabase.getInstance().getReference();
            childRef = mDatabaseRef.child("FirstHelp");
            childRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    //list = new ArrayList<FirstHelpObject>();

                    firstHelpRecyclerview.setAdapter(mFirstHelpAdapter);
                    for (DataSnapshot u : dataSnapshot.getChildren()) {

//                        u.getValue(FirstHelpObject.class).toString();
//                        FirstHelpObject value = u.getValue(FirstHelpObject.class);
//                        FirstHelpObject fire = new FirstHelpObject();
//                        String name = value.getFirstHelpName();
//                        String image = value.getFirstHelpImage();
//
//                        fire.setFirstHelpName(name);
//                        fire.setFirstHelpImage(image);
//                        list.add(fire);
                    }
                }

                @Override
                public void onCancelled(DatabaseError error) {

                }
            });

            mFirstHelpAdapter = new FirstHelpAdapter(FirstHelpObject.class, R.layout.first_help_list,
                    FirstHelpHolder.class, childRef, getContext());



        }


}








