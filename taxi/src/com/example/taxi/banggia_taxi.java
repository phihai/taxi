package com.example.taxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import com.example.taxi.TaxiAdapter;

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




public class banggia_taxi extends Activity {
	private static final String banggia="BANGGIATAXI";
	ArrayList<String> arr;
	String array[]=null;
	ListView dsbanggia;
	String hangxe=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_activity);	
		dsbanggia=(ListView)findViewById(R.id.dsbanggiataxi);
		arr=new ArrayList<String>();
		
		/*File f = new File(getCacheDir()+"/taxi_data.db");
		
		  if (!f.exists()) try {

		    InputStream is = getAssets().open("taxi_data.db");
		     int size = is.available();
		   
		    byte[] buffer = new byte[size];
		    is.read(buffer);
		    is.close();

		   
		    FileOutputStream fos = new FileOutputStream(f);
		    fos.write(buffer);
		    fos.close();
		    
		  } catch (Exception e) { throw new RuntimeException(e); }*/
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
	
		String sql="select HangXe,GiaMoCua,GiaNhoHon31km,GiaLonHon31km from BANGGIATAXI";
		ArrayList<BANGGIATAXIDTO>ds=new ArrayList<BANGGIATAXIDTO>();
		Cursor cursor=data.rawQuery(sql, null);
		if(cursor.moveToFirst())
		{
			do{
				BANGGIATAXIDTO banggiataxi=new BANGGIATAXIDTO();
				banggiataxi.setHangXe(cursor.getString(0));
				banggiataxi.setGiaMoCua(cursor.getFloat(1));
				banggiataxi.setGiaNhoHon31km(cursor.getFloat(2));
				banggiataxi.setGiaLonHon31km(cursor.getFloat(3));
				ds.add(banggiataxi);
			}
			while(cursor.moveToNext());
		}
		//ArrayAdapter<BANGGIATAXIDTO >dapter=new ArrayAdapter<BANGGIATAXIDTO>(banggia_taxi.this,android.R.layout.simple_list_item_1,ds);
		dsbanggia.setAdapter(new TaxiAdapter(this, ds));
	}
	/*private class MyProcessEvent implements OnItemSelectedListener
	{

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			ArrayList<BANGGIATAXIDTO>ds=new ArrayList<BANGGIATAXIDTO>();
			SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
			String sql="Select GiaMoCua, GiaNhoHon31km, GiaLonHon31km from BANGGIATAXI where HangXe='" + array[arg2] + "'";
			Cursor cursor=data.rawQuery(sql, null);
			if(cursor.moveToFirst())
			{
				do{
					BANGGIATAXIDTO banggiataxi=new BANGGIATAXIDTO();
					banggiataxi.setGiaMoCua(cursor.getFloat(0));
					banggiataxi.setGiaNhoHon31km(cursor.getFloat(1));
					banggiataxi.setGiaLonHon31km(cursor.getFloat(2));
					ds.add(banggiataxi);
				}
				while(cursor.moveToNext());
			}
			ArrayAdapter<BANGGIATAXIDTO >dapter=new ArrayAdapter<BANGGIATAXIDTO>(banggia_taxi.this,android.R.layout.simple_list_item_1,ds);
			dsbanggia.setAdapter(dapter);	
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			
			
		}
		
	}*/
    
	
}


