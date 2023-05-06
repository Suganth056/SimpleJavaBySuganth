package sua;
import java.util.ArrayList;
import java.util.*;
public class ArrayF {
	public static boolean isOdd(ArrayList<Integer> arr) {
		for(int i:arr) {
			if(i%2==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(3);
		arr.add(45);
		arr.add(55);
		arr.add(4);
		
		boolean c=isOdd(arr);
		System.out.println(c);
	}
    
	
}
