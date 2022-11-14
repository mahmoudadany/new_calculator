package com.adany.myintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textac1;
Button but2;
private final int requstcode=110;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textac1=findViewById(R.id.text1);
		but2=findViewById(R.id.activity2);

		but2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,Intent2.class);
				intent.putExtra("name","mahmoud rabie");
				startActivityForResult(intent,requstcode);
			}
		});



	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==requstcode){
			if(resultCode==RESULT_OK){
				String s=data.getStringExtra("welcome massage");
				Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
			}
		}
	}
}