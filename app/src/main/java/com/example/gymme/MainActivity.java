package com.example.gymme;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;

        import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Do the next 8 lines for each button
        Button button = (Button) findViewById(R.id.myProfileButton);

        button.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyProfile.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button cbutton = (Button) findViewById(R.id.checkInButton);

        cbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CheckIn.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button sbutton = (Button) findViewById(R.id.switchGymButton);

        sbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SelectGym.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        Button lbutton = (Button) findViewById(R.id.logoutButton);

        lbutton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrontPage.class); //MyProfile is page that opens
                startActivity(i);
            }
        });

        //Bench press icon button
        ImageButton benchPressIcon = (ImageButton) findViewById(R.id.benchPressIcon);

        benchPressIcon.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BenchPress.class);
                startActivity(i);
            }
        });

        //Squat rack icon button
        ImageButton squatRackIcon = (ImageButton) findViewById(R.id.squatRackIcon);

        squatRackIcon.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SquatRack.class);
                startActivity(i);
            }
        });



    }




}
