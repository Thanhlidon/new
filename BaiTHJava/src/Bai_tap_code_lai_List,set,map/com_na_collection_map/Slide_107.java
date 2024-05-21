package com_na_collection_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide_107 {
public static void main(String[] args) {
	TreeMap<Integer, Character> treeMap= new TreeMap<>();
	treeMap.put(6, 'A');
	treeMap.put(5, 'B');
	treeMap.put(1, 'C');
	treeMap.put(2, 'D');
	treeMap.put(8, 'E');
	Set<Map.Entry<Integer,Character>> setTreeMap= treeMap.entrySet();
	System.out.print("Cac entry trong setTreeMap: ");
	System.out.print(setTreeMap);
	
	
	
}
}
