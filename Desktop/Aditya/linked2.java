class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class linked2
{
	public static void main(String[]args)
	{
		Node node1=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		Node node4=new Node(40);
		Node node5=new Node(50);
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
	