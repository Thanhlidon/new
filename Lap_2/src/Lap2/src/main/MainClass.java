package main;
import people.Person;


import people.Employee;

import java.util.Scanner;

import people.Emfulltime;
import people.Emparttime;

public class MainClass {
public static void main(String[] args) {
	Emfulltime emf= new Emfulltime();
	Emparttime emp =new Emparttime();
	int n;
	System.out.print("\nBan la:"+"\n"+"1: Nhan vien fulltime"+"\n"+"2: Nhan vien parttime"+"\n");
	Scanner sc =new Scanner (System.in);
	do { System.out.print("Moi ban nhap so: ");
		n=sc.nextInt();
	} while (n<=0||n>=3);
	switch(n) {
	case 1:{
		emf.Nhapft();
		emf.Inft();
		System.out.println("Luong cung cua ban la: "+emf.Luong_Cung()+"\n");
		System.out.println("Luong mem cua ban la: "+emf.Luong_Mem(1.75f)+"\n");
		break;
	}
	case 2:{
		emp.Nhappt();
		emp.Inpt();
		System.out.print("Luong cung cua ban la: "+emp.Luong_Cungpt()+"\n");
		System.out.print("Luong lam them cua ban la: "+emp.Luong_Lamthem(15)+"\n");
}
	}
	
}
}
