
class Node{
	int data;
	Node next;

	Node(int s){
		this.data=s;
		this.next=null;
	}
} 

class DynamicStack{
Node head;


	public void push(int n){
		Node newNode=new Node(n);
		newNode.next=head;
		head=newNode;
	}

	public int pop(){
		int value=head.data;
		head=head.next;

		return value;
	}

	public static void main(String[] args){
		DynamicStack stack=new DynamicStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Popped elemnet :"+stack.pop());
	}

}