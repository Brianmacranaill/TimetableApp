package com.brian.cittimetableapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class TimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        Bundle bundle = getIntent().getExtras();
        String classGroupName = bundle.getString("selectedClass");
        setTitle(classGroupName + "'s " + getString(R.string.timetable));
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        TextView textview00 = findViewById(R.id.timeSlot00);
        fillTimeSlot(database, classGroupName, "0", "0", textview00);
        TextView textview01 = findViewById(R.id.timeSlot01);
        fillTimeSlot(database, classGroupName, "0", "1", textview01);
        TextView textview02 = findViewById(R.id.timeSlot02);
        fillTimeSlot(database, classGroupName, "0", "2", textview02);
        TextView textview03 = findViewById(R.id.timeSlot03);
        fillTimeSlot(database, classGroupName, "0", "3", textview03);
        TextView textview04 = findViewById(R.id.timeSlot04);
        fillTimeSlot(database, classGroupName, "0", "4", textview04);
        TextView textview05 = findViewById(R.id.timeSlot05);
        fillTimeSlot(database, classGroupName, "0", "5", textview05);
        TextView textview06 = findViewById(R.id.timeSlot06);
        fillTimeSlot(database, classGroupName, "0", "6", textview06);
        TextView textview07 = findViewById(R.id.timeSlot07);
        fillTimeSlot(database, classGroupName, "0", "7", textview07);
        TextView textview08 = findViewById(R.id.timeSlot08);
        fillTimeSlot(database, classGroupName, "0", "8", textview08);

        TextView textview10 = findViewById(R.id.timeSlot10);
        fillTimeSlot(database, classGroupName, "1", "0", textview10);
        TextView textview11 = findViewById(R.id.timeSlot11);
        fillTimeSlot(database, classGroupName, "1", "1", textview11);
        TextView textview12 = findViewById(R.id.timeSlot12);
        fillTimeSlot(database, classGroupName, "1", "2", textview12);
        TextView textview13 = findViewById(R.id.timeSlot13);
        fillTimeSlot(database, classGroupName, "1", "3", textview13);
        TextView textview14 = findViewById(R.id.timeSlot14);
        fillTimeSlot(database, classGroupName, "1", "4", textview14);
        TextView textview15 = findViewById(R.id.timeSlot15);
        fillTimeSlot(database, classGroupName, "1", "5", textview15);
        TextView textview16 = findViewById(R.id.timeSlot16);
        fillTimeSlot(database, classGroupName, "1", "6", textview16);
        TextView textview17 = findViewById(R.id.timeSlot17);
        fillTimeSlot(database, classGroupName, "1", "7", textview17);
        TextView textview18 = findViewById(R.id.timeSlot18);
        fillTimeSlot(database, classGroupName, "1", "8", textview18);

        TextView textview20 = findViewById(R.id.timeSlot20);
        fillTimeSlot(database, classGroupName, "2", "0", textview20);
        TextView textview21 = findViewById(R.id.timeSlot21);
        fillTimeSlot(database, classGroupName, "2", "1", textview21);
        TextView textview22 = findViewById(R.id.timeSlot22);
        fillTimeSlot(database, classGroupName, "2", "2", textview22);
        TextView textview23 = findViewById(R.id.timeSlot23);
        fillTimeSlot(database, classGroupName, "2", "3", textview23);
        TextView textview24 = findViewById(R.id.timeSlot24);
        fillTimeSlot(database, classGroupName, "2", "4", textview24);
        TextView textview25 = findViewById(R.id.timeSlot25);
        fillTimeSlot(database, classGroupName, "2", "5", textview25);
        TextView textview26 = findViewById(R.id.timeSlot26);
        fillTimeSlot(database, classGroupName, "2", "6", textview26);
        TextView textview27 = findViewById(R.id.timeSlot27);
        fillTimeSlot(database, classGroupName, "2", "7", textview27);
        TextView textview28 = findViewById(R.id.timeSlot28);
        fillTimeSlot(database, classGroupName, "2", "8", textview28);

        TextView textview30 = findViewById(R.id.timeSlot30);
        fillTimeSlot(database, classGroupName, "3", "0", textview30);
        TextView textview31 = findViewById(R.id.timeSlot31);
        fillTimeSlot(database, classGroupName, "3", "1", textview31);
        TextView textview32 = findViewById(R.id.timeSlot32);
        fillTimeSlot(database, classGroupName, "3", "2", textview32);
        TextView textview33 = findViewById(R.id.timeSlot33);
        fillTimeSlot(database, classGroupName, "3", "3", textview33);
        TextView textview34 = findViewById(R.id.timeSlot34);
        fillTimeSlot(database, classGroupName, "3", "4", textview34);
        TextView textview35 = findViewById(R.id.timeSlot35);
        fillTimeSlot(database, classGroupName, "3", "5", textview35);
        TextView textview36 = findViewById(R.id.timeSlot36);
        fillTimeSlot(database, classGroupName, "3", "6", textview36);
        TextView textview37 = findViewById(R.id.timeSlot37);
        fillTimeSlot(database, classGroupName, "3", "7", textview37);
        TextView textview38 = findViewById(R.id.timeSlot38);
        fillTimeSlot(database, classGroupName, "3", "8", textview38);

        TextView textview40 = findViewById(R.id.timeSlot40);
        fillTimeSlot(database, classGroupName, "4", "0", textview40);
        TextView textview41 = findViewById(R.id.timeSlot41);
        fillTimeSlot(database, classGroupName, "4", "1", textview41);
        TextView textview42 = findViewById(R.id.timeSlot42);
        fillTimeSlot(database, classGroupName, "4", "2", textview42);
        TextView textview43 = findViewById(R.id.timeSlot43);
        fillTimeSlot(database, classGroupName, "4", "3", textview43);
        TextView textview44 = findViewById(R.id.timeSlot44);
        fillTimeSlot(database, classGroupName, "4", "4", textview44);
        TextView textview45 = findViewById(R.id.timeSlot45);
        fillTimeSlot(database, classGroupName, "4", "5", textview45);
        TextView textview46 = findViewById(R.id.timeSlot46);
        fillTimeSlot(database, classGroupName, "4", "6", textview46);
        TextView textview47 = findViewById(R.id.timeSlot47);
        fillTimeSlot(database, classGroupName, "4", "7", textview47);
        TextView textview48 = findViewById(R.id.timeSlot48);
        fillTimeSlot(database, classGroupName, "4", "8", textview48);

    }


    public void fillTimeSlot(FirebaseDatabase database, String classCode, String day, String timeSlot, final TextView textViewName){
        DatabaseReference myRef = database.getReference("classes/" + classCode + "/" + day + "/" + timeSlot);
        ValueEventListener eventListener = new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    textViewName.setText(ds.getKey());
                    textViewName.setBackgroundColor(Color.parseColor("#A80F3A"));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        myRef.addListenerForSingleValueEvent(eventListener);
    }
}
