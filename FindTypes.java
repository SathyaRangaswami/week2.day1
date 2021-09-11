package week2.day1.assignment;

public class FindTypes {
	public static void main(String[] args) {
		
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

					int  letter = 0, space = 0, num = 0, specialChar = 0, 
							
					char[] ch=test.toCharArray();
					for (int i = 0; i < ch.length; i++) {
						if(Character.isDigit(ch[i]))
						{
							num=num+1;
						}
						
						else if(Character.isLetter(ch[i]))
						{
							letter=letter+1;
						}
						
						else if(Character.isSpaceChar(ch[i]))
						{
							
							space=space+1;
						}
						
						
						else 
						{
							specialChar=specialChar+1;
						}
						System.out.println("number: " + num);
						System.out.println("letter: " + letter);
						System.out.println("specialCharcter: " + specialChar);
						System.out.println("space: " + space);
						
					}
				/*// Build the logic to find the count of each
									a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				*/
					

				// Print the count here
				
				
				
				

				
	}

}
