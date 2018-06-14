package com.example.gymme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

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
                Intent i = new Intent(getApplicationContext(), CheckIn.class); //MyProfile is page that opens
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
        /*
        Button checkIn = (Button) findViewById(R.id.checkIn);

        checkIn.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CheckIn.class);
                startActivity(i);
            }
        });*/
    }
}
