package com.example.taxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interface_user extends Activity{
	    
	    Button bntgiataxi;
	    @Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.userinterface);
			bntgiataxi=(Button)findViewById(R.id.bntbanggia);
			bntgiataxi.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					
					Intent intent=new Intent(interface_user.this,banggia_taxi.class);
					startActivity(intent);
					
				}
			});
			
			
		}
	
}
