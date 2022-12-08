package assignment_21;
public class RemoveDuplicateEleFromLinkedList {

		static class Node{
		      int data;
		      Node next;
			public Node(int data) {
				super();
				this.data = data;
				this.next = null;
			}
		}
		//initially the linked list represent head and tail is null
		
		static Node head=null;
		static Node tail=null;
		//the method which add new node in the linked list
		public static void addNode(int data) {//
			Node newNode=new Node(data);//Node node=new Node() is similer to 
			
			//first check whether linked list is empty or not
			
			if (head==null) {
				//here it will add the Node
				head=newNode;
			}
			else {
				tail.next=newNode;
			}
			tail=newNode;
		}
		
		public static void removeDuplicateEle() {
			Node current=head,index=null,temp=null;
			if (current==null) {
				return;
			}
			else {
				while (current!=null) {
					//current temp node will point to the previous node to hte element
					current=temp;
					//index will point to the next node
					index=current.next;
					while (index!=null) {
						if (current.data==index.data) {
							temp.next=index.next;
						}
						else {
							temp=index;
						}
						index=index.next;
					}
					current= current.next;
				}
			}
		}
		
		public static void display() {
			 //Node current will point to head
            Node current = head;
            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            while(current != null) {
                //Prints each node by incrementing pointer
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
		}
		
		
		public static void main(String[] args) {
			RemoveDuplicateEleFromLinkedList linkedList=new RemoveDuplicateEleFromLinkedList();
			linkedList.addNode(5);
			linkedList.addNode(10);
			linkedList.addNode(11);
			linkedList.addNode(10);
			System.out.println("Original list");
			display();
			removeDuplicateEle();
			System.out.println("after removing duplicate element");
			display();
			
			
			
		}
}
