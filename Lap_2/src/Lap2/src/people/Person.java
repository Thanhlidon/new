package people;

import java.util.Scanner;

public class Person {
	public String Name,Gender,Adress,Id;
	public int Age;
	public void NhapTT(){
	Scanner sc= new Scanner(System.in);
	System.out.print("Ten: ");
	Name=sc.nextLine();
	System.out.print("Tuoi: ");
	Age= Integer.parseInt(sc.nextLine());
	System.out.print("Gioi tinh: ");
    Gender= sc.nextLine();
  
	System.out.print("Dia chi: ");
	Adress = sc.nextLine();
	System.out.print("So CCCD: ");
	Id= sc.nextLine();
	}
	public void InTT() {
		System.out.print("Ten: "+Name+"\n"+"Tuoi: "+Age+"\n"+"Gioi tinh:  "+Gender+"\n"+"Dia chi: "+Adress+"\n"+"So CCCD: "+Id+"\n");
	}
}
