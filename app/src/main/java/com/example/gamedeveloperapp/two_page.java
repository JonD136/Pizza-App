package com.example.gamedeveloperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class two_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_page);

        //declare & define objects
        EditText cpnET = (EditText) findViewById(R.id.cpn);
        EditText qtET = (EditText) findViewById(R.id.qt);
        EditText totalET = (EditText) findViewById(R.id.total);


        //getting the values sent by the first screen
        //we also need to create an attempt to create an Intent to get the values
        Intent getValues = getIntent();

        //getting each value by storing it in a variable
        String cpnn = getValues.getExtras().getString("cpnKey");
        String qt = getValues.getExtras().getString("qtKey");
        String total = getValues.getExtras().getString("totalKey");


        //let's display these value in the EditText
        cpnET.setText(cpnn);
        qtET.setText(qt);
        totalET.setText(total);


    }
}
