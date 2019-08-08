package first;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] arg) {
		int num = 0;
		System.out.println("Enter an Integer Numeber:");
		Scanner Scn = new Scanner(System.in);
		
		num = Scn.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Entered numeber is even");
		}
		else
		{
			System.out.println("Entered nember is odd");
		}
				
	}
}
