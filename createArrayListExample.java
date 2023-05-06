package sua;
import java.util.*;

public class createArrayListExample {
	public static void main(String[] args) { 
		
        // Creating an ArrayList of String 
        List<String> animals = new ArrayList<>();         // Adding new elements to the ArrayList         
        animals.add("Lion");         animals.add("Tiger");         animals.add("Cat");         animals.add("Dog"); 
 
        System.out.println(animals); 
 
        // Adding an element at a particular index in an ArrayList         
        animals.add(2, "Elephant"); 
 
        System.out.println(animals); 
          	 
        	ArrayList<Integer> myList = new ArrayList<>(3); 
        	 
        	myList.add(3); myList.add(2); myList.add(1); 
        	 
        	System.out.println("The elements of list are: " + myList); 
        	}  

 
    }


