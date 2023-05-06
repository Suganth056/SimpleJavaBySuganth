package sua;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    System.out.print("Enter a number:");
		int a=obj.nextInt();
		System.out.println("Enter n:");
		int n=obj.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(a+"*"+(i)+"="+(a*i));
			i++;
		}
			
		
	}

}
