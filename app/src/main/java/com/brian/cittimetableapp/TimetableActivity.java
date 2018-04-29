package com.brian.cittimetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        setTitle(getString(R.string.timetable));

        TextView textView = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        String classGroupName = bundle.getString("selectedClass");
        textView.setText(classGroupName);
    }
}
