package sixDay;
//This is an example of text justification.
import java.util.Scanner;
public class LineJustifcation {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the number of Words :");
		int size = scan.nextInt();
		String[] word = new String[size];
		System.out.print("Enter the words:");
		for(int i=0;i<size;i++) {
			word[i] = scan.next();
		}
		System.out.println("Enter the Number of character need to be in line:");
		int letters = scan.nextInt();
		int i;
		for(i=0;i<size;i++) {
			String line ="";
			int loopBreaker=letters;
			//int spaceCounter=0;
			while(line.length()!=letters && i<size) {
				if(word[i].length()>loopBreaker) {
					//spaceCounter = word[i].length()-loopBreaker;
					i--;
					break;
				}
				else {
					loopBreaker-=(word[i].length()+1);
					line=line+word[i]+" ";
					word[i++]=" ";
				}
				
			}
			
			System.out.println(line);
		}
		for(int j=0;j<size;j++) {
			if(word[j]!=" ") {
				System.out.println(word[j]);
			}
		}
		
	}

}
