package com.cheezycode.digibook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.andro.digibook.R;

public class cpp1 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp1);
        webView=findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/Introduction to C++.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/C++ Classes and Objects.html");
        }

        else if (position==2){
            webView.loadUrl("file:///android_asset/Abstract Class and Pure Virtual Function in C++.html");
        }
    }
}