package com.example.starwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarWars.sp*=2;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarWars.sp=StarWars.sp/2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(StarWars.r==true)StarWars.r=false;
                else StarWars.r=true;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarWars.s=false;
                StarWars.t1 = 0;
                StarWars.t2 = 0;
                StarWars.dt2 = 0;
                StarWars.sp = 25;
                }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        StarWars.r=false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        StarWars.r=true;
    }
}
