package simple_Java_Puzzles;

public class RecursionPrac {
	public static void main(String[] args) {
		
		System.out.print(allDollars("seven"));
		
	}
	
	/*
	 * Create a recursive function such that when given a string
	 *  returns the string with a "$" symbol between each letter
	 *  ex) zebra --> z$e$b$r$a  */
	
	public static String allDollars(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		else
			return str.charAt(0)+ "$" +allDollars(str.substring(1));
		

		
	}	
}
