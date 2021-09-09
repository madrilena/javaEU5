package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		//Languages
		//Print size arrayList
		//read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Spanish");
		languages.add("Turkish");
		languages.add("English");
		languages.add("French");
		languages.add("German");
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(2));
        System.out.println(languages.get(4));
        
        System.out.println(languages.toString());
        
        System.out.println("Number of values: " + languages.size());
        
        languages.add("Russian");
        System.out.println(languages.toString());
        
        languages.remove(0);
        System.out.println(languages.toString());
        
        System.out.println("Number of values: " + languages.size());
        
        
        
	}

}
