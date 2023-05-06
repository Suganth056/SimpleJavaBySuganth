package sua;
import java.util.Scanner;
public class Exercise1_5 {
	public static void main(String[] args) {
		double mark_avg;
		int result,i,s;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number;");
		s=input.nextInt();
		int arr[]=new int[s];
		for(i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("To find highest mark");
		int max=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Highest mark="+max);
		System.out.println("average=");
		double total=0;
		for(i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		mark_avg=(total/arr.length);
		System.out.print(mark_avg);
	}

}
