package Lap2;
import java.util.Scanner;
public class Bai_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int demInthuong=0,demSo=0,demInhoa=0;
		System.out.print("Moi ban nhap vao mot chuoi: ");
		str=sc.nextLine();

		for (int i=0;i<str.length();i++) {
		    char c=str.charAt(i);
			int asciiValue=(int)c;
			if (asciiValue>=48&&asciiValue<=57)
				demSo++;
			else if (asciiValue>=65&&asciiValue<=90)
			demInhoa++;
			else if(asciiValue>=97&&asciiValue<=122)
				demInthuong++;
		}
		System.out.println("So ky tu thuong la: "+demInthuong);
		System.out.println("So ky tu hoa la: "+demInhoa);
		System.out.println("So ky tu so la: "+demSo);
		
		}
}
