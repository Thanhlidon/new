package dulieutaphop;

import java.util.ArrayList;

public class Arrlist {
public static void main(String[] args) {
	ArrayList<String> colors =new ArrayList<>();
	colors.add("Red");
	colors.add("Orange");
	colors.add("Yellow");
	colors.add("Green");
	colors.remove("Green");
	colors.add("Blue");
	colors.add("Purple");
	System.out.print(colors.get(1));
	System.out.print(colors.contains("Orange"));
	System.out.print(colors.size());
	System.out.print(colors);
	
}
}
