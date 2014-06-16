package com.example.taxi;

public class KHACHHANGDTO {
	private int IDKhacHang;
	private String Email;
	private String SoDienThoai;
	private int KiemTraGPS;
	private int IDTuyenDuong;
	public KHACHHANGDTO()
	{
		
	}
	public KHACHHANGDTO(int idkhachang, String email, String sodienthoai, int kiemtragps, int idtuyenduong)
	{
		this.IDKhacHang=idkhachang;
		this.Email=email;
		this.SoDienThoai=sodienthoai;
		this.KiemTraGPS=kiemtragps;
		this.IDTuyenDuong=idtuyenduong;
	}

	public int getIDKhacHang() {
		return IDKhacHang;
	}

	public void setIDKhacHang(int iDKhacHang) {
		IDKhacHang = iDKhacHang;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public int getKiemTraGPS() {
		return KiemTraGPS;
	}

	public void setKiemTraGPS(int kiemTraGPS) {
		KiemTraGPS = kiemTraGPS;
	}

	public int getIDTuyenDuong() {
		return IDTuyenDuong;
	}

	public void setIDTuyenDuong(int iDTuyenDuong) {
		IDTuyenDuong = iDTuyenDuong;
	}
	@Override
	public String toString() {
		return "ID :"+this.IDKhacHang+"------Email:"+this.Email+"----------SoDT:"+this.SoDienThoai+"-------KiemTraGPS:"+this.KiemTraGPS+"-----IdTuyenDuong:"+this.IDTuyenDuong;
	}

}
