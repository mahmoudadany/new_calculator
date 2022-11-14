package com.adany.adany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button acti2,acti3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acti2=findViewById(R.id.act2);
        acti3=findViewById(R.id.act3);

        acti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("first name","Mahmoud");
                intent.putExtra("family name","Rabie");
                intent.putExtra("age",20);
                startActivity(intent);
            }
        });
        acti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
    }
}