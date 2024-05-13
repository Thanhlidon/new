package dulieutaphop;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
public static void main(String[] args) {
	ArrayList<Integer> arrList = new ArrayList<>();
	int n,number;
	System.out.print("Nhap phan tu cua ArrayList: ");
	Scanner sc=new Scanner(System.in);
	n= sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println(" Nhap phan tu thu:"+i);
		number =sc.nextInt();
		arrList.add(number);
	}
	int max = arrList.get(0);
	for (int i=1;i<arrList.size();i++) {
		if(arrList.get(i).compareTo(max)>0) {
			max =arrList.get(i);
		}
	}
	System.out.print("Phan tu lon nhat cua Arrlist: "+max);
}
}
