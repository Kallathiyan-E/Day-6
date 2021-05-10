package sixDay;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//However Everyday is a Day.
public class RepeatingSubstring {
	static int MAX_CHAR = 26;
	
	public static String subString(String text,int start,int end) {
		StringBuilder string = new StringBuilder("");
		for(int i=start;i<end;i++) {
			string.append(text.charAt(i));
		}
		return string.toString();
	}
	
	public static int minimum(int value1,int value2) {
		return value1>value2?value1:value2;
	}

	public static String isStringRepeated(String textOne,String textTwo) {
		int length = minimum(textOne.length(),textTwo.length());
		for(int i=0;i<length;i++) {
			if(textOne.charAt(i)!=textTwo.charAt(i))
				return subString(textOne,0,i);
		}
		return subString(textOne,0,length);
	}
	
    public static boolean isRepeated(String text1, String text2)
    {
        boolean alphabet[]=new boolean[MAX_CHAR];
        for (int i = 0; i < text1.length(); i++)
            alphabet[text1.charAt(i) - 'a'] = true;
        for (int i = 0; i < text2.length(); i++)
            if (alphabet[text2.charAt(i) - 'a'])
            return true;
         
        return false;    
    }
	
	public static void printResult(String[] array) {
		System.out.print("Output:");
		if(array[0]==null)
			System.out.println("none");
		else if(array[1]==null) {
			System.out.println("Only one element present");
			System.out.println(array[0]);
		}
		else {
			System.out.print(array[0]+",");
			System.out.print(array[1]);
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tRepeated Substring of String\nEnter String :");
		String input = scan.readLine().toLowerCase();
		int n=input.length();
		String nonRepeatedArray[] = new String[n];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				String x = isStringRepeated(subString(input,i,n),subString(input,j,n)); 
				if(x.length()>1) {
					nonRepeatedArray[k++] = x;
				}
			}
		}

		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				if(isRepeated(nonRepeatedArray[i],nonRepeatedArray[j])) {
					if(nonRepeatedArray[i].length()>nonRepeatedArray[j].length()) {
						nonRepeatedArray[j]="";
					}
					else
						nonRepeatedArray[i]="";
				}
			}
		}
		for(int i=0;i<k&&nonRepeatedArray[i]!=null;i++) {
			for(int j=i+1;j<k&&nonRepeatedArray[i]!=null;j++) {
				if(nonRepeatedArray[i].length()<nonRepeatedArray[j].length()) {
					String temp = nonRepeatedArray[i];
					nonRepeatedArray[i] = nonRepeatedArray[j];
					nonRepeatedArray[j] = temp;
				}
			}
		}
		printResult(nonRepeatedArray);
	}
}
