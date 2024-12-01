package main.NhanVien;

public class CanBoHopDong extends NhanVien{
	private double luongHopDong;
	
	public CanBoHopDong(String tenNhanVien,double luongHopDong) {
		// TODO Auto-generated constructor stub
		super(tenNhanVien);
		this.luongHopDong = luongHopDong;
	}
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return luongHopDong;
	}
	public void inThongTin() {
		System.out.println("Tên: " + tenNhanVien + ", Lương: " + tinhLuong());
	}
}
