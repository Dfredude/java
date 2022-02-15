package chapter06;
import java.util.Scanner;

public class Project_06_FuelEfficiency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter miles traveled: ");
		int miles = sc.nextInt();
		System.out.print("Enter gallons used: ");
		int gals = sc.nextInt();
		int efficiency = miles/gals;
		System.out.println("Your car's got an efficiency of: "+efficiency+"mpg");
		sc.close();
	}

}
