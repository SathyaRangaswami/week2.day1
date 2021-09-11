package week2.day1.assignment;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="stops";
	String str2="posts";
/*	* a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value*/
	int length1 = str1.length();
	int length2 = str2.length();
	if(length1==length2)
	{
		System.out.println("Strings are equal");
	}
	else {
		System.out.println("Strings are not equal");
	}
	char[] charArray1 = str1.toCharArray();
	char[] charArray2 = str2.toCharArray();	
	Arrays.sort(charArray2);
	Arrays.sort(charArray1);
   
	for (int i = 0; i < charArray1.length; i++) 
	{	
	if(charArray1[i]==charArray2[i])
	{
		System.out.println("sorted array   : "+charArray1[i]);
	}
	
	else
	{
		System.out.println("sorted arrays are not equal");
	}
	}
}
	
}
