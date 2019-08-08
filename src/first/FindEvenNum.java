package first;

import java.util.Scanner;

public class FindEvenNum {
	
	public static void main(String[] arg) {
		int limit = 50;
		System.out.println("print the number between 1 and" + limit);
		
		for (int i=0; i<=limit; i++) 
		{
			if(i%2==0) 
			{
				System.out.print(i + " ");
			}
		}
	}
	


}
