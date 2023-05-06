package sua;
import java.util.*;
public class SmallestArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int arr[]=new int[10];
		System.out.println("Enter array Eleement:");
		for(i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(i=0;i<10;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The smallest element is-"+min);
		
	}

}
