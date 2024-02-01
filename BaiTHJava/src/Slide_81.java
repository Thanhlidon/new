import java.util.Scanner;

public class Slide_81 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m, n;
	do {
	System.out.print("Moi nhap so hang cua ma tran: ");
		m=sc.nextInt();
		System.out.print("Moi nhap so cot cua ma tran: ");
		n=sc.nextInt();
	} while(m<=0||n<=0);
	int A[][] = new int [m][n];
	System.out.print("Moi nhap cac phan tu cua ma tran: ");
	for(int i=0;i<m;i++) {
		for (int j=0;i<n;j++) {
			System.out.print("A["+i+"]["+j+"]: " );
			A[i][j]= sc.nextInt();		
		} 
	}
	int max =A[0][0];
	for (int i=0;i<m;i++) {
		for (int j=0;j<n;j++) {
			if (max <A[i][j]) max=A[i][j];
		}
	}
	System.out.print("Phan tu lon nhat trong ma tran la = "+max);
}  
}
