package Lap2;

import java.util.Scanner;

public class Bai_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int Tong =0;
		for (int i=0;i<20;i++) {
			Tong+=i;
		}
		System.out.print("Tong 20 so nguyen duong dau tien la: "+Tong);
	}
}
