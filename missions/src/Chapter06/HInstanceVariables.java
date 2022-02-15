package chapter06;

public class HInstanceVariables {
	HInstanceVariables(){
		int my_non_static_int = 45;
		System.out.println("non static int only accesed within its scope: " + my_non_static_int);
	}
	public static void main(String[] args) {
		int my_int = 5;
		System.out.println("I can only access non static variables when they are within the local scope: "+my_int);
		System.out.println("They also aren't shared with different instances");
		@SuppressWarnings("unused")
		HInstanceVariables constructing_class = new HInstanceVariables(); //When creating a constructor, bad practice within the class itself though
		myClass exampleObjectInstance = new myClass();
		System.out.println("At construction: "+exampleObjectInstance.getInt());
		exampleObjectInstance.an_int++;
		System.out.println("Plus on eat instance: "+exampleObjectInstance.getInt());
		System.out.println("_________Creating another instance______");
		myClass exampleObjectInstance2 = new myClass();
		System.out.println("At construction: "+exampleObjectInstance2.getInt());
		exampleObjectInstance2.an_int++;
		System.out.println("Plus on eat instance: "+exampleObjectInstance2.getInt());
	}
	
	
	
}

class myClass {
	int an_int = 5;
	public int getInt(){return an_int;}
}
