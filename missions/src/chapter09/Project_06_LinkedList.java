package chapter09;
import helpers.Print;

public class Project_06_LinkedList {

	public static void main(String[] args) {
		Print o = new Print();
		o.println("---Basic Linked List is working!---");
		
		int[] nums = {1, 2, 3, 4, 40};
		LinkedList content_manager = new LinkedList(nums); //Automatically converting array into linked list
		content_manager.printLinkedList();
		content_manager.deleteNode(2);
		content_manager.appendNode(5);
		content_manager.printLinkedList();
		content_manager.appendNode(6);
		content_manager.printLinkedList();
		System.out.println("Program's finished");
		
		
	}

	

}
