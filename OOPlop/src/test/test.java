package test;

import main.CongTy.CongTy;
import main.NhanVien.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongTy congTy = new CongTy("Công ty ABC", 500000);

        NhanVien cb1 = new CanBoCoHuu("Nguyễn Văn A", 5000, 2.5);
        NhanVien cb2 = new CanBoHopDong("Trần Thị B", 7000);
        NhanVien gd = new GiamDoc("Lê Văn C", 10000, 3.0, 2000);
        NhanVien tp = new TruongPhong("Hoàng Minh D", 8000, 2.0, 1500);

        congTy.themNV(cb1);
        congTy.themNV(cb2);
        congTy.themNV(gd);
        congTy.themNV(tp);

        congTy.inThongTin();
        System.out.println("Tổng lương: " + congTy.tinhTongLuong());
	}

}
