
public class Ques1 {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d  ;
			next = null;
			
		}
	}
	Node reverse(Node node) {
		Node prev = null;
		Node Current = node;
		Node next = null;
		while(Current != null) {
			next = Current.next;
			Current.next = prev;
			prev = Current;
			Current = next;
		}
		node = prev;
		return node;
	
	}
	void display(Node node) {
		while(node != null ) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		Ques1 list  = new Ques1();
		list.head =new Node(1);
		list.head.next =new Node(2);
		list.head.next.next =new Node(3);
		list.head.next.next.next =new Node(4);
		list.head.next.next.next.next =new Node(5);
		list.head.next.next.next.next.next =new Node(6);
		list.head.next.next.next.next.next.next =new Node(7);
		list.head.next.next.next.next.next.next.next =new Node(8);
		list.head.next.next.next.next.next.next.next.next =new Node(9);
		list.head.next.next.next.next.next.next.next.next.next =new Node(10);

		System.out.println("Given Linked list");
		list.display(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed Linked List");
		list.display(head);
	}

}
