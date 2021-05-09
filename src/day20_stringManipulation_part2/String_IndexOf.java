package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
        System.out.println(word1.indexOf("th"));
        System.out.println(word1.indexOf("hub"));
        
        System.out.println(word1.indexOf("java"));
        
        String url= "www.octa.com";
        int i =url.indexOf(".");
        System.out.println("pos of . " + i);
        System.out.println(url.charAt(i+1));
        
        //find position of '-' and check if space is on right and left side.
        String title = "Java - Google Search";
        System.out.println(title);
        int dash=title.indexOf('-');
        System.out.println(dash);
        System.out.println(title.charAt(dash-1));
        System.out.println(title.charAt(dash+1));
        System.out.println("Apple");
        
        String country = "United States of America";
        int states = country.indexOf("States");
        System.out.println("Position of states: " + states);
        
        
        String word2 = "Java, c++, pyton, tomcat, eclipse";
        //check if c++ is in the word2
        
        //1.contains()
      if (word2.contains("c++")) {
    	  System.out.println("c++ is there");
      }else {
    	  System.out.println("c++ is not there");
      }
     
       //2.indexOf()
      if(word2.indexOf("c++")> -1) { //if it is greater mines one there it is.
    	  System.out.println("c++ is there");
    	  
      }else {
    	  System.out.println("c++ is not there");
      }
       
      
        
        
        
	}

}
