package chapter06;
import java.util.*;

public class Project_04_SpeedCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance (miles): ");
		int distance = sc.nextInt();
		System.out.print("Enter time (hours): ");
		int time = sc.nextInt();
		sc.close();
		int speed = distance/time;
		System.out.println("You are going approximately at: "+speed+" mph");

	}

}
