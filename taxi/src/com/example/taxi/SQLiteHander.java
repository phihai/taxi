package com.example.taxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;




public class SQLiteHander extends Activity{
	
	private static final String Datetablename="taxi_data.db";
	private static final String banggia="BANGGIATAXI";
	private static final String khachhang="KHACHHANG";
	private static final String tuyenduong="TUYENDUONG";
	private static final String tuyenduongthucthe="TUYENDUONGTHUCTHE";
	
	//them gia tri vao bang taxi
	public void insertbanggiataxi(BANGGIATAXIDTO taxi)
	{
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
		ContentValues content=new ContentValues();
		content.put("IDBangGia", taxi.getIDBangGia());
		content.put("HangXe", taxi.getHangXe());
		content.put("LoaiXe", taxi.getLoaiXe());
		content.put("SoCho", taxi.getSoCho());
		content.put("GiaMoCua", taxi.getGiaMoCua());
		content.put("GiaNhoHon31km", taxi.getGiaNhoHon31km());
		content.put("GiaLonHon31km", taxi.getGiaLonHon31km());
		data.insert(banggia, null, content);
		
	}
	//lay hang xe taxi
	public ArrayList<String> layhangxe()
	{
		SQLiteDatabase database=openOrCreateDatabase(Datetablename, MODE_PRIVATE, null);
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
		ArrayList<String>arr=new ArrayList<String>();
		String sql="select HangXe from "+banggia;
		Cursor cursor=data.rawQuery(sql, null);
		if(cursor.moveToFirst())
		{
			do{
				
				arr.add(cursor.getString(0));
			}
			while(cursor.moveToNext());
		}
		return arr;
	}
	//them khach hang moi
	public void insertkhachhang(KHACHHANGDTO kh)
	{
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
		String sql="insert into KHACHHANG values("+ kh.getIDKhacHang() +",'"+kh.getEmail().toString()+"','"+kh.getSoDienThoai().toString()+"',"+kh.getKiemTraGPS()+","+kh.getIDTuyenDuong()+")";
		data.execSQL(sql);
	}
	//lay danh sach khach hang
	public ArrayList<KHACHHANGDTO> getallkhachhang()
	{
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
		ArrayList<KHACHHANGDTO>arr=new ArrayList<KHACHHANGDTO>();
		String sql="select *from "+khachhang;
		Cursor cursor=data.rawQuery(sql, null);
		if(cursor.moveToFirst())
		{
			do{
				KHACHHANGDTO kh=new KHACHHANGDTO();
				kh.setIDKhacHang(cursor.getInt(0));
				kh.setEmail(cursor.getString(1));
				kh.setSoDienThoai(cursor.getString(2));
				kh.setKiemTraGPS(cursor.getInt(3));
				kh.setIDTuyenDuong(cursor.getInt(4));
				arr.add(kh);
			}
			while(cursor.moveToNext());
		}
		return arr;
	}
	//lay gia cua cac hang taxi
	public ArrayList<BANGGIATAXIDTO> laybanggiataxitheoid(int idbanggia)
	{
		ArrayList<BANGGIATAXIDTO>arr=new ArrayList<BANGGIATAXIDTO>();
		SQLiteDatabase data=openOrCreateDatabase(getCacheDir()+"/taxi_data.db", MODE_PRIVATE, null);
		String sql="select GiaMoCua, GiaNhoHon31km, GiaLonHon31km from BANGGIATAXI where IDBangGia = "+idbanggia;
		Cursor cursor=data.rawQuery(sql, null);
		if(cursor.moveToFirst())
		{
			do{
				BANGGIATAXIDTO taxi=new BANGGIATAXIDTO();
				taxi.setGiaMoCua(cursor.getFloat(0));
				taxi.setGiaNhoHon31km(cursor.getFloat(1));
				taxi.setGiaLonHon31km(cursor.getFloat(2));
				arr.add(taxi);
			}
			while(cursor.moveToNext());
		}
		return arr;
	}

	
	

}
