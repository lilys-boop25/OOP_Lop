package main.CongTy;
import java.util.ArrayList;
import java.util.List;

import main.NhanVien.NhanVien;
public class CongTy {
	private String tenCongTy;
	private int soNhanVien;
	public static int SO_NV_MAX;
	public static double loiNhuan;
	public List<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
	public CongTy(String tenCongTy, double loiNhuan) {
		this.tenCongTy = tenCongTy;
        CongTy.loiNhuan = loiNhuan;
	}
	public boolean themNV(NhanVien nv1) {
		return danhSachNhanVien.add(nv1);
	}
	public void inThongTin() {
		System.out.println("Tên công ty: " + tenCongTy);
		for(NhanVien nv : danhSachNhanVien) {
			nv.inThongTin();
		}
	}
	public double tinhTongLuong() {
		double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
	}
}
