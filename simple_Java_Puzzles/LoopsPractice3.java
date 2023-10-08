package simple_Java_Puzzles;

public class LoopsPractice3 {
 public static void main(String[] args) {
	 
	int[] array = {3,5,8,9,7};
	
	System.out.println(search(array,8));
	
	System.out.print(search(array,10));
	 
 }
 /*
  * create a method that can search for a particular number in a given array
  * if the target number is found in the array the program will print its index
  * if the target number is not found the program will return -1
  **/
 
 public static int search(int[] nums, int target) {
	 int  ret = -1;
	 for(int i =0;i<= nums.length-1;i++) {
		 if(nums[i]== target) {
			 ret = i;
			 break;
			 }
		
	 }
	  
		 return ret;	 
 }
}
