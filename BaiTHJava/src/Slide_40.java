import java.util.Scanner;
public class Slide_40 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Moi ban nhap ngay:");
		n=sc.nextInt();
		switch (n) {
		case 1: System.out.println("Sunday"); break;
		case 2:	System.out.println("Monday"); break;
		case 3:	System.out.println("Tuesday"); break;
		case 4:	System.out.println("Wednesday"); break;
		case 5:	System.out.println("Thursday"); break;
		case 6:	System.out.println("Friday"); break;
		case 7:	System.out.println("Saturday"); break;
		default: System.out.print("Ban nhap ngay khong hop le");
			
		}
	}
}
