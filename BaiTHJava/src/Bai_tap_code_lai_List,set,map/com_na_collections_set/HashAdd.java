package com_na_collections_set;

import java.util.HashSet;
import java.util.Scanner;

public class HashAdd {
public static void main(String[] args) {
	int number;
	HashSet<Integer>hashSetInteger= new HashSet<>();
	hashSetInteger.add(0);
	hashSetInteger.add(3);
	hashSetInteger.add(1);
	hashSetInteger.add(4);
	hashSetInteger.add(2);
	hashSetInteger.add(9);
	hashSetInteger.add(8);
	System.out.print("Cac phan tu trong hashSet: ");
	System.out.print(hashSetInteger);
    System.out.print("Nhap phan tu can them: ");
    Scanner sc=new Scanner(System.in);
    number =sc.nextInt();
    if (!hashSetInteger.contains(number)) {
    	hashSetInteger.add(number);
    	System.out.print("Them thanh cong!");
    	System.out.print("HashSet moi la: ");
    	System.out.print(hashSetInteger);
    
    } else {
    	System.out.print("Phan tu da ton tai!");
    }
    
}
}
