package first;

public class JaggedArray {
	
	public static void main(String[] args) {
		int[][] a = new int[4][];
		a[0]= new int[3];
		a[1]= new int[4];
		a[2]= new int[5];
		a[3]= new int[1];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;

//		Declare,creation & initialization in one line
		
		int[][] b= {{10,20,30},{50,60,70,80},{90,100}};
		
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		System.out.println(a[0][2]);
		System.out.println(b[2][1]);
		
		System.out.println(a[1].length);
		System.out.println(b[2].length);
		
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
			System.out.println(a[i][j] + "");	
			}
			System.out.println();
		}
			
	}

}
