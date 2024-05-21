package com_na_collections_set;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
public static void main(String[] args) {
	String name;
	HashSet<String> hashSetString= new HashSet<>();
	Scanner sc =new Scanner(System.in);
	hashSetString.add("Wilson"); 
	hashSetString.add("Nike"); 
	hashSetString.add("Volvo"); 
	hashSetString.add("Lenovo"); 
	hashSetString.add("Kia"); 
	hashSetString.add("Lenovo"); 
	System.out.print("Cac phan tu trong HashSet: ");
	System.out.print(hashSetString);
	System.out.print("Nhap phan tu can xoa: ");
	name=sc.nextLine();
	if(hashSetString.contains(name)) {
		hashSetString.remove(name);
		System.out.print("Xoa thanh cong!");
		System.out.print("HashSet moi la: ");
		System.out.print(hashSetString);
	}else {
		System.out.print("Xoa khong thanh cong!");
	}
}
}
