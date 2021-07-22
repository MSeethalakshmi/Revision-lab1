package Module1.Lab;

import java.util.Scanner;
public class Basic {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter value for a..:");
int a=scan.nextInt();
System.out.println("Enter value for b...:");
int b=scan.nextInt();
int mul=a*b;
System.out.println("The Multiplication of a and b is..:"+mul);
}
}