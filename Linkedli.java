package sua;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		String courseName=scanner.nextLine();
		System.out.println("course:"+courseName);
		LinkedList<String> s=new LinkedList<String>();
		s.add("Volvo");
		s.add("BMW");
		s.add("Ford");
		s.add("Mazda");
		System.out.println(s);
	}
}
