package main.NhanVien;
import main.CongTy.CongTy;
public class GiamDoc extends CanBoCoHuu implements QuanLy{
	private double phuCap;
	public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap) {
		// TODO Auto-generated constructor stub
		super(tenNhanVien, luongCoBan, heSoLuong);
		this.phuCap = phuCap;
	}
	public double tinhHoaHong() {
		return CongTy.loiNhuan * 0.05;
	}
	public double tinhLuong() {
		return super.tinhLuong() + phuCap + tinhHoaHong();
	}
	public void inThongTin() {
		System.out.println("Giám đốc: " + tenNhanVien + ", Lương: " + tinhLuong());
	}
}
