package com.example.starwars;
//Tai Tantipiwatanaskul 5931264721
import android.content.Intent;
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
                StarWars.speed*=2;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarWars.speed=StarWars.speed/2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(StarWars.result==true){
                    StarWars.result=false;
                }
                else {
                    StarWars.result=true;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarWars.status=false;
                StarWars.time1 = 0;
                StarWars.t2 = 0;
                StarWars.dt2 = 0;
                StarWars.speed = 25;

                }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        StarWars.result=false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        StarWars.result=true;
    }
}
