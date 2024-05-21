package com_na_collections_list;

import java.util.ArrayList;

public class Arrlist {
public static void main(String[] args) {
	ArrayList<String> colors = new ArrayList<>();
	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Orange");
	colors.add("Green");
	colors.add("Pink");
	colors.add("Yellow");
	System.out.print(colors.get(1));
	System.out.print(colors.contains("Orange"));
	System.out.print(colors.size());
	System.out.print(colors);
	
}
}