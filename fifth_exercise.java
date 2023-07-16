package fifth_exercise;
import java.util.Scanner;

public class fifth_Exercise {

	public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.print("Enter array size (minimum size 5 and an odd number)?: ");
	int size = user.nextInt();
	
	
	System.out.print("Starting integer value: ");
	int num = user.nextInt();
	
	int array[] = new int[size];
	
	array[size-1]= num;
	
	for(int i = array.length-2;i>=0;i--) {
		int k=0;
		for(int j = 0;j==0;j++) {
			k=num+=3;
		}
		array[i]=k;
		
	}
	    System.out.print('\n');
	    System.out.print("Original array: "+'\n');
	    
	    for(int x: array) {
		System.out.print(" " + x);
		}
	    
	    System.out.println('\n');
	     System.out.print("Array after rotation: "+'\n');
	     for(int y=0;y<array.length-1;y++) {
	    	 int l=0;
	   
	    	 if((y%2)==0) {
	    	 l=array[y];
	    	 array[y]=array[y+2];
	    	 array[y+2]=l;
	    	 }
	     }
	    	 for(int rot: array) {
	    			System.out.print(" " + rot);
	    			}
	     
	     
	     
	user.close();

	}
}
