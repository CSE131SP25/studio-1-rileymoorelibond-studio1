package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean result1 = (x>y && y>z);
		boolean result2 = (x<y && y<z);
		System.out.print(result1 && result2);
		System.out.println();
		System.out.print(result1 || result2);

	}

}
