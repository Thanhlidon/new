package Lap2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Bai_10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot chuoi: ");
		String kytu = sc.nextLine();
		Pattern p = Pattern.compile(kytu); 
        System.out.println("Nhap chuoi: ");
		String chuoi = sc.nextLine();  
        if(chuoi.length() < 80)
        {
		Matcher m = p.matcher(chuoi); 
        int dem = 0;
        while (m.find()) {
            dem = dem + 1;
        }
        System.out.println("So lan xuat hien "+ kytu + " la " + dem);
        }
        else
            System.out.println("Hay nhap chuoi ngan hon!");
	} 
}
