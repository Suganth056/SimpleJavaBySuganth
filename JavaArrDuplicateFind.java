package sua;
import java.util.Scanner;
public class JavaArrDuplicateFind {
	public static void scan(int arr[],int n) {
		int count=0,i,j;
		
		System.out.println("Printing duplicates array");
		for(i=0;i<n;i++) {
			count=0;
			for(j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			 }
		     if(count==0) {
			   System.out.println(arr[i]);
		  }
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner g=new Scanner(System.in);
		System.out.println("Enter  n:");
		int n=g.nextInt();
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=g.nextInt();
		}
		JavaArrDuplicateFind a=new JavaArrDuplicateFind();
		a.scan(arr,n);
		
		
 }
}
	
