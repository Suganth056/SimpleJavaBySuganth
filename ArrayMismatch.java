package sua;
import java.util.*;
public class ArrayMismatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] name=new int[length];
		int sum=0;
		
		try {
			for(int i=0;i<length;i++) {
				name[i]=sc.nextInt();
			}
			for(int i=0;i<length;i++) {
				sum+=name[i];
			}
			System.out.println(sum);

		}
		catch(InputMismatchException e) {
			System.out.println("You entered bad data");
		}
	}
}
