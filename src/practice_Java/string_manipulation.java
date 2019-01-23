package practice_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class string_manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome:to:java:programming:everybody";
/*//System.out.println(str.concat(". I am excited"));

System.out.println(str+". I am excited");
System.out.println(str.charAt(6));
//System.out.println(str.hashCode());
System.out.println(str.isEmpty());
System.out.println(str.indexOf("hello", 0));
System.out.println(str.indexOf("j"));
//System.out.println(str.repeat(5));
System.out.println(str.strip());
String res[]= str.split(":");
//System.out.println(res[0]+res[1]+res[2]+res[3]);
for (String temp: res){
    System.out.println(temp);
}*/


//Using split and trim in strings
/*String s = " ,ab;g h ,bc ;pq# kk$ bb ";
String[] a = s.split("[,;#$]");
System.out.println("string length is : "+ s.length());
System.out.println(s.trim());
//Total how many substrings? The array length
System.out.println("Number of substrings: "+a.length+ "\n" );
	
for (int i=0; i < a.length; i++) {
	System.out.print(a[i]);
}*/


//Finding Duplicates in an array
/*int i,j;
String result[];
String str1[]= {"java","c#","c++",".net","php","python","c++","java"};
for(i=0;i<str1.length;i++) {
	String test=str1[i];
	for(j=0;j<str1.length;j++) {
		if(str1[j].equalsIgnoreCase(test) && i!=j) 
			System.out.println("the duplicate value is "+ test);
		}
	}*/



/*//	Finding the missing no in a sequence
int i,j,sum=0,realSum=0,missingNo=0 ;
int arr1[]= {21,22,23,24,25,26,27,28,30};
int start=arr1[0];
int end=arr1[arr1.length-1];
for(i=0;i<arr1.length;i++) {
	 sum = sum + arr1[i];
}
for(j=start;j<=end;j++) {
	realSum = realSum+j;
}

missingNo=realSum-sum;
System.out.print(missingNo);*/


	int[] array = {1,1,2,3,4,5,6,7,8,8,1,-9,-3,-8,34,0,98,-101};
    char[] sortme= {'b','f','g','a','d','c','h'};
    Set<Integer> set = new HashSet<Integer>();
    Set<Integer> result = new HashSet<Integer>();
    Set<char[]> set1= new HashSet<char[]>();
     
    for(int i = 0; i < array.length ; i++)
    {
        //If same integer is already present then add method will return FALSE
        if(set.add(array[i]) == false)
        {
        	result.add(array[i]);
        }
    }
    System.out.println("Duplicate elements are : " + result);
    Arrays.sort(array);
    Arrays.sort(sortme);
    System.out.println(Arrays.toString (array));
    System.out.println(Arrays.toString (sortme));



}
}
	
	
	

