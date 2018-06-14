package com.example.gymme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class CheckIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        Button mbutton = (Button) findViewById(R.id.myProfileButton);

        mbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrontPage.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button cbutton = (Button) findViewById(R.id.checkInButton);

        cbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button sbutton = (Button) findViewById(R.id.switchGymButton);

        sbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyProfile.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button lbutton = (Button) findViewById(R.id.logoutButton);

        lbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SelectGym.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button button = (Button) findViewById(R.id.submitButton);

        button.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyProfile.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

/*
        //Test retrieving the radiogroup strings
        //the gym radio group
        RadioGroup radioGroupGym = (RadioGroup) findViewById(R.id.radioGroupGym);
        //id of the checked button
        int checked = radioGroupGym.getCheckedRadioButtonId();

        //new intent in which to put the checked value
        Intent gymIntent = new Intent(getApplicationContext(), MyProfile.class);
        gymIntent.putExtra("whichGym", checked);
*/

    }
}
