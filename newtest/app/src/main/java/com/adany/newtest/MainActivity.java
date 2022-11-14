package com.adany.newtest;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
private TextView txt,txt2;
private ToggleButton tg,tg2;
private RadioGroup rg;
private RadioButton rb1,rb2,rb3,rb4,rbchecked;
private CheckBox ch1,ch2;
private Button b,but;
private RatingBar rtb,rtb2;
private Switch sch,sch2;
private CalendarView calendar,calendar2;
private AlertDialog.Builder alert,alert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        b = findViewById(R.id.bb1);
        txt = findViewById(R.id.txt);
        tg = findViewById(R.id.tb1);
        rg = findViewById(R.id.rgb);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.radioButton4);
        ch1 = findViewById(R.id.cb1);
        ch2 = findViewById(R.id.cb2);

        rtb = findViewById(R.id.rtb1);
        txt2 = findViewById(R.id.text1);
        sch = findViewById(R.id.switch1);
        calendar = findViewById(R.id.cal);
        but = findViewById(R.id.but5);

        tg2 = findViewById(R.id.mytoggle);
        sch2 = findViewById(R.id.myswitch);
        calendar2 = findViewById(R.id.mycal);
   /* rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
            rbchecked=findViewById(checkedId);
            switch (rbchecked.getId()){
                case R.id.rtb1:
                    txt.setText("java");
                    break;
                case R.id.rb2:
                    txt.setText("C++");
                    break;
                case R.id.rb3:
                    txt.setText("php");
                    break;
                case R.id.radioButton4:
                    txt.setText("roby");
            }
        }
    });

    tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                txt.setText("tern on");
            }else{
                txt.setText("tern off");
            }
        }
    });

    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            StringBuilder stb=new StringBuilder();
            if(ch1.isChecked()){
                stb.append(ch1.getText()+"\n");
            }
            if(ch2.isChecked()){
                stb.append(ch2.getText()+"\n");
            }
            txt.setText(stb);
        }
    });*/

   /* rtb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            txt2.setText(rating+"");
        }
    });

    sch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
            }
        }
    });

    calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
        @Override
        public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
            String cal="year:"+year+" / month:"+(++month)+" / day:"+dayOfMonth;
            Toast.makeText(getApplicationContext(),cal,Toast.LENGTH_LONG).show();
        }
    });

    but.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           alert=new AlertDialog.Builder(MainActivity.this);
           alert.setTitle("Exit");
           alert.setMessage("do you want exit");
           alert.setCancelable(false);
           alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   MainActivity.this.finish();
               }
           });
           alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });
           AlertDialog dialog=alert.create();
           dialog.show();
        }
    });*/

      /*  calendar2.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = "year:" + year + " / month:" + (++month) + " / day:" + dayOfMonth;
                Toast.makeText(MainActivity.this, date, Toast.LENGTH_LONG).show();
            }
        });
        tg2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                exit(isChecked);




            }
        });


    }
    public void exit(Boolean b){
        Toast.makeText(MainActivity.this, "o7onn", Toast.LENGTH_SHORT).show();

        alert2 = new AlertDialog.Builder(MainActivity.this);
        alert2.setTitle("Exit");
        alert2.setMessage("do you want exit");
        alert2.setCancelable(false);
                alert2.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });
                alert2.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog alert22=alert2.create();
                        alert22.cancel();
                    }
                });*/

    }
}