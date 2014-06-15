package com.example.taxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class interface_user extends Activity{
	    
	    Button bntgiataxi;
	    Button bntstart;
	    Button btnHanhTrinh;
	    @Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.userinterface);
			bntgiataxi=(Button)findViewById(R.id.bntbanggia);
			bntstart=(Button)findViewById(R.id.bntstart);
			btnHanhTrinh=(Button)findViewById(R.id.button2);
			
			bntstart.setOnClickListener(btnError);
			btnHanhTrinh.setOnClickListener(btnError);
			
			bntgiataxi.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					
					Intent intent=new Intent(interface_user.this,banggia_taxi.class);
					startActivity(intent);
					
				}
			});
			
			
			
			
		}
	    private OnClickListener btnError = new OnClickListener() {
			@Override
			public void onClick(View v) {				 
				Intent intent=new Intent(interface_user.this,error_activity.class);
				startActivity(intent);
			}
		};
	
}
