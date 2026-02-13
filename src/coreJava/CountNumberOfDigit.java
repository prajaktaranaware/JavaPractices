package coreJava;
import java.util.Scanner;

public class CountNumberOfDigit {
  
	public static int countDigits(int number){
		int count= 	0;
		while (number!=0) {
			number=number/10;
			count++; 	
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create scanner object to get user input:Scanner is a Java utility class used to read input from users or data sources.
		Scanner sc=new Scanner(System.in);
		
		//asking user to input number
		System.out.println("Enter number for count digits");
		int number= sc.nextInt();
		
		//calling method
		int digitsCount=countDigits(number);
		
		//displaying the result
		System.out.println("total numbers of digits are "+ digitsCount + "in number"+ number);
		
		sc.close();
	}

}
