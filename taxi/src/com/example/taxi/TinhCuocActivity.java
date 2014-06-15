package com.example.taxi;

public class TinhCuocActivity {
	float _khoangcach;
	float _giaduoi31;
	float _giatren31;
	
	public float TinhCuoc()
	{
		float kq = 0;
		if(_khoangcach<=31)
		{
			kq += _khoangcach*_giaduoi31;
		}else{
			
			kq += _khoangcach*_giatren31;
		}
		return kq;
	}
}
