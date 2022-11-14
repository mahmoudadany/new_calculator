package com.adany.test;

import static java.lang.Double.parseDouble;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;

import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView text;
    double t1,t2;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,mal,sum,min,dev,equal;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
            text=findViewById(R.id.txt);
            sum=findViewById(R.id.bsum);
            min=findViewById(R.id.bmin);
            mal=findViewById(R.id.bx);
            dev=findViewById(R.id.bdev);
            equal=findViewById(R.id.bequal);
            b0=findViewById(R.id.b0);
            b1=findViewById(R.id.b1);
            b2=findViewById(R.id.b2);
            b3=findViewById(R.id.b3);
            b4=findViewById(R.id.b4);
            b5=findViewById(R.id.b5);
            b6=findViewById(R.id.b6);
            b7=findViewById(R.id.b7);
            b8=findViewById(R.id.b8);
            b9=findViewById(R.id.b9);



    }

    public void onclick(View v){
        Button b=findViewById(v.getId());
        String t= (String) text.getText();
        text.setText(t+b.getText());

    }
    public void ccccc( View v){
        Button bt=findViewById(v.getId());
        switch(bt.getId()){
            case R.id.bsum:
                count=1;
                t1= parseDouble(text.getText().toString());
                break;
            case R.id.bmin:
                count=2;
                t1= parseDouble(text.getText().toString());
                break;
            case R.id.bx:
                count=3;
                t1= parseDouble(text.getText().toString());
                break;
            case R.id.bdev:
                count=4;
                t1= parseDouble(text.getText().toString());
                break;
        }
        text.setText("");

    }

   /* public void subclick(View v){
        count=1;
        t1=Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void minclick(View v){
        count=2;
        t1=Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void malclick(View v){
        count=3;
        t1=Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void devclick(View v){
        count=4;
        t1=Double.parseDouble(text.getText().toString());
        text.setText("");
    }*/

    public void Click(View v) {
        t2= parseDouble(text.getText().toString());
        switch (count){
            case 1: text.setText((t1+t2)+"");
                break;
            case 2: text.setText((t1-t2)+"");
                break;
            case 3: text.setText((t1*t2)+"");
                break;
            case 4: text.setText((t1/t2)+"");
        }
    }
    public void bc(View v){
        text.setText("");
    }
}

