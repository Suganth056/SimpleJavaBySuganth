package sua;
import java.util.*;
import java.util.ArrayList;
public class ArrayListExample {
		public static void main(String[] args) {
			System.out.println("Let's Workout with List");
			System.out.println("1)ArrayList");
			ArrayList<String> arrList=new ArrayList<String>();
			arrList.add("Name");
			arrList.add("RollNo");
			arrList.add("Class");
			arrList.add("Dept");
			arrList.add("Year");
			arrList.add("Batch");
			arrList.add("Total Marks SCored in12th");
			arrList.remove(2);
			System.out.println(arrList);
			System.out.println(arrList.isEmpty());
			
		}
}
