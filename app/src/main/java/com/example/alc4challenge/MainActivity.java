package com.example.alc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        prof();
    }

    public Button bntabout;
    public void init() {
        bntabout=(Button)findViewById(R.id.btnabout);
        bntabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this,alc_about.class);
                startActivity(next);
            }
        });

    }

    public Button btnprofile;
    public void prof(){
        btnprofile = (Button)findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile =new Intent(MainActivity.this,alc_profile.class);
                startActivity(profile);
            }
        });

    }

}
