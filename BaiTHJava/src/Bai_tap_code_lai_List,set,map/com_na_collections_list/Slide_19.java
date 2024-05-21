package com_na_collections_list;

import java.util.ArrayList;
import java.util.Iterator;
public class Slide_19 {
public static void main(String[] args) {
	ArrayList<Float> arrListFloat = new ArrayList();
	arrListFloat.add(0.7f);
	arrListFloat.add(7.26f);
	arrListFloat.add(1.02f);
	arrListFloat.add(9.3f);
	Iterator<Float> iterator = arrListFloat.iterator();
	System.out.print("Cac phan tu co trong Arrlist: ");
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+"\t");
	}
}
}
