package com.example.alc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class alc_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_about);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://andela.com/alc/");


    }
}
