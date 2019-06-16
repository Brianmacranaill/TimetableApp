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


public class TimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        final Bundle bundle = getIntent().getExtras();
        final String classGroupName = bundle.getString("selectedLecturer");
        setTitle(classGroupName + "'s " + getString(R.string.timetable));
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        List<TextView> textviewList = new ArrayList<TextView>() {
            {
                add ((TextView) findViewById(R.id.timeSlot00));
                add ((TextView) findViewById(R.id.timeSlot01));
                add ((TextView) findViewById(R.id.timeSlot02));
                add ((TextView) findViewById(R.id.timeSlot03));
                add ((TextView) findViewById(R.id.timeSlot04));
                add ((TextView) findViewById(R.id.timeSlot05));
                add ((TextView) findViewById(R.id.timeSlot06));
                add ((TextView) findViewById(R.id.timeSlot07));
                add ((TextView) findViewById(R.id.timeSlot08));
                add ((TextView) findViewById(R.id.timeSlot10));
                add ((TextView) findViewById(R.id.timeSlot11));
                add ((TextView) findViewById(R.id.timeSlot12));
                add ((TextView) findViewById(R.id.timeSlot13));
                add ((TextView) findViewById(R.id.timeSlot14));
                add ((TextView) findViewById(R.id.timeSlot15));
                add ((TextView) findViewById(R.id.timeSlot16));
                add ((TextView) findViewById(R.id.timeSlot17));
                add ((TextView) findViewById(R.id.timeSlot18));
                add ((TextView) findViewById(R.id.timeSlot20));
                add ((TextView) findViewById(R.id.timeSlot21));
                add ((TextView) findViewById(R.id.timeSlot22));
                add ((TextView) findViewById(R.id.timeSlot23));
                add ((TextView) findViewById(R.id.timeSlot24));
                add ((TextView) findViewById(R.id.timeSlot25));
                add ((TextView) findViewById(R.id.timeSlot26));
                add ((TextView) findViewById(R.id.timeSlot27));
                add ((TextView) findViewById(R.id.timeSlot28));
                add ((TextView) findViewById(R.id.timeSlot30));
                add ((TextView) findViewById(R.id.timeSlot31));
                add ((TextView) findViewById(R.id.timeSlot32));
                add ((TextView) findViewById(R.id.timeSlot33));
                add ((TextView) findViewById(R.id.timeSlot34));
                add ((TextView) findViewById(R.id.timeSlot35));
                add ((TextView) findViewById(R.id.timeSlot36));
                add ((TextView) findViewById(R.id.timeSlot37));
                add ((TextView) findViewById(R.id.timeSlot38));
                add ((TextView) findViewById(R.id.timeSlot40));
                add ((TextView) findViewById(R.id.timeSlot41));
                add ((TextView) findViewById(R.id.timeSlot42));
                add ((TextView) findViewById(R.id.timeSlot43));
                add ((TextView) findViewById(R.id.timeSlot44));
                add ((TextView) findViewById(R.id.timeSlot45));
                add ((TextView) findViewById(R.id.timeSlot46));
                add ((TextView) findViewById(R.id.timeSlot47));
                add ((TextView) findViewById(R.id.timeSlot48));
            }
        };

        int dayCounter;
        int timeslotCounter;
        int textviewCounter = 0;
        for (dayCounter = 0; dayCounter < 5; dayCounter++){
            for (timeslotCounter  = 0; timeslotCounter < 9; timeslotCounter++){
                final String[] module = fillTimeSlot(database, classGroupName, String.valueOf(dayCounter), String.valueOf(timeslotCounter), textviewList.get(textviewCounter));
                final int finalDayCounter = dayCounter;
                final int finalTimeslotCounter = timeslotCounter;
                textviewList.get(textviewCounter).setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(module[0] != null) {
                            Intent intent = new Intent(TimetableActivity.this, Pop.class);
                            intent.putExtra("day", String.valueOf(finalDayCounter));
                            intent.putExtra("timeslot", String.valueOf(finalTimeslotCounter));
                            intent.putExtra("classGroupName", bundle.getString("selectedLecturer"));
                            intent.putExtra("moduleName", module[0]);
                            startActivity(intent);
                        }
                    }
                });
                textviewCounter++;
                if (textviewCounter == textviewList.size()){
                    break;
                }
            }
            if (textviewCounter == textviewList.size()){
                break;
            }
        }
    }

    public String[] fillTimeSlot(FirebaseDatabase database, String classCode, String day, String timeSlot, final TextView textViewName){
        DatabaseReference myRef = database.getReference("classes/" + classCode + "/" + day + "/" + timeSlot);
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