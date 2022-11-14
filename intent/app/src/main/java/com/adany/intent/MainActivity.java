package com.adany.intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView text;
private Button act2,act3;
private final int RequstCode= 2;

	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==RequstCode){
			if(resultCode==RESULT_OK){
				String dataa=data.getStringExtra("yourname");
				Toast.makeText(this, dataa, Toast.LENGTH_SHORT).show();
			}
		}
	}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		act2=findViewById(R.id.activity2);
		act3=findViewById(R.id.activity3);
		text=findViewById(R.id.textactivity1);

		act2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent inn=new Intent(MainActivity.this,Activity2.class);
				inn.putExtra("myname","mahmoud rabie");
				startActivityForResult(inn,RequstCode);
			}
		});

		act3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,Activity3.class);
				startActivity(intent);
			}
		});


	}
}