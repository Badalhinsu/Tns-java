package Average;
import java.util.Scanner;

public class Avg_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int maths = sc.nextInt();
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int english = sc.nextInt();
		
	    double avg = (maths + phy + chem + english)/4;
	    
	    System.out.println(avg);
	    
	    if (avg>=90) System.out.print("Grade : A");
	    else if(avg>=80 && avg<90)System.out.println("Grade : B");
	    else if(avg>=70 && avg<80) System.out.println("Grade : c");
	    else System.out.println("Fail");

	}

}
