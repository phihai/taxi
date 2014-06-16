package com.example.taxi;

public class TUYENDUONGTHUCTEDTO {

	private int IDTuyenDuongThucTe;
	private String DiaDiemHienTai;
	private float KhoangCachDiDuoc;
	private float GiaCuocHienTai;
	private int IDTuyenDuong;
	
	public TUYENDUONGTHUCTEDTO(int iDTuyenDuongThucTe, String diaDiemHienTai,
			float khoangCachDiDuoc, float giaCuocHienTai, int iDTuyenDuong) {
		super();
		IDTuyenDuongThucTe = iDTuyenDuongThucTe;
		DiaDiemHienTai = diaDiemHienTai;
		KhoangCachDiDuoc = khoangCachDiDuoc;
		GiaCuocHienTai = giaCuocHienTai;
		IDTuyenDuong = iDTuyenDuong;
	}

	public int getIDTuyenDuongThucTe() {
		return IDTuyenDuongThucTe;
	}

	public void setIDTuyenDuongThucTe(int iDTuyenDuongThucTe) {
		IDTuyenDuongThucTe = iDTuyenDuongThucTe;
	}

	public String getDiaDiemHienTai() {
		return DiaDiemHienTai;
	}

	public void setDiaDiemHienTai(String diaDiemHienTai) {
		DiaDiemHienTai = diaDiemHienTai;
	}

	public float getKhoangCachDiDuoc() {
		return KhoangCachDiDuoc;
	}

	public void setKhoangCachDiDuoc(float khoangCachDiDuoc) {
		KhoangCachDiDuoc = khoangCachDiDuoc;
	}

	public float getGiaCuocHienTai() {
		return GiaCuocHienTai;
	}

	public void setGiaCuocHienTai(float giaCuocHienTai) {
		GiaCuocHienTai = giaCuocHienTai;
	}

	public int getIDTuyenDuong() {
		return IDTuyenDuong;
	}

	public void setIDTuyenDuong(int iDTuyenDuong) {
		IDTuyenDuong = iDTuyenDuong;
	}
	
}
