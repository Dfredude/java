package chapter06;

public class Project_07_CreatingDivision {

	public static void main(String[] args) {
		System.out.println(divideByTwo(600));

	}
	
	static int divideByTwo(int num_to_divide) {
		return (num_to_divide>>2);
	}

}
