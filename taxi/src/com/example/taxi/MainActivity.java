package com.example.taxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private static final String Datetablename="taxi_data.db";
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button bnt=(Button)findViewById(R.id.bntstart);
		bnt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				SQLiteDatabase database=openOrCreateDatabase(Datetablename, MODE_PRIVATE, null);  
				Intent intent=new Intent(MainActivity.this,interface_user.class);
				startActivity(intent);
				
			}
		});
		
		
	}
}
