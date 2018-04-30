package com.brian.cittimetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    Spinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("classes");
        final String[] spinnerValue = new String[1];
        myRef.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<String> classGroupList = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    return;
                }
                for (DataSnapshot classGroupSnapshot: dataSnapshot.getChildren()) {
                    classGroupList.add(classGroupSnapshot.getKey());
                }
                mySpinner = findViewById(R.id.spinner1);

                ArrayAdapter<String> myAdapter = new ArrayAdapter<>(SecondActivity.this, android.R.layout.simple_list_item_1, classGroupList);
                myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                mySpinner.setAdapter(myAdapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerValue[0] = mySpinner.getSelectedItem().toString();
                Intent intent = new Intent(SecondActivity.this, TimetableActivity.class);
                intent.putExtra("selectedClass", spinnerValue[0]);
                startActivity(intent);
            }
        });



        setTitle(getString(R.string.selectClass));
    }

}
