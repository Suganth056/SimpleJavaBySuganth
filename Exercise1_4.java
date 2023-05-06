package sua;
import java.util.Scanner;
public class Exercise1_4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int r,n,i;
			System.out.println("Enter a number:");
			n=sc.nextInt();
			int sum=0;
			int key=n;
			for(i=0;i<3;i++) {
				r=n%10;
				n=n/10;
				sum+=r*r*r;
			}
			System.out.println("value="+sum);
			if(key==sum) {
				System.out.println("It is a ArmstrongNumber");
			}
			else {
				System.out.println("It is not a ArmstrongNumber");
			}
		}
}
