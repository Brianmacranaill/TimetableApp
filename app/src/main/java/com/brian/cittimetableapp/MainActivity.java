package com.brian.cittimetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSecondPage(View view) {
        Intent newActivity = new Intent(this, SecondActivity.class);
        startActivity(newActivity);
    }
}
