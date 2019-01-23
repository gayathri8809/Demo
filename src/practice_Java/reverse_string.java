package practice_Java;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class reverse_string extends array01 {
	
	public static void reverse() {
		String input="";
		String output="";
		int i;
		System.out.println("pls type a string:");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		int index=input.length();
		System.out.println(index);
		for(i=index-1;i>=0;i--) {
			output= output + input.charAt(i);
			
		}
		System.out.println(output);
		
		arrayReplace();
		arrayPrint();
		arrayCompare();
		
		
		
	}
	
	public void arrayTest() {
		System.out.println("pls type your Name:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("Welcome to Java programming " + input);
	}
	


}
