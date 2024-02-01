package Lap2;
import java.util.Scanner;
public class Bai_5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0, n;
        String str ="";
        while (s<=100) {
            System.out.print("Moi ban nhap 1 so ");
            n=sc.nextInt(); 
            s=s+n;
            str=str+n+ " + ";                     
             }
             str = str.substring(0, str.length()-3);
             System.out.print("Tong cua cac so la: "+ str + " = "+s);  
    }
}
