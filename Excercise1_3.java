package sua;
import java.util.Scanner;
public class Excercise1_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input:n=");
		int n=sc.nextInt();
		System.out.println("--------");
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter "+n+" even number");
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(i=0;i<n;i++) {
			if(arr[i]%3==0) {
				sum+=arr[i];
			}
		}
		System.out.println("Even number divisible by 3:0"+sum);
		System.out.println("sum:"+sum);
	}

}
