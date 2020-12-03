package com.cheezycode.digibook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.andro.digibook.R;

public class happier1 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happier1);
        webView=findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/10 Happier.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/fg_chapter 2.html");
        }

        else if (position==2){
            webView.loadUrl("file:///android_asset/fg_chapter 3.html");
        }
    }
}