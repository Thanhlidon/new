package Lap2;
import java.util.Scanner;
public class Bai_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten;
        int nam, tuoi;
        System.out.print("Moi ban nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Moi ban nhap nam sinh: ");
        nam = sc. nextInt();
        tuoi = 2024 - nam;
        if (tuoi<16) System.out.println("Ban "+ten+" ban van tre trau lam");
        else if(tuoi >=16 && tuoi <18) System.out.println("Ban "+ten+" ban gan truong thanh r do");
        else if (tuoi >=18 && tuoi <60)System.out.println("Ban "+ten+" da truong thanh r");
        else System.out.println("Ban"+ten+"tan huong tuoi gia di");
    }
}
