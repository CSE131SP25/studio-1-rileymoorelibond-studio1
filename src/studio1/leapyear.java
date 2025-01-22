package studio1;
import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Year: ");
		int a = in.nextInt();
		
		int x=a%4;
		int y=a%100;
		int z=a%400;
		boolean result1= x==0;
		boolean result2= y>0;
		boolean result3= z==0;
		
		boolean last1=(result1 && result2 || result3);
		System.out.println(last1);
	}

}
