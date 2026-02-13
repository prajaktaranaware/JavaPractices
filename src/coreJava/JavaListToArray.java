package coreJava;
import java.util.ArrayList;

public class JavaListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList languages= new ArrayList <>();
    languages.add("de");
    languages.add("en_US");
    languages.add("fr");
    languages.add("en");
    System.out.println("ArrayList is "+ languages);
    
    //create new array of string type
    
    String[] arr= new String[languages.size()];
    languages.toArray(arr);
    System.out.println("this is array");
    for (String item:arr) {
    	System.out.println(item +",");
    
    }
    		
	}

}
