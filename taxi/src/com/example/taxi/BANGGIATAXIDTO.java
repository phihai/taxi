package com.example.taxi;

public class BANGGIATAXIDTO {
	private int IDBangGia;
	private String HangXe;
	private String LoaiXe;
	private int SoCho;
	private float GiaMoCua;
	private float GiaNhoHon31km;
	private float GiaLonHon31km;
	
	public BANGGIATAXIDTO(int iDBangGia, String hangXe, String loaiXe,
			int soCho, float giaMoCua, float giaNhoHon31km, float giaLonHon31km) {
		super();
		IDBangGia = iDBangGia;
		HangXe = hangXe;
		LoaiXe = loaiXe;
		SoCho = soCho;
		GiaMoCua = giaMoCua;
		GiaNhoHon31km = giaNhoHon31km;
		GiaLonHon31km = giaLonHon31km;
	}

	public BANGGIATAXIDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getIDBangGia() {
		return IDBangGia;
	}

	public void setIDBangGia(int iDBangGia) {
		IDBangGia = iDBangGia;
	}

	public String getHangXe() {
		return HangXe;
	}

	public void setHangXe(String hangXe) {
		HangXe = hangXe;
	}

	public String getLoaiXe() {
		return LoaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		LoaiXe = loaiXe;
	}

	public int getSoCho() {
		return SoCho;
	}

	public void setSoCho(int soCho) {
		SoCho = soCho;
	}

	public float getGiaMoCua() {
		return GiaMoCua;
	}

	public void setGiaMoCua(float giaMoCua) {
		GiaMoCua = giaMoCua;
	}

	public float getGiaNhoHon31km() {
		return GiaNhoHon31km;
	}

	public void setGiaNhoHon31km(float giaNhoHon31km) {
		GiaNhoHon31km = giaNhoHon31km;
	}

	public float getGiaLonHon31km() {
		return GiaLonHon31km;
	}

	public void setGiaLonHon31km(float giaLonHon31km) {
		GiaLonHon31km = giaLonHon31km;
	}
	@Override
	public String toString() {
		//return "id :"+this.IDBangGia+"------hangxe:"+this.HangXe+"----------loaixe:"+this.LoaiXe+"---------socho"+this.SoCho+"-----------giamocua"+this.GiaMoCua+"-----------<31km"+this.GiaNhoHon31km+"------>31km"+this.GiaLonHon31km;
		return "-----------giamocua"+this.GiaMoCua+"-----------<31km"+this.GiaNhoHon31km+"------>31km"+this.GiaLonHon31km;
	}
	
	

}
