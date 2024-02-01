package Lap2;
import java.util.Scanner;
public class Bai_6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do { System.out.print("Moi ban nhap vao mot so: ");
			n=sc.nextInt();
		} while (n<0);
		int gt=1;
		for(int i=1;i<=n;i++) {
			
			gt*=i;
		}
			
		System.out.println("Giai thua cua "+n+" la: "+gt);
	}
}
