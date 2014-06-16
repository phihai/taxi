package com.example.taxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;



public class banggia_taxi extends Activity {
	private static final String banggia="BANGGIATAXI";
	ArrayList<String> arr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.banggia_taxi);
		Spinner spin=(Spinner) findViewById(R.id.spinner1);
		ListView dsbanggia=(ListView)findViewById(R.id.listdsbanggia);
		arr=new ArrayList<String>();
		File f = new File(getCacheDir()+"/taxi_data.db");
		
		  if (!f.exists()) try {

		    InputStream is = getAssets().open("taxi_data.db");
		     int size = is.available();
		   
		    byte[] buffer = new byte[size];
		    is.read(buffer);
		    is.close();

		   
		    FileOutputStream fos = new FileOutputStream(f);
		    fos.write(buffer);
		    fos.close();
		    
		  } catch (Exception e) { throw new RuntimeException(e); }
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
	
		String sql="select HangXe from " +banggia;
		Cursor cursor=data.rawQuery(sql, null);
		int i=0;
		if(cursor.moveToFirst())
		{
			do{
				
				arr.add(cursor.getString(0));
			}
			while(cursor.moveToNext());
		}
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr); 
	    adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
	    spin.setAdapter(adapter);
		spin.setOnItemSelectedListener(new MyProcessEvent());
		
	}
	private class MyProcessEvent implements OnItemSelectedListener
	{

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			
			//String sql="Select GiaMoCua, GiaNhoLon31km, GiaLonHon31km from BANGGIATAXI where HangXe=" +arr[arg2];
		   //Toast.makeText(banggia_taxi.this,arg2 , Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			
			
		}
		
	}
}


