package com.apteka.pharmacy.activity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.apteka.pharmacy.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class FirstHelpDescription extends Activity {
    private DatabaseReference mDatabaseRef;
    private DatabaseReference childRef;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_help_description);



        int position = getIntent().getExtras().getInt("Position");
        String lname = getIntent().getExtras().getString("lname");

        TextView text = (TextView) findViewById(R.id.first_help_name);
        text.setText(lname);
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("FirstHelpDescription");

        final TextView mText1 = (TextView) findViewById(R.id.text_simptom);
        final ImageView mImg = (ImageView) findViewById(R.id.image_simptom);

        final TextView mText2 = (TextView) findViewById(R.id.text_first1);
        final ImageView mImg1 = (ImageView) findViewById(R.id.image_first1);
        final TextView mText3 = (TextView) findViewById(R.id.text_first2);
        final ImageView mImg2 = (ImageView) findViewById(R.id.image_first2);

        final TextView mText4 = (TextView) findViewById(R.id.text_warning1);



        //if (position == 0){

            childRef = mDatabaseRef.child("FirstHelpDescription" + position);

        //}
       // if (position == 1){

           // childRef = mDatabaseRef.child("FirstHelpDescription2");
       // }

        childRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                    FirstHelpDescriptionObject post = dataSnapshot.getValue(FirstHelpDescriptionObject.class);
                    final String text1 = post.getFhdSimptom().toString();
                    final String text2 = post.getFhdHelp1().toString();
                    final String text3 = post.getFhdHelp2().toString();
                    final String text4 = post.getFhdWarning1().toString();




                    mText1.setText(text1);
                    mText2.setText(text2);
                    mText3.setText(text3);
                    mText4.setText(text4);

                    Picasso.with(getBaseContext()).load(post.getFhdImage()).into(mImg);
                    Picasso.with(getBaseContext()).load(post.getFhdImage1()).into(mImg1);
                Picasso.with(getBaseContext()).load(post.getFhdImage2()).into(mImg2);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}