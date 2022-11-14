package com.adany.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
TextView textt;
Button butt1,butt3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3);
		textt=findViewById(R.id.textactivity3);
		butt1=findViewById(R.id.but111);
		butt3=findViewById(R.id.but222);

		butt1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		});

		butt3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(Activity3.this,Activity2.class);
				startActivity(intent);
			}
		});

	}
}