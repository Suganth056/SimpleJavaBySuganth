package sua;
public class StringReverse {
	public static void main(String[] args) {
	    String string = "dream big";
	    String reverseStr="";
	    for(int i=string.length()-1;i>=0;i--) {
	    	reverseStr=reverseStr + string.charAt(i);
	    	
	    }
	    System.out.println("Original STring:"+string);
	    System.out.println("Reverse of String:"+reverseStr);
	}
	

}
