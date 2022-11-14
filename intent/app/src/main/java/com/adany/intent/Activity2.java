package com.adany.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
Button button1,button3;
TextView texx;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		texx=findViewById(R.id.text2);
		button1=findViewById(R.id.but11);
		button3=findViewById(R.id.but33);

		Bundle bundle=getIntent().getExtras();
		texx.setText(bundle.getString("myname"));

		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent backintent=getIntent();
				backintent.putExtra("yourname","ahmed adany");
				setResult(RESULT_OK,backintent);
				finish();
			}
		});

		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =new Intent(Activity2.this,Activity3.class);
				startActivity(intent);
			}
		});
	}
}