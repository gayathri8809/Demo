package practice_Java;

abstract class array01 {
	
	static int A[][]= {{23,37,99},{40,69,75},{52,88,10}};
	static int i;
	static int j;
	static int min=A[0][0];
	static int max=A[0][0];
	static int size=A.length;
//adding a comment
	public static void arrayReplace() {
	String A="Hello",B="",C="";
	// String B="";
	B = A.replace("H","F");
	System.out.println(A);
	System.out.println(B);

	}
	public static void arrayCompare() {
		
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++){
				if(min>A[i][j])
					min=A[i][j];
				if(max<A[i][j])
					max=A[i][j];
			}
		}
		System.out.println("The least value in the matrix is " +min);
		System.out.println("The biggest value in the matrix is " +max);
	}
		
	public static void arrayPrint() {
			
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++){
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}
	}
	
	public abstract void arrayTest();

}
