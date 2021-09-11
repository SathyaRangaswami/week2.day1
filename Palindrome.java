package week2.day1.assignment;

public class Palindrome {
	public static void main(String[] args) {
		String str="MAdam";
		String str1="";
		int length = str.length();
		
		for (int i = length-1; i >=0; i--) 
		{
			
				str1=str1+str.charAt(i);
			
		}
		if(str.equals(str1) || str.equalsIgnoreCase(str1))
				{
			System.out.println(str+" string is a palindrome");
				}
		else
		{
			System.out.println(str+"String is not a  palindrome");
		}
	}


}
