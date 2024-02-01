package Lap2;
import java.util.Scanner;
public class Bai_1 {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		double a,b,tong,hieu,tich,thuong,du;
		System.out.print("Moi ban nhap hai so :");
		a=sc.nextInt();
		b=sc.nextInt();
		tong =a+b;
		hieu=a-b;
		tich=a*b;
		thuong=a/b;
		du=a%b;
		System.out.println("Tong cua 2 so la:"+tong);
		System.out.println("Hieu cua 2 so la:"+hieu);
		System.out.println("Tich cua 2 so la:"+tich);
		System.out.println("Thuong cua 2 so la:"+thuong);
		System.out.println("Phan du cua 2 so la:"+du);
		if (a==b) System.out.println("Hai so bang nhau");
		else if (a>b) System.out.println(a+" lon hon "+b);
		else  System.out.println(a+" nho hon "+b);
		
	}
}
