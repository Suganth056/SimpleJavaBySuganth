package sua;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		String s;
		Scanner get=new Scanner(System.in);
		System.out.println("Enter a sentence to find out a vowels in a sentence");
		s=get.nextLine();
		int count=0;
		int i;
		for(i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
				count=count+1;
			}
		}
		System.out.println("The total no.of vowels present in a sentence:"+count);
	}
}
