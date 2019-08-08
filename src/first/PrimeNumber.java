package first;

public class PrimeNumber {
	
	public static void main(String[] arg) {
		int flag = 0;
		int limit = 100;
		//int m = limit/2;
				
		for(int i=2; i<=limit; i++) {
			
	
			
			for (int j =2; j<=i/2; j++) {
				
				if(i%j==0)
				{
					System.out.println("Not a prime number" + i);
					flag = 1;
					break;
				}
			}
				if (flag == 0)
				{
					System.out.println("A prime number" + i);
					
				}
			
			
		}
		
	}

}
