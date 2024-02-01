import java.util.Scanner;

public class Giaiptbac1 {
public static void main(String[] args) {
	double a,b,x;
	  Scanner sc= new Scanner(System.in);
	 System.out.print("Moi ban nhap so a= ");
	 a=sc.nextDouble();
	 System.out.print("Moi ban nhap so b= ");
	 b=sc.nextDouble();
	 if (a==0) {
		 if (b==0) System.out.print("Phuong trinh vo so nghiem");
		 else System.out.print("Phuong trinh vo nghiem");
	 }  
     else { x=-b/a;
    	 System.out.print("Phuong trinh co nghiem x= "+x);
	
}
	
}
}
