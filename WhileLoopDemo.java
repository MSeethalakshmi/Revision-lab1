package Module1.Lab;

import java.util.Scanner;

public class WhileLoopDemo {
   public static void main(String[] args) {
	int number, sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter any interger value below 10: ");
	number=sc.nextInt();
	while(number<=10) {
		sum=sum+number;
		number++;
		
	}
	System.out.format("Sum of the numbers from the while loop is: %d",sum);
   }
}
