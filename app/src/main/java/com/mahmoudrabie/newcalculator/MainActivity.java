package com.mahmoudrabie.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText edit;
String cc;
double test;
int count=0;
Button sum,sub,mul,dev,equel,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=findViewById(R.id.viewtext);
        sum=findViewById(R.id.sum);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        dev=findViewById(R.id.dev);
        c=findViewById(R.id.c);
        equel=findViewById(R.id.equel);

        if(Build.VERSION.SDK_INT>=Build.VERSION.PREVIEW_SDK_INT ){
            edit.setShowSoftInputOnFocus(false);
        }

        equel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double d=Double.parseDouble(edit.getText().toString());
                    switch (count) {
                        case 1:
                            edit.setText(test + d + "");
                            break;
                        case 2:
                            edit.setText(test - d + "");
                            break;
                        case 3:
                            edit.setText(test * d + "");
                            break;
                        case 4:
                            edit.setText(test / d + "");
                            break;
                    }
                    cc=edit.getText().toString();
               }catch(Exception e){
                   Toast.makeText(MainActivity.this,e.getMessage(), Toast.LENGTH_SHORT).show();
               }

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(null);
            }
        });

        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        dev.setOnClickListener(this);


    }
    public void onclick(View v){
        if (cc.equals(edit.getText().toString())){
            edit.setText(null);
        }
        Button click=findViewById(v.getId());
        edit.setText(edit.getText()+click.getText().toString());
    }

    @Override
    public void onClick(View v) {
        try {
            test = Double.parseDouble(edit.getText().toString());
            edit.setText(null);
            count = 0;
            switch (v.getId()) {
                case R.id.sum:
                    count = 1;
                    break;
                case R.id.sub:
                    count = 2;
                    break;
                case R.id.mul:
                    count = 3;
                    break;
                case R.id.dev:
                    count = 4;
                    break;
            }
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}