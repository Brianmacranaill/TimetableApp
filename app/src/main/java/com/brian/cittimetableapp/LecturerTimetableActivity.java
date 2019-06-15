package com.brian.cittimetableapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
        final TextView textview00 = findViewById(R.id.timeSlot00);
        final String[] module00 = fillTimeSlot(database, lecturerName, "0", "0", textview00);
        textview00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "0");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName", module00[0]);
                startActivity(intent);
            }
        });
        TextView textview01 = findViewById(R.id.timeSlot01);
        final String[] module01 = fillTimeSlot(database, lecturerName, "0", "1", textview01);
        textview01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "1");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module01[0]);
                startActivity(intent);
            }
        });
        TextView textview02 = findViewById(R.id.timeSlot02);
        final String[] module02 = fillTimeSlot(database, lecturerName, "0", "2", textview02);
        textview02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "2");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module02[0]);
                startActivity(intent);
            }
        });
        TextView textview03 = findViewById(R.id.timeSlot03);
        final String[] module03 =  fillTimeSlot(database, lecturerName, "0", "3", textview03);
        textview03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "3");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module03[0]);
                startActivity(intent);
            }
        });
        TextView textview04 = findViewById(R.id.timeSlot04);
        final String[] module04 = fillTimeSlot(database, lecturerName, "0", "4", textview04);
        textview04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "4");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module04[0]);
                startActivity(intent);
            }
        });
        TextView textview05 = findViewById(R.id.timeSlot05);
        final String[] module05 = fillTimeSlot(database, lecturerName, "0", "5", textview05);
        textview05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "5");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module05[0]);
                startActivity(intent);
            }
        });
        TextView textview06 = findViewById(R.id.timeSlot06);
        final String[] module06 = fillTimeSlot(database, lecturerName, "0", "6", textview06);
        textview06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "6");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module06[0]);
                startActivity(intent);
            }
        });
        TextView textview07 = findViewById(R.id.timeSlot07);
        final String[] module07 = fillTimeSlot(database, lecturerName, "0", "7", textview07);
        textview07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "7");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module07[0]);
                startActivity(intent);
            }
        });
        TextView textview08 = findViewById(R.id.timeSlot08);
        final String[] module08 = fillTimeSlot(database, lecturerName, "0", "8", textview08);
        textview08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "0");
                intent.putExtra("timeslot", "8");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module08[0]);
                startActivity(intent);
            }
        });

        TextView textview10 = findViewById(R.id.timeSlot10);
        final String[] module10 = fillTimeSlot(database, lecturerName, "1", "0", textview10);
        textview10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "0");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module10[0]);
                startActivity(intent);
            }
        });
        TextView textview11 = findViewById(R.id.timeSlot11);
        final String[] module11 = fillTimeSlot(database, lecturerName, "1", "1", textview11);
        textview11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "1");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module11[0]);
                startActivity(intent);
            }
        });
        TextView textview12 = findViewById(R.id.timeSlot12);
        final String[] module12 = fillTimeSlot(database, lecturerName, "1", "2", textview12);
        textview12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "2");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module12[0]);
                startActivity(intent);
            }
        });
        TextView textview13 = findViewById(R.id.timeSlot13);
        final String[] module13 = fillTimeSlot(database, lecturerName, "1", "3", textview13);
        textview13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "3");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module13[0]);
                startActivity(intent);
            }
        });
        TextView textview14 = findViewById(R.id.timeSlot14);
        final String[] module14 = fillTimeSlot(database, lecturerName, "1", "4", textview14);
        textview14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "4");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module14[0]);
                startActivity(intent);
            }
        });
        TextView textview15 = findViewById(R.id.timeSlot15);
        final String[] module15 = fillTimeSlot(database, lecturerName, "1", "5", textview15);
        textview15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "5");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module15[0]);
                startActivity(intent);
            }
        });
        TextView textview16 = findViewById(R.id.timeSlot16);
        final String[] module16 = fillTimeSlot(database, lecturerName, "1", "6", textview16);
        textview16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "6");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module16[0]);
                startActivity(intent);
            }
        });
        TextView textview17 = findViewById(R.id.timeSlot17);
        final String[] module17 = fillTimeSlot(database, lecturerName, "1", "7", textview17);
        textview17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "7");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module17[0]);
                startActivity(intent);
            }
        });
        TextView textview18 = findViewById(R.id.timeSlot18);
        final String[] module18 = fillTimeSlot(database, lecturerName, "1", "8", textview18);
        textview18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "1");
                intent.putExtra("timeslot", "8");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module18[0]);
                startActivity(intent);
            }
        });

        TextView textview20 = findViewById(R.id.timeSlot20);
        final String[] module20 = fillTimeSlot(database, lecturerName, "2", "0", textview20);
        textview20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "0");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module20[0]);
                startActivity(intent);
            }
        });
        TextView textview21 = findViewById(R.id.timeSlot21);
        final String[] module21 = fillTimeSlot(database, lecturerName, "2", "1", textview21);
        textview21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "1");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module21[0]);
                startActivity(intent);
            }
        });
        TextView textview22 = findViewById(R.id.timeSlot22);
        final String[] module22 = fillTimeSlot(database, lecturerName, "2", "2", textview22);
        textview22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "2");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module22[0]);
                startActivity(intent);
            }
        });
        TextView textview23 = findViewById(R.id.timeSlot23);
        final String[] module23 = fillTimeSlot(database, lecturerName, "2", "3", textview23);
        textview23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "3");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module23[0]);
                startActivity(intent);
            }
        });
        TextView textview24 = findViewById(R.id.timeSlot24);
        final String[] module24 = fillTimeSlot(database, lecturerName, "2", "4", textview24);
        textview24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "4");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module24[0]);
                startActivity(intent);
            }
        });
        TextView textview25 = findViewById(R.id.timeSlot25);
        final String[] module25 = fillTimeSlot(database, lecturerName, "2", "5", textview25);
        textview25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "5");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module25[0]);
                startActivity(intent);
            }
        });
        TextView textview26 = findViewById(R.id.timeSlot26);
        final String[] module26 = fillTimeSlot(database, lecturerName, "2", "6", textview26);
        textview26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "6");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module26[0]);
                startActivity(intent);
            }
        });
        TextView textview27 = findViewById(R.id.timeSlot27);
        final String[] module27 = fillTimeSlot(database, lecturerName, "2", "7", textview27);
        textview27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "7");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module27[0]);
                startActivity(intent);
            }
        });
        TextView textview28 = findViewById(R.id.timeSlot28);
        final String[] module28 = fillTimeSlot(database, lecturerName, "2", "8", textview28);
        textview28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "2");
                intent.putExtra("timeslot", "8");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module28[0]);
                startActivity(intent);
            }
        });

        TextView textview30 = findViewById(R.id.timeSlot30);
        final String[] module30 = fillTimeSlot(database, lecturerName, "3", "0", textview30);
        textview30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "0");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module30[0]);
                startActivity(intent);
            }
        });
        TextView textview31 = findViewById(R.id.timeSlot31);
        final String[] module31 = fillTimeSlot(database, lecturerName, "3", "1", textview31);
        textview31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "1");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module31[0]);
                startActivity(intent);
            }
        });
        TextView textview32 = findViewById(R.id.timeSlot32);
        final String[] module32 = fillTimeSlot(database, lecturerName, "3", "2", textview32);
        textview32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "2");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module32[0]);
                startActivity(intent);
            }
        });
        TextView textview33 = findViewById(R.id.timeSlot33);
        final String[] module33 = fillTimeSlot(database, lecturerName, "3", "3", textview33);
        textview33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "3");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module33[0]);
                startActivity(intent);
            }
        });
        TextView textview34 = findViewById(R.id.timeSlot34);
        final String[] module34 = fillTimeSlot(database, lecturerName, "3", "4", textview34);
        textview34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "4");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module34[0]);
                startActivity(intent);
            }
        });
        TextView textview35 = findViewById(R.id.timeSlot35);
        final String[] module35 = fillTimeSlot(database, lecturerName, "3", "5", textview35);
        textview35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "5");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module35[0]);
                startActivity(intent);
            }
        });
        TextView textview36 = findViewById(R.id.timeSlot36);
        final String[] module36 = fillTimeSlot(database, lecturerName, "3", "6", textview36);
        textview36.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "6");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module36[0]);
                startActivity(intent);
            }
        });
        TextView textview37 = findViewById(R.id.timeSlot37);
        final String[] module37 = fillTimeSlot(database, lecturerName, "3", "7", textview37);
        textview37.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "7");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module37[0]);
                startActivity(intent);
            }
        });
        TextView textview38 = findViewById(R.id.timeSlot38);
        final String[] module38 = fillTimeSlot(database, lecturerName, "3", "8", textview38);
        textview38.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "3");
                intent.putExtra("timeslot", "8");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module38[0]);
                startActivity(intent);
            }
        });

        TextView textview40 = findViewById(R.id.timeSlot40);
        final String[] module40 = fillTimeSlot(database, lecturerName, "4", "0", textview40);
        textview40.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "0");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module40[0]);
                startActivity(intent);
            }
        });
        TextView textview41 = findViewById(R.id.timeSlot41);
        final String[] module41 = fillTimeSlot(database, lecturerName, "4", "1", textview41);
        textview41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "1");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module41[0]);
                startActivity(intent);
            }
        });
        TextView textview42 = findViewById(R.id.timeSlot42);
        final String[] module42 = fillTimeSlot(database, lecturerName, "4", "2", textview42);
        textview42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "2");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module42[0]);
                startActivity(intent);
            }
        });
        TextView textview43 = findViewById(R.id.timeSlot43);
        final String[] module43 = fillTimeSlot(database, lecturerName, "4", "3", textview43);
        textview43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "3");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module43[0]);
                startActivity(intent);
            }
        });
        TextView textview44 = findViewById(R.id.timeSlot44);
        final String[] module44 = fillTimeSlot(database, lecturerName, "4", "4", textview44);
        textview44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "4");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module44[0]);
                startActivity(intent);
            }
        });
        TextView textview45 = findViewById(R.id.timeSlot45);
        final String[] module45 = fillTimeSlot(database, lecturerName, "4", "5", textview45);
        textview45.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "5");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module45[0]);
                startActivity(intent);
            }
        });
        TextView textview46 = findViewById(R.id.timeSlot46);
        final String[] module46 = fillTimeSlot(database, lecturerName, "4", "6", textview46);
        textview46.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "6");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module46[0]);
                startActivity(intent);
            }
        });
        TextView textview47 = findViewById(R.id.timeSlot47);
        final String[] module47 = fillTimeSlot(database, lecturerName, "4", "7", textview47);
        textview47.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "7");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module47[0]);
                startActivity(intent);
            }
        });
        TextView textview48 = findViewById(R.id.timeSlot48);
        final String[] module48 = fillTimeSlot(database, lecturerName, "4", "8", textview48);
        textview48.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LecturerTimetableActivity.this, LecturerPop.class);
                intent.putExtra("day", "4");
                intent.putExtra("timeslot", "8");
                intent.putExtra("lecturerName", bundle.getString("selectedLecturer"));
                intent.putExtra("moduleName" ,module48[0]);
                startActivity(intent);
            }
        });
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
                    System.out.println(ds.getKey());
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
