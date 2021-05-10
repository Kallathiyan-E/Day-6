package sixDay;
import java.util.ArrayList;
import java.util.Scanner;
public class TRAPSSEQUpdated {

	private static Scanner scan = new Scanner(System.in);
	
	private static int sumOfDigits(int num) {
		int sum=0;
		while(num!=0) {
			sum+=(num%10);
			num/=10;
		}
		return sum;
	}

	private static boolean isTrapped(int value1,int value2) {
		
		if(value1==value2)
			return true;
		if(value1%value2==0 || value2%value1==0) {
			return true;
		}
		int z=sumOfDigits(value1);
		while(z>0) {
			if(z==value2)
				return true;
			if(value2%z==0 || z%value2==0)
				return true;
			if(z>=10)
				z=sumOfDigits(z);
			else
				z=0;
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
			System.out.println("NONE");
		else
			System.out.print(gSequence);
	}

}
