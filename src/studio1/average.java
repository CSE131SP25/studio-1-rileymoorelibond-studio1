package studio1;
import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for a?");
		double a = in.nextInt();
		System.out.println("Value for b?");
		double b = in.nextInt();
		
		double c;
		
		c= (a+b)/2 ;
		
		System.out.println("Average Value is "+c);
	}

}
