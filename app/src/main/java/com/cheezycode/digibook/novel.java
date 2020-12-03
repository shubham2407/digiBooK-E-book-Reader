package com.cheezycode.digibook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andro.digibook.R;

public class novel extends AppCompatActivity {

    Button friendship, life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);
        friendship=findViewById(R.id.friend_btn);
        life=findViewById(R.id.life_btn);

        friendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novel.this , forrestgump.class);
                startActivity(intent);
            }
        });
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novel.this , thief.class);
                startActivity(intent);
            }
        });
    }
}