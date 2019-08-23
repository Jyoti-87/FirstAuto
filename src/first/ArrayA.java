package first;

public class ArrayA {
	
	public static void main(String[] args) {
		
// instantiation
		int[] a = new int[5];
		
//		Initialization	of array.	
		a[0]=10;
		a[1] =20;
		
		for(int aa: a) {
			System.out.println(aa);
		}
		
		boolean[] b = new boolean[3];
		for (boolean bb: b) {
			System.out.println(bb);
		}
		
		
		A[] A1 = new A[3];
		 for (A AA: A1) {
			 System.out.println(AA);
		 }
	}

}
