package chapter08;
import java.util.Scanner;

public class Project_02_ComputerSimulator {

	public static void main(String[] args) {
		boolean on = true;
		int pointer = 100;
		int cache = 101;
		Scanner reader = new Scanner(System.in);
		int[] memory = new int[102]; // 101 location is an accumulator
		while (on) {
			print("Enter an instruction:"); //4 digits. First two define the instruction, and last two are part of the operand.
			memory[pointer] = reader.nextInt();
			println(memory[pointer]);
			switch (memory[pointer]/100) {
				case 10: print("Enter integer to store: "); //Store number
						 memory[cache] = reader.nextInt();
						 memory[memory[pointer]%100] = memory[cache];
						 break;
				case 11: println(memory[memory[pointer]%100]); //print stored number
						 break;
				case 20: memory[cache] =  memory[pointer]%100; //Load number into cache
						 break;
				case 21: print("Where do you want to store the accumulator's value? : "); //Store cache value into memory
						 memory[reader.nextInt()] = memory[cache] ;
				case 30: print("What integer do you wanna add up with the accumulator's value? : ");
						 memory[cache] = memory[cache] + reader.nextInt();
				case 43: on = false;
						 break;
				default: on = false;
						 println("Wrong input, exiting...");
			}
		}
		reader.close();
		println("Program's finished, thank you for playing this simulator!");
	}
	
	public static void println(String text) {
		System.out.println(text);
	}
	
	public static void println(int text) {
		System.out.println(text);
	}
	
	public static void println(boolean text) {
		System.out.println(text);
	}

	public static void print(String text) {
		System.out.print(text);
	}
	
	public static void print(int text) {
		System.out.print(text);
	}
	
	public static void print(boolean text) {
		System.out.print(text);
	}

}
