package thrid_exercise;
import java.util.Scanner;

public class third_exercise {

	public static void main(String[] args) {
    
   
	Scanner user = new Scanner(System.in);
	System.out.print("Enter an int: ");
	int x = 0;

	
	do {
	int userint = user.nextInt();	
	if((userint < 546)||(userint > 1000)||((userint%3) == 0)) {
	System.out.print("Invalid int, try again: ");
	}
	else {
		 System.out.print('\n');
		 System.out.println("Ouput: ");
         for(int i = 0; i < 5;i++) {
		 System.out.println(userint);
		 userint -= 111;
	 }
		x++;
	}
	}while(x==0);
	 
	 
	user.close();
    

	}
}
