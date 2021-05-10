package sixDay;

import java.util.Scanner;

public class ReverseString {
	
	public static int length(String query) {
		int lengthOfString = 0;
		try{
			for(int i=0;;i++) {
				query.charAt(i);
				lengthOfString++;
			}
			
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
		return lengthOfString;
	}

	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("\t\tReversing Text");
		System.out.print("Enter Text =");
		String input = scan.next();
		int size =length(input);
		System.out.print("Reversed Text :");
		for(int i=size-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
		scan.close();
	}
	
}
