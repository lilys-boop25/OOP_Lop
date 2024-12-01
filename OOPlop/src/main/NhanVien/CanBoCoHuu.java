package main.NhanVien;

public class CanBoCoHuu extends NhanVien {
	protected double luongCoBan;
	protected double heSoLuong;
	
	public CanBoCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
		// TODO Auto-generated constructor stub
		super(tenNhanVien);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	@Override
	public double tinhLuong() {
		return luongCoBan *  heSoLuong;
	}
	@Override
	public void inThongTin() {
		System.out.println("Tên: " + tenNhanVien + ", Lương: " + tinhLuong());
	}
}
