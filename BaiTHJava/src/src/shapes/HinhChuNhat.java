package shapes;

import java.util.Scanner;

public class HinhChuNhat  extends HinhHoc{
	public float dai,rong;
	
	public HinhChuNhat() {
		ten="Hinh Chu Nhat";
	}
	public void nhapChieuDai() {
		System.out.print("Chieu dai= ");
		Scanner sc= new Scanner(System.in);
		dai=sc.nextFloat();
	}
	public void nhapChieuRong() {
		System.out.print("Chieu rong= ");
		Scanner sc= new Scanner(System.in);
		rong=sc.nextFloat();
	}
	public void tinhChuVi() {
		chuVi= 2*(dai+rong);
	}
	public void tinhDIenTich() {
		dienTich=dai*rong;
	}
}
