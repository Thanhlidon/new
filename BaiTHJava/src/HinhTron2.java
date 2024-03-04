import java.util.Scanner;

public class HinhTron2 {
final float PI=3.14f;
float r,cv,dt;
void nhapBanKinh() {
	System.out.print("Hay nhap vao ban kinh");
	Scanner sc=new Scanner(System.in);
	r=sc.nextFloat();
}
float tinhChuVi() {
	cv=2*PI*r;
	return cv;
}
void tinhDienTich() {
	dt=PI*r*r;
}
float getBanKinh() {
	return r;}
	boolean vongTronLon() {
		if(r>10) {
			return true;
		} else return false;
	}

}

