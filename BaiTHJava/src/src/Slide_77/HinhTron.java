package Slide_77;

import java.util.Scanner;

public class HinhTron  extends HinhHoc{
 protected float banKinh;
 private Scanner scanner;
 	public HinhTron() {
 		super();
 		scanner =new Scanner(System.in);
 	}
 	public void nhapBanKinh() {
 		System.out.print("Ban dung don vi nao: ");
 		System.out.print("\t1 - Centimet");
 		System.out.print("\t2 - Inch");
 		Configs.donVi= scanner.nextFloat();
 		System.out.print("Nhap ban kinh hinh tron: ");
 		banKinh= scanner.nextFloat();
 	
 	}
 	public void inThongTin() {
 		if(Configs.donVi==Configs.DON_VI_CM) {
 			System.out.print("Hinh tron co ban kinh: "+banKinh+"cm");
 			System.out.print("Tuong duong: "+Configs.Chuyencmsanginch(banKinh)+"inch" );
 		}else {
 			System.out.print("Hinh tron co ban kinh: "+banKinh+"inch");
 			System.out.print("Tuong duong: "+Configs.Chuyeninchsangcm(banKinh)+"cm");
 		}
 	}
}
