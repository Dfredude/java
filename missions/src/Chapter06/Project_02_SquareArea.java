package chapter06;
import java.util.*;

public class Project_02_SquareArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to this program to compute a rectangle's area.");
		System.out.print("Enter the rectangle's height: ");
		int height = sc.nextInt();
		System.out.print("Enter the rectangle's width: ");
		int width = sc.nextInt();
		System.out.println("The rectangle's got an area of: "+ (height*width));
		sc.close();		
	}

}
