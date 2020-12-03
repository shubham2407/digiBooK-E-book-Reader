package com.cheezycode.digibook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andro.digibook.R;

public class programming extends AppCompatActivity {

    Button birthday, motivational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
        birthday=findViewById(R.id.birth_btn);
        motivational=findViewById(R.id.motiv_btn);

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programming.this , jv.class);
                startActivity(intent);
            }
        });
        motivational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programming.this , cpp.class);
                startActivity(intent);
            }
        });
    }
}