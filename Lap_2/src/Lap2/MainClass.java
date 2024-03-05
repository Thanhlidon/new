package Lap2;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	TinhLuong TL=new TinhLuong();
	Scanner sc=new Scanner(System.in);
	System.out.print("Moi ban nhap ten nhan vien: ");
	TL.setTen(sc.nextLine());
	System.out.print("Moi ban nhap so ngay cong: ");
	TL.setNgayLam(sc.nextInt());
	System.out.print("Moi ban nhap doanh thu: ");
	TL.setDoanhThu(sc.nextFloat());
	System.out.print("Luong cung cua ban la: "+TL.tinhluong()+"k(VND)\n");
    System.out.print("Luong thuc te cua ban la: "+TL.tinhluong(2000, 0.1f)+"k(VND)\n");
}

}

