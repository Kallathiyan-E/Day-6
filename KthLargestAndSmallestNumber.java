package sixDay;

import java.util.InputMismatchException;
import java.util.Scanner;
public class KthLargestAndSmallestNumber {

	public static void kthSmallestElement(int[] tempArray,int size,int k) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(tempArray[i]>tempArray[j]) {
				tempArray[i] +=tempArray[j];
				tempArray[j] = tempArray[i]-tempArray[j];
				tempArray[i] = tempArray[i]-tempArray[j];
				}
			}
		}
		System.out.println("Kth Largest number: "+tempArray[k-1]);
	}

	public static void kthLargestElement(int[] temparray,int size,int k) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(temparray[i]<temparray[j])
				temparray[i] = temparray[i]+temparray[j];
				temparray[j] = temparray[i]-temparray[j];
				temparray[i] = temparray[i]-temparray[j];
			}
		}
		System.out.println("Kth Smallest number: "+temparray[k-1]);
	}
	
	public static void main(String[] args) {
		try {
		System.out.print("Enter the Size of Array :");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		System.out.print("Enter Array Elements :");
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Enter K between 1 to "+size+" :");
		int k = scan.nextInt();
		kthSmallestElement(array,size,k);
		kthLargestElement(array,size,k);
		scan.close();
		}
		catch(InputMismatchException e) {
			System.err.println("Please Enter a Number!!!");
		}
		finally {
		
		}
	}

}
