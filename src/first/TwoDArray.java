package first;

public class TwoDArray {

	public static void main(String[] args) {
		
		int school[][] = new int[3][2];
		
		school[0][0]=12;
		school[0][1]=13;
	
		school[1][0]=22;
		school[1][1]=23;
		
		school[2][0]=22;
		school[2][1]=23;
	
	
		
		System.out.println(school[0][1]);
		
		System.out.println(school.length);
		
		for (int i=0; i<school.length; ++i)
		{
			for (int j=0; j<school[i].length; ++j)
			{
			System.out.println(school[i][j] + "");	
			}
			System.out.println();
		}
		
//		for(int i= 0; i<school.length; i++) {
//			System.out.println(school);
//			System.out.println(school[0]);
//			System.out.println(school.length);
//			System.out.println(school[0][2]);
//		
//				
//			
//		}
				

	}

}
