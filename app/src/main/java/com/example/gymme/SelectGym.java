package com.example.gymme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectGym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gym);

        Button button = (Button) findViewById(R.id.submitButton);

        button.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); //MyProfile is page that opens
                startActivity(i);
            }
        });
    }
}
