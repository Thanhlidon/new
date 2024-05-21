package com_na_collection_map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Slide_89 {
public static void main(String[] args) {
	HashMap<String,String>hashMapCity=new HashMap<>();
	hashMapCity.put("QNg","Quang Ngai");
	hashMapCity.put("QN","Quang Nam");	
	hashMapCity.put("QN","Quang Ninh");
	hashMapCity.put("HCM","Ho Chi Minh");
	System.out.print("Danh sach cac thanh pho: ");
	Set<Map.Entry<String,String>>setCity= hashMapCity.entrySet();
	System.out.print(setCity);
	System.out.print("QNg"+hashMapCity.get("QNg"));
	System.out.print("NT"+hashMapCity.get("NT"));
	if(hashMapCity.containsValue("Thanh Pho Ho Chi Minh")) {
		System.out.print("Co thanh pho Ho Chi Minh trong hashMapCity");
	}
}
}
