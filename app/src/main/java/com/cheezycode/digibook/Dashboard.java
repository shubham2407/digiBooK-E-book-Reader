package com.cheezycode.digibook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andro.digibook.R;

public class Dashboard extends AppCompatActivity {

    Button programming, novel, bksm, life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        programming=findViewById(R.id.birth_btn);
        novel=findViewById(R.id.motiv_btn);
        bksm=findViewById(R.id.friend_btn);
        life=findViewById(R.id.life_btn);

        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this , programming.class);
                startActivity(intent);
            }
        });
        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this , novel.class);
                startActivity(intent);
            }
        });
        bksm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this , bsummary.class);
                startActivity(intent);
            }
        });
        
    }
}