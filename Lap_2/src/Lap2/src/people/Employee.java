package people;

import java.util.Scanner;

public class Employee extends Person {
	public String Idnv;
	public float Salary;
	public int Day;
	public void nhapTT() {
		super.NhapTT();
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap ma nhan vien: ");
	Idnv=sc.nextLine();
	System.out.print("Nhap so ngay lam viec: ");
	Day=sc.nextInt();
   }
	 public void inTT() {
		super.InTT();
		System.out.print("Ma nhan vien: "+Idnv+"\n"+"So ngay di lam: "+Day+"\n");
	}
}
