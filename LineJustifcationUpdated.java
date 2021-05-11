package sixDay;
import java.util.ArrayList;
//This is an example of text justification.
import java.util.Scanner;
public class LineJustifcationUpdated {

	private static Scanner scan = new Scanner(System.in);
	
	public static void spaceJustify(ArrayList<String> space,int l) {
		int noOfCharacters=0;
		int requiredSpace=0;
		String startSpace;
		String endSpace;
		boolean flag;
		String lastLine = space.get(space.size()-1);
		for(String line:space) {
			noOfCharacters=line.length();
			startSpace=endSpace="";
			if(noOfCharacters<l) {
				requiredSpace=l-noOfCharacters;
				flag=true;
				if(lastLine.equals(line)) {
					while(requiredSpace-->0) {
						startSpace+=" ";
					}
					line=startSpace+line;
					System.out.println(line);
					continue;
				}
				while(requiredSpace-->0) {
					if(flag) {
						startSpace=startSpace+" ";
						flag=!flag;
					}
					else {
						endSpace=endSpace+" ";
						flag=!flag;
					}
				}
			}
			line=startSpace+line+endSpace;
			System.out.println(line);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<>();
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
					word[i++]="";
				}
				
			}
			
			result.add(line);
		}
		for(int j=0;j<size;j++) {
			if(word[j]!="") {
				result.add(word[j]);
			}
		}
		spaceJustify(result,letters);
		
	}

}
