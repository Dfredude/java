package chapter06;

public class GStaticVariable {
	public static int my_int = 45;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("I can access my statics variables outside a method: "+my_int+" & "+ my_other_static_int);
		GStaticVariable.my_int++; 
		System.out.println("I updated statically myInt to: " + my_int);
		System.out.println("I can't access my non static variable outside of this method my_non_static_int");
		GStaticVariable myClass = new GStaticVariable();
		myClass.addOneToInt(); //This is a bad practice, just for demonstration
		System.out.println("I updated statically with a different instance of my class my_int to: " + my_int);
	}
	
	public static void addOneToInt() {my_int++;}
	
	static int my_other_static_int = 5;
	
} 
