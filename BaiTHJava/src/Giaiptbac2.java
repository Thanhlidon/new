import java.util.Scanner;
public class Giaiptbac2 {
	public static void main(String[] args) {
		 double a,b,c,x,x1,x2,delta;
		  Scanner sc= new Scanner(System.in);
		 System.out.print("Moi ban nhap so a= ");
		 a=sc.nextDouble();
		 System.out.print("Moi ban nhap so b= ");
		 b=sc.nextDouble();
		 System.out.print("Moi ban nhap so c= ");
		 c=sc.nextDouble();
		 if (a==0) {
			 if(b==0) {
				 if(c==0)
					 System.out.print("Phuong trinh vo so nghiem!");}
			 else { x=-c/b;
			        System.out.print("Phuong tring co nghiem x="+x);}
		
		              }
		delta= b*b - 4*a*c;	 
		 if (delta > 0) {
	            x1 =  ((-b + Math.sqrt(delta)) / (2*a));
	            x2 =  ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!"); 
			 
		 
	        		}
		}
}
