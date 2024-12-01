package main.NhanVien;

public abstract class NhanVien {
	protected String tenNhanVien;
	
	public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
	public abstract double tinhLuong();
	
	public abstract void inThongTin();
}
