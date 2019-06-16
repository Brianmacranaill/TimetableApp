package com.brian.cittimetableapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class LecturerTimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_lecturer);

        final Bundle bundle = getIntent().getExtras();
        final String lecturerName = bundle.getString("selectedLecturer");
        setTitle(lecturerName + " " + getString(R.string.timetable));
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        List<TextView> textviewList = new ArrayList<>();

        TextView textview00 = findViewById(R.id.timeSlot00);
        textviewList.add(textview00);
        TextView textview01 = findViewById(R.id.timeSlot01);
        textviewList.add(textview01);
        TextView textview02 = findViewById(R.id.timeSlot02);
        textviewList.add(textview02);
        TextView textview03 = findViewById(R.id.timeSlot03);
        textviewList.add(textview03);
        TextView textview04 = findViewById(R.id.timeSlot04);
        textviewList.add(textview04);
        TextView textview05 = findViewById(R.id.timeSlot05);
        textviewList.add(textview05);
        TextView textview06 = findViewById(R.id.timeSlot06);
        textviewList.add(textview06);
        TextView textview07 = findViewById(R.id.timeSlot07);
        textviewList.add(textview07);
        TextView textview08 = findViewById(R.id.timeSlot08);
        textviewList.add(textview08);
        TextView textview10 = findViewById(R.id.timeSlot10);
        textviewList.add(textview10);
        TextView textview11 = findViewById(R.id.timeSlot11);
        textviewList.add(textview11);
        TextView textview12 = findViewById(R.id.timeSlot12);
        textviewList.add(textview12);
        TextView textview13 = findViewById(R.id.timeSlot13);
        textviewList.add(textview13);
        TextView textview14 = findViewById(R.id.timeSlot14);
        textviewList.add(textview14);
        TextView textview15 = findViewById(R.id.timeSlot15);
        textviewList.add(textview15);
        TextView textview16 = findViewById(R.id.timeSlot16);
        textviewList.add(textview16);
        TextView textview17 = findViewById(R.id.timeSlot17);
        textviewList.add(textview17);
        TextView textview18 = findViewById(R.id.timeSlot18);
        textviewList.add(textview18);
        TextView textview20 = findViewById(R.id.timeSlot20);
        textviewList.add(textview20);
        TextView textview21 = findViewById(R.id.timeSlot21);
        textviewList.add(textview21);
        TextView textview22 = findViewById(R.id.timeSlot22);
        textviewList.add(textview22);
        TextView textview23 = findViewById(R.id.timeSlot23);
        textviewList.add(textview23);
        TextView textview24 = findViewById(R.id.timeSlot24);
        textviewList.add(textview24);
        TextView textview25 = findViewById(R.id.timeSlot25);
        textviewList.add(textview25);
        TextView textview26 = findViewById(R.id.timeSlot26);
        textviewList.add(textview26);
        TextView textview27 = findViewById(R.id.timeSlot27);
        textviewList.add(textview27);
        TextView textview28 = findViewById(R.id.timeSlot28);
        textviewList.add(textview28);
        TextView textview30 = findViewById(R.id.timeSlot30);
        textviewList.add(textview30);
        TextView textview31 = findViewById(R.id.timeSlot31);
        textviewList.add(textview31);
        TextView textview32 = findViewById(R.id.timeSlot32);
        textviewList.add(textview32);
        TextView textview33 = findViewById(R.id.timeSlot33);
        textviewList.add(textview33);
        TextView textview34 = findViewById(R.id.timeSlot34);
        textviewList.add(textview34);
        TextView textview35 = findViewById(R.id.timeSlot35);
        textviewList.add(textview35);
        TextView textview36 = findViewById(R.id.timeSlot36);
        textviewList.add(textview36);
        TextView textview37 = findViewById(R.id.timeSlot37);
        textviewList.add(textview37);
        TextView textview38 = findViewById(R.id.timeSlot38);
        textviewList.add(textview38);
        TextView textview40 = findViewById(R.id.timeSlot40);
        textviewList.add(textview40);
        TextView textview41 = findViewById(R.id.timeSlot41);
        textviewList.add(textview41);
        TextView textview42 = findViewById(R.id.timeSlot42);
        textviewList.add(textview42);
        TextView textview43 = findViewById(R.id.timeSlot43);
        textviewList.add(textview43);
        TextView textview44 = findViewById(R.id.timeSlot44);
        textviewList.add(textview44);
        TextView textview45 = findViewById(R.id.timeSlot45);
        textviewList.add(textview45);
        TextView textview46 = findViewById(R.id.timeSlot46);
        textviewList.add(textview46);
        TextView textview47 = findViewById(R.id.timeSlot47);
        textviewList.add(textview47);
        TextView textview48 = findViewById(R.id.timeSlot48);
        textviewList.add(textview48);

        int dayCounter;
        int timeslotCounter;
        int textviewCounter = 0;
        for (dayCounter = 0; dayCounter < 5; dayCounter++){
            for (timeslotCounter  = 0; timeslotCounter < 9; timeslotCounter++){
                final String[] module = fillTimeSlot(database, lecturerName, String.valueOf(dayCounter), String.valueOf(timeslotCounter), textviewList.get(textviewCounter));
                final int finalDayCounter = dayCounter;
                final int finalTimeslotCounter = timeslotCounter;
                textviewList.get(textviewCounter).setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                        intent.putExtra("day", String.valueOf(finalDayCounter));
                        intent.putExtra("timeslot", String.valueOf(finalTimeslotCounter));
                        intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                        intent.putExtra("moduleName", module[0]);
                        startActivity(intent);
                    }
                });
                textviewCounter++;
            }
        }
    }

    public String[] fillTimeSlot(FirebaseDatabase database, String lecturerName, String day, String timeSlot, final TextView textViewName){
        DatabaseReference myRef = database.getReference("lecturers/" + lecturerName + "/" + day + "/" + timeSlot);
        final String[] moduleName = new String[1];
        ValueEventListener eventListener = new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    textViewName.setText(ds.getKey());
                    moduleName[0] = ds.getKey();
                    textViewName.setBackgroundColor(Color.parseColor("#A80F3A"));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        myRef.addListenerForSingleValueEvent(eventListener);
        return moduleName;
    }
}
