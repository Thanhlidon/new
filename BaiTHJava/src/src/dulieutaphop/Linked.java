package dulieutaphop;

import java.util.LinkedList;

public class Linked {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<>();
	list.add("Java");
	list.add("C++");
	list.add("PHP");
	list.add("Java");
	LinkedList<String> listA= new LinkedList<>();
	listA.addAll(list);
	System.out.print(listA);
	
	
}
}
