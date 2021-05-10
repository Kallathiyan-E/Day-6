package sixDay;
import java.util.ArrayList;
import java.util.Scanner;
public class TRAPSSEQ {

	private static Scanner scan = new Scanner(System.in);
	
	private static int sumOfDigits(int num,int value) {
		int greater =(int)Math.pow(10,noOfDigits(value));
		int sum=0;
		while(num!=0 && num>greater) {
			sum+=(num%10);
			num/=10;
		}
		return sum;
	}
	
	private static int noOfDigits(int value) {
		int numberOfDigits=0;
		while(value!=0) {
			numberOfDigits++;
			value/=10;
		}
		return numberOfDigits-1;
	}

	private static boolean isTrapped(int value1,int value2) {
		int z = sumOfDigits(value1,value2);
		if(value1==value2)
			return true;
		if(value1%value2==0 || value2%value1==0) {
			return true;
		}
		if(z==value2) {
			return true;
		}	
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> gSequence = new ArrayList<>();
		System.out.println("Inputs");
		System.out.print("N1 :");
		int n1 = scan.nextInt();
		System.out.print("N2 :");
		int n2 = scan.nextInt();
		System.out.print("y :");
		int y =scan.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(y<3) {
				y=3;
			}
			
			if(isTrapped(i,y)) {
				gSequence.add(i);
				y+=2;
			}
			else {
				y-=1;
			}
		}
		if(gSequence.isEmpty())
			System.out.println("None");
		else
			System.out.print(gSequence);
	}

}
