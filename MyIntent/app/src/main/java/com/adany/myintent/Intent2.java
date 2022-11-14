package com.adany.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Intent2 extends AppCompatActivity {
TextView text;
Button but1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent2);

		Bundle bun=getIntent().getExtras();
		String s= bun.getString("name");
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();


		text=findViewById(R.id.text2);
		but1=findViewById(R.id.activity11);

		but1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=getIntent();
				intent.putExtra("welcome massage","back intent from activity second");
				setResult(RESULT_OK,intent);
				finish();
			}
		});


	}
}