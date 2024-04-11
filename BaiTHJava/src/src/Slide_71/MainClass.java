package Slide_71;

public class MainClass {
public static void main(String[] args) {
	HinhTron ht= new HinhTron();
	ht.setBanKinh(10);
	float chuVi=ht.tinhChuVi();
    float dienTich=ht.tinhDienTich();
    System.out.print("Chu vi: "+chuVi+" "+"Dien tich: "+dienTich);
}
}
