import java.util.Scanner;
public class Slide_30 {
	public static int Tongcacso(int n) {
		int sum =0;
		while (n>0) {
			sum+=n%10;
			n/=10;
		} return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do {
			System.out.print(" Moi ban nhap mot so:");
			n=sc.nextInt();
		} while(n<0);
			System.out.print("Tong cac chu so cua so la:"+Tongcacso(n));
	}
}
