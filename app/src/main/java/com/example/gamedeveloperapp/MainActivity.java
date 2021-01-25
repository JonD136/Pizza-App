package com.example.gamedeveloperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText txtCompany = (EditText) findViewById(R.id.cpn);
        final RadioGroup radioG = (RadioGroup) findViewById(R.id.radioGroup);

        Button pressMe = (Button) findViewById(R.id.button);


//button pressMe
        pressMe.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {


                                           try {


                                               // get selected radio button from radioGroup
                                               int selectedbtn = radioG.getCheckedRadioButtonId();

                                               // find the radiobutton by returned id
                                               RadioButton selectedRadioButton = (RadioButton) findViewById(selectedbtn);


                                               //checking the errors
                                               if (radioG.getCheckedRadioButtonId() == -1 && txtCompany.getText().toString().equals("")) {

                                                   // no radio buttons are checked
                                                   Toast.makeText(MainActivity.this,
                                                           "Didn't put company name & quantity.", Toast.LENGTH_LONG).show();

                                               } else if (radioG.getCheckedRadioButtonId() != -1 && txtCompany.getText().toString().equals("")) {

                                                   // only clicked quantity
                                                   Toast.makeText(MainActivity.this,
                                                           "Didn't put company name.", Toast.LENGTH_LONG).show();

                                                   //checking the errors

                                               } else if (radioG.getCheckedRadioButtonId() == -1 && !(txtCompany.getText().toString()).equals("")) {

                                                   // only type company name
                                                   Toast.makeText(MainActivity.this,
                                                           "Didn't select quantity.", Toast.LENGTH_LONG).show();

                                               } else {


                                                   // taking in values and putting them into the second page


                                                   //making the string into a integer
                                                   int radiobtn = Integer.parseInt(selectedRadioButton.getText().toString());


                                                   //create an intent object to go to the second page
                                                   Intent gotoScreen2 = new Intent(MainActivity.this, two_page.class);

                                                   //pack the variables with this Intent object
                                                   gotoScreen2.putExtra("cpnKey", txtCompany.getText().toString());


                                                   int price = 20;

                                                   int quantity5 = 5;
                                                   int quantity6 = 6;
                                                   int quantity7 = 7;
                                                   int quantity8 = 8;
                                                   int quantity9 = 9;
                                                   int quantity10 = 10;

                                                   double discount1 = 0.08;
                                                   double discount2 = 0.10;
                                                   double discount3 = 0.12;
                                                   double discount4 = 0.15;
                                                   double discount5 = 0.17;
                                                   double discount6 = 0.20;


                                                   if (radiobtn == quantity5 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity5 * discount1;
                                                       double tc = price * quantity5 - discount;

                                                       String q5 = Integer.toString(quantity5);
                                                       gotoScreen2.putExtra("qtKey", q5);

                                                       String totalCost = Double.toString(tc);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   } else if (radiobtn == quantity6 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity6 * discount2;
                                                       double tc = price * quantity6 - discount;

                                                       String q6 = Integer.toString(quantity6);
                                                       String totalCost = Double.toString(tc);

                                                       gotoScreen2.putExtra("qtKey", q6);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   } else if (radiobtn == quantity7 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity7 * discount3;
                                                       double tc = price * quantity7 - discount;

                                                       String q7 = Integer.toString(quantity7);
                                                       String totalCost = Double.toString(tc);

                                                       gotoScreen2.putExtra("qtKey", q7);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   } else if (radiobtn == quantity8 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity8 * discount4;
                                                       double tc = price * quantity8 - discount;

                                                       String q8 = Integer.toString(quantity8);
                                                       String totalCost = Double.toString(tc);

                                                       gotoScreen2.putExtra("qtKey", q8);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   } else if (radiobtn == quantity9 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity9 * discount5;
                                                       double tc = price * quantity9 - discount;

                                                       String q9 = Integer.toString(quantity9);
                                                       String totalCost = Double.toString(tc);

                                                       gotoScreen2.putExtra("qtKey", q9);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   } else if (radiobtn == quantity10 && !(txtCompany.getText().toString().equals(""))) {

                                                       double discount = price * quantity10 * discount6;
                                                       double tc = price * quantity10 - discount;

                                                       String q10 = Integer.toString(quantity10);
                                                       String totalCost = Double.toString(tc);

                                                       gotoScreen2.putExtra("qtKey", q10);
                                                       gotoScreen2.putExtra("totalKey", totalCost);


                                                   }


                                                   //ready to go to the second screen named ShowChoices
                                                   startActivity(gotoScreen2);
                                               }

                                           } catch (Exception e) {}

                                       }

                                   }

        );

    }


}

