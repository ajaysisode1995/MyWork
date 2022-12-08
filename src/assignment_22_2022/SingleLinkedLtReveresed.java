package assignment_22_2022;



public class SingleLinkedLtReveresed {
	
	static class Node {
		  int data;
		  Node next;
		  Node(int d) {
		    data = d;
		    next = null;
		  }
		}
	
	//represent head and tail of single linked list
			public Node head=null;
			public Node tail=null;
		
			public void addNode(int data){
				//create a new node
				Node newNode=new Node(data);
		
				//check if the list is empty
				if (head==null) {
					//add head and tail of element
					head=newNode;
					tail=newNode;
		}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void display() {
				Node current=head;
				if (head==null) {
					System.out.println("empty linked list");
					return;
				}
				System.out.println("Nodes of single linked list");
				while (current!=null) {
					System.out.println(current.data+" ");
					current=current.next;
				}
				System.out.println();
			}
		
		static Node reverse(Node head) {
		  if (head == null || head.next == null)
		    return head;

		  Node rest = reverse(head.next);
		  head.next.next = head;

		  head.next = null;
		  return rest;
		}
		public static void main(String[] args) {
			SingleLinkedLtReveresed t=new SingleLinkedLtReveresed();
			t.addNode(1);
			t.addNode(2);
			t.addNode(3);
			t.addNode(4);
			
			//System.out.println(reverse(t));
			
		}
}
