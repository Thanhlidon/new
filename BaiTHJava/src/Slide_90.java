import java.util.Scanner;

public class Slide_90 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String chuoi;
	char kytu;
	System.out.print("Moi ban nhap 1 chuoi bat ky: ");
	chuoi=sc.nextLine();
	System.err.print("Cac ky tu co trong chuoi la: ");
	for (int i=0;i<chuoi.length();i++){
		kytu=chuoi.charAt(i);
		System.out.println(kytu);
	}
}
}
