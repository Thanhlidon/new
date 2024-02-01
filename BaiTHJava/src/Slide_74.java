import java.util.Scanner;

public class Slide_74 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner (System.in) ; 
	do {System.out.print("Moi ban nhap so phan tu mang:");
	    n=sc.nextInt();
		
	} while (n<0);
	int A[]=new int [n];
	System.out.println("Moi nhap cac phan tu cho mang:");
	for (int i=0;i<n;i++) {
		System.out.print("Nhap phan tu thu "+i+":");
		A[i]= sc.nextInt();
	}
	double tong=0;
	for(int i=0;i<n;i++) {
		if (A[i]%2==0) tong+=A[i];
	}
	System.out.print("Tong: "+tong);
}
}
