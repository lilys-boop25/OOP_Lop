package main.NhanVien;

import main.CongTy.CongTy;

public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{

	public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong) {
		// TODO Auto-generated constructor stub
		super(tenNhanVien, luongCoBan, heSoLuong);
	}
	public double tinhHoaHong() {
		return CongTy.loiNhuan * 0.02;
	}
	@Override
	public double tinhLuong() {
		return super.tinhLuong() + tinhHoaHong();
	}
	@Override
	public void inThongTin() {
		System.out.println("Quản lý: " + tenNhanVien + ", Lương: " + tinhLuong());
	}
	
}
