package people;

import java.util.Scanner;

public class Emparttime extends Employee {
public int GioTangCa;
public final float TIEN_TANG_CA=15;
public final int  GIO_PARTTIME=6;
public final float LUONG_MOTGIO_PARTTIME=30;
public void Nhappt() {
	super.nhapTT();
	Scanner sc= new Scanner(System.in);
	System.out.print("Moi ban nhap so gio tang luong: ");
	GioTangCa=sc.nextInt();
	
}
public void Inpt() {
	super.inTT();
	System.out.print("So gio tang ca: "+GioTangCa+"\n");
}
public float Luong_Cungpt() {
	 Salary=LUONG_MOTGIO_PARTTIME*GIO_PARTTIME*Day;
	 return Salary;
 }
 public float Luong_Lamthem(float TIEN_TANG_CA) {
	 Salary=Luong_Cungpt()+TIEN_TANG_CA*GioTangCa;
	 return Salary;
 }
	 
 
}
