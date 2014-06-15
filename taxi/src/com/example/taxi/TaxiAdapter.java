package com.example.taxi;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TaxiAdapter extends BaseAdapter {

	private Activity activity;
	private List<BANGGIATAXIDTO> data;
	private LayoutInflater inflater;
	 
	public TaxiAdapter(Activity activity, List<BANGGIATAXIDTO> data) {
		this.activity = activity;
		this.data = data;
		inflater = (LayoutInflater) activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		return data.size();
	}
	@Override
	public Object getItem(int arg0) {
		return data.get(arg0);
	}
	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		Holder h = null;
		final BANGGIATAXIDTO item = data.get(position);
		if(view == null) {
			view = inflater.inflate(R.layout.list_item, null);
			h = new Holder();
			h.taxi_name = (TextView) view.findViewById(R.id.taxi_name);
			h.taxi_des = (TextView) view.findViewById(R.id.taxi_description);
			h.taxi_price = (TextView) view.findViewById(R.id.taxi_price);
			h.taxi_price1 = (TextView) view.findViewById(R.id.taxi_price1);
			h.taxi_price2 = (TextView) view.findViewById(R.id.taxi_price2);
			view.setTag(h);
		} else {
			h = (Holder) view.getTag();
		}
		h.taxi_name.setText(item.getHangXe());
		//h.taxi_des.setText(item.description);
		h.taxi_price.setText(String.valueOf(item.getGiaMoCua()) + " /1-12km");
		h.taxi_price1.setText(String.valueOf(item.getGiaNhoHon31km() + " /12-18km"));
		h.taxi_price2.setText(String.valueOf(item.getGiaLonHon31km())+ " /trên 18km");
		return view;
	}
	
	public class Holder {
		TextView taxi_name,taxi_des, taxi_price, taxi_price1, taxi_price2;
	}
}
