package dulieutaphop;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String>Ll=new LinkedList<>();
	Ll.add("Thang 1");
	Ll.add("Thang 2");
	Ll.add("Thang 3");
	Ll.add("Thang 4");
	Ll.add("Thang 5");
	Ll.add("Thang 6");
	Ll.add("Thang 7");
	Ll.add("Thang 8");
	Ll.add("Thang 9");
	Ll.add("Thang 10");
	Ll.add("Thang 11");
	Ll.add("Thang 12");
	System.out.print("Nhap vao chi so phan tu can lay: ");
	int index= sc.nextInt();
	if(index<0||index>(Ll.size()-1)) {
		System.out.print("Chi so k hop le! ");
	}else {
		String node=Ll.get(index);
		System.out.print("Phan tu co chi so= "+index+"Trong LinkedList la: "+node);
		String firstNode =Ll.getFirst();
		String lastNode=Ll.getLast();
		System.out.print("Phan tu dau tien: "+firstNode+" Phan tu cuoi cung: "+lastNode);
		
	}
	
}
}
