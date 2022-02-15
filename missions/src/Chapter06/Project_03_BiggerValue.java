package chapter06;
import java.util.*;


public class Project_03_BiggerValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int int1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int int2 = sc.nextInt();
		int bigger;
		if (int1 > int2) {
			bigger = int1;
		}
		else bigger = int2;
		System.out.println("The bigger numberis : " + bigger);
		sc.close();
	}

}
