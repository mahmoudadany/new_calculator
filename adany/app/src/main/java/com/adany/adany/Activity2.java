package com.adany.adany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button acti1,acti3;
    private TextView text12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        acti1=findViewById(R.id.act1);
        acti3=findViewById(R.id.act3);
        text12=findViewById(R.id.text14);

        Bundle inte=getIntent().getExtras();
        text12.setText(inte.getString("first name"));

        acti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        acti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity2.this,Activity3.class);
                startActivity(intent);
            }
        });
    }
}