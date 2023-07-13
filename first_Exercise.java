package first_Exercise;
import java.util.Scanner;

public class first_Exercise {

	public static void main(String[] args) {
	 
	int numLocal , numInternational;
	double percentLocal, percentInternational, Total;
	 
		    Scanner sc = new Scanner(System.in);
	      System.out.println("How many local students");
	      numLocal = sc.nextInt();
	      System.out.println("How many internationals students");
	      numInternational = sc.nextInt();
	      
	      Total = numLocal + numInternational;
	      percentLocal = numLocal/(Total*100);
	      percentInternational = numInternational/(Total*100);
	      
	      System.out.print("Total number of students is " + Total + " of which " + percentLocal+"% are local and "+percentInternational+"% are international" );
	      sc.close();
	      
	}

}
