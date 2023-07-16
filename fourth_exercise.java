package fourth_exercise;
import java.util.Scanner;

public class fourth_Exercise {
public static void main(String[] args) {
    Scanner user = new Scanner(System.in); 
    
    System.out.print("Enter a word: ");
    String word = user.nextLine();
    
    
    for(int i = 0;i < word.length();i+=2) {
    	for(int j = 0;j<(word.length());j++) {
    		if((i>=j)&&(j%2==0)){
    			System.out.print(" "+word.charAt(j));
    		}
    	}
    	
     	System.out.print('\n');
    }
    
    System.out.print('\n'+"Nice triangle!");
    user.close();
	}
}

