import java.util.Scanner;
public class Slide_35 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.print("Moi ban nhap vao hai so nguyen: ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) System.out.print("so nho nhat la: "+b);
		else  System.out.print("so nho nhat la: "+a);
	}
}
