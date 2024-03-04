import java.util.Scanner;

public class MainClass2 {
public static void main(String[] args) {
	HinhTron2 HT= new HinhTron2();
	HT.nhapBanKinh();
	if(HT.vongTronLon()) {
		System.out.print("Hinh tron co ban kinh "+HT.getBanKinh());
	}else 
		
		System.out.print("Chu vi Hinh tron: "+HT.tinhChuVi());
}

}

