package com.example.taxi;

public class TUYENDUONGDTO {
	
	private int IDTuyenDuong;
	private String DiaDiemXuatPhat;
	private String DiaDiemDen;
	private float KhoanCach;
	private float GiaCuocDuKien;
	private int IDBangGia;
	
	public TUYENDUONGDTO(int idtuyenduong, String diadiemxuatphat, String diadiemden, float khoancach, float giacuocdukien, int idbanggia)
	{
		this.IDTuyenDuong=idtuyenduong;
		this.DiaDiemXuatPhat=diadiemxuatphat;
		this.DiaDiemDen=diadiemden;
		this.KhoanCach=khoancach;
		this.GiaCuocDuKien=giacuocdukien;
		this.IDBangGia=idbanggia;
	}

	public int getIDTuyenDuong() {
		return IDTuyenDuong;
	}

	public void setIDTuyenDuong(int iDTuyenDuong) {
		IDTuyenDuong = iDTuyenDuong;
	}

	public String getDiaDiemXuatPhat() {
		return DiaDiemXuatPhat;
	}

	public void setDiaDiemXuatPhat(String diaDiemXuatPhat) {
		DiaDiemXuatPhat = diaDiemXuatPhat;
	}

	public String getDiaDiemDen() {
		return DiaDiemDen;
	}

	public void setDiaDiemDen(String diaDiemDen) {
		DiaDiemDen = diaDiemDen;
	}

	public float getKhoanCach() {
		return KhoanCach;
	}

	public void setKhoanCach(float khoanCach) {
		KhoanCach = khoanCach;
	}

	public float getGiaCuocDuKien() {
		return GiaCuocDuKien;
	}

	public void setGiaCuocDuKien(float giaCuocDuKien) {
		GiaCuocDuKien = giaCuocDuKien;
	}

	public int getIDBangGia() {
		return IDBangGia;
	}

	public void setIDBangGia(int iDBangGia) {
		IDBangGia = iDBangGia;
	}
	

}
