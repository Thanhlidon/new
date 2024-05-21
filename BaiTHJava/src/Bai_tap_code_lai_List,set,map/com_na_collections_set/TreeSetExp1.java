package com_na_collections_set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExp1 {
public static void main(String[] args) {
	int n;
	TreeSet<Integer> treeSetInteger= new TreeSet<>();
	Scanner sc= new Scanner(System.in);
	treeSetInteger.add(0);
	treeSetInteger.add(3);
	treeSetInteger.add(1);
	treeSetInteger.add(4);
	treeSetInteger.add(2);
	treeSetInteger.add(8);
	System.out.print("Cac phan tu trong TreeSet: ");
	System.out.print(treeSetInteger);
	System.out.print("Nhap phan tu can them: ");
	n=sc.nextInt();
	if (!treeSetInteger.contains(n)) {
		treeSetInteger.add(n);
		System.out.print("Them phan tu thanh cong!");
		System.out.print("TreeSet moi la: ");
		System.out.print(treeSetInteger);
	} else 
	{
		System.out.print("Phan tu "+n+"da ton tai!");
	}
}
}
