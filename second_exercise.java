package second_exercise;
import java.util.Scanner;

public class second_Exercise {

	public static void main(String[] args) {
     
	Scanner ans = new Scanner(System.in);
	double income;
	double tax = 0;
	
	System.out.println("Input your income: ");
	income = ans.nextDouble();
	
	
	if(income <= 48000) {
		tax = income*(0.15);
		
	}
	else if((income > 48000)&&(income < 97000)) {
		tax = income*(0.205);
		
	}
	else if((income > 97000)&&(income < 150000)) {
		tax = income*(0.26);
			
	}
	else if((income > 150000)&&(income < 214000)) {
		tax = income*(0.29);
			
	}
	else if (income > 214000) {
		tax = income*(0.33);
	}
	
	ans.close();
	System.out.println("Tax amount is: " +tax);

    

	}
}
