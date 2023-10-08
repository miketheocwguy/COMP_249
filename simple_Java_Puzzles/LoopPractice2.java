package simple_Java_Puzzles;

public class LoopPractice2 {
 public static void main(String[] args) {
	 
	 String name = "Jonny";
	 
	 reverseName(name);
 }
 /*
  * reverse the string of name 
  * 
  */
 public static void reverseName(String string) {
	 for(int i = string.length()-1; i >= 0 ;i--) {
		 System.out.print(string.charAt(i));
	 }
 }
}
