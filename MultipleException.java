package sua;
import java.util.*;
public class MultipleException {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j;
		try {
			switch(i) {
			case 0:
				int zero=0;
				j=92/zero;
			    break;
			case 1:
				int b[]=null;
				j=b[0];
				break;
			default:
				System.out.println("No exception");
			}
		
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
