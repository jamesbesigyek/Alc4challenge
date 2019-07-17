package com.example.alc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alc_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_profile);
        prof();
    }



    public Button btnprofile;
    public void prof(){
        btnprofile = (Button)findViewById(R.id.btnhome);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile =new Intent(alc_profile.this,MainActivity.class);
                startActivity(profile);
            }
        });

    }
}
