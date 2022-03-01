package chapter09;
import helpers.*;

public class LinkedList {
	private Node head = null;
	private Node tail = null;
	Print o = new Print();
	
	public LinkedList() {
	}
	
	public LinkedList(int[] numbers) {
		Node[] nodes = new Node[numbers.length];
		this.head = initialize(numbers, true, 0, nodes);
		getLength();
	}
	
	private Node initialize(int[] numbers, boolean start, int index, Node[] nodes) {
		if (numbers.length == 1 && start) {
			Node node = new Node(numbers[0]); 
			node.setHead(true);
			node.setTail(true);
			node.setNext(node);
			node.setPrevious(node);
			return node;
		}
		else if (start && numbers.length > 1){
			Node node = new Node(numbers[index]);
			nodes[index] = node;
			node.setHead(true);
			node.setPrevious(tail);
			node.setNext(initialize(numbers, false, index+1, nodes));;
			return node;
		}
		
		else if (!start && numbers.length-1 != index) {
			Node node = new Node(numbers[index]);
			nodes[index] = node;
			node.setPrevious(nodes[index-1]);
			node.setNext(initialize(numbers, false, index+1, nodes));
			return node;
		}
		else if (!start && index == numbers.length-1){
			Node node = new Node(numbers[index]);
			node.setTail(true);
			node.setNext(head);
			tail = node;
			node.setPrevious(nodes[index-1]);
			return node;
		}
		return null;
	}
	
	
	public Node getNode(int index) {
		Node current_node = head; 
		for (int i = 0; i <index; i++) {
			current_node = current_node.getNext();
		}
		return current_node;
	}
	
	public void deleteNode(int index) {
		if (getLength()>1) {
			try {
				Node node_to_delete = getNode(index);
				Node previous = node_to_delete.getPrevious();
				Node next = node_to_delete.getNext();
				previous.setNext(next);
				next.setPrevious(previous);
				if (node_to_delete.isHead()) {
					next.setHead(node_to_delete.isHead());
					setHead(next);
				}
				else if (node_to_delete.isTail()) {
					previous.setTail(node_to_delete.isTail());
					setTail(previous);
				}
			} catch (Exception e) {
				System.out.println("Index out of bounds");
			}
		}
	}
	
	public void appendNode(int payload) {
		Node previous = getTail();
		Node new_node = new Node(payload);
		new_node.setNext(getHead());
		new_node.setPrevious(previous);
		new_node.setTail(true);
		previous.setTail(false);
		this.getHead().setPrevious(new_node);
		this.getTail().setNext(new_node);
		setTail(new_node);
	}
	
	public int getLength() {
		Node pointer = this.head;
		int count = 0;
		while (pointer != null) {
			count++;
			pointer = pointer.getNext();
		}
		return count;
	}
	
	public void printLinkedList() {
		Node pointer = this.head;
		//o.print(pointer.getPayload()+"|"+ pointer.isHead()+"|"+pointer.isTail()+"\t");
		o.print(pointer.getPayload() + "  ");
		pointer = pointer.getNext();
		while (pointer != null && pointer.isHead() == false) {
			o.print(pointer.getPayload()+"  ");
			pointer = pointer.getNext();
		}
		o.print("\n");
	}

	public Node getHead() {
		return head;
	}

	private void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	private void setTail(Node tail) {
		this.tail = tail;
	}
	
	
}
