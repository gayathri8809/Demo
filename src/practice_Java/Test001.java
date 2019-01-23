package practice_Java;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array01 = {};
int i,j;
Scanner scan = new Scanner(System.in);
for(i=0;i<3;i++) {
	for(j=0;j<3;j++) {
		System.out.println("Enter the array element");
		array01[i][j]= scan.nextInt();
	}
}
scan.close();
System.out.println(array01[][].class);

	}

}
