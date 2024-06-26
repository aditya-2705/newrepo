class Node
{
	int data;
	Node next;
}
class linked
{
	public static void main(String[]args)
	{
		Node node1=new Node();
		Node node2=new Node();
		Node node3=new Node();
		Node node4=new Node();
		Node node5=new Node();
		node1.data=10;
		node2.data=20;
		node3.data=30;
		node4.data=40;
		node5.data=50;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		System.out.println("Linked list Successfully created");
		Node head=node1;
		while(head!=null)
		{
			System.out.print(head.data+"-->");
			head=head.next;
		}
	}
}

	