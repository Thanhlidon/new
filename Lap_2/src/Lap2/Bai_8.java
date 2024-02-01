package Lap2;
import java.util.Scanner;
public class Bai_8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		double AVG=0;
		do {System.out.print("Moi nhap so phan tu cua day: ");
		 n=sc.nextInt();
			
		} while (n<=0);
		int A[]=new int[n];
		System.out.println("Cac phan tu cua day la: ");
		for(int i=0;i<n;i++) {
			System.out.print(" A["+i+"]: " );
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			AVG+=A[i];
			
		}
		AVG/=n;
		System.out.print("Gia tri trung binh cua day la: "+AVG);
}
}