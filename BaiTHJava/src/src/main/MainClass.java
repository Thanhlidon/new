package main;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;
public class MainClass {
	public static void main(String[] args) {
		HinhTron ht=new HinhTron()	;
		ht.xuatTen();
		ht.nhapBanKinh();
		ht.tinhChuVi();
		ht.tinhDienTich();
		ht.inChuVi();
		ht.inDienTich();
		HinhTru hT= new HinhTru();
		hT.xuatTen();
		hT.nhapChieuCao();
		hT.tinhTheTich();
		ht.inTheTich();
		HinhChuNhat hcn= new HinhChuNhat();
		hcn.xuatTen();
		hcn.nhapChieuDai();
		hcn.nhapChieuRong();
		hcn.tinhChuVi();
		hcn.tinhDIenTich();
		hcn.inChuVi();
		hcn.inDienTich();
		HinhVuong hv= new HinhVuong();
		hv.xuatTen();
		hv.nhapCanh();
		hv.tinhChuVi();
		hv.tinhDIenTich();
		hv.inChuVi();
		hv.inDienTich();
	}	
}
