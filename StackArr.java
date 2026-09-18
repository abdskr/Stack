public class StackArr{
	String[] arr;
	int top;

	public StackArr(int size){
		arr=new String[size];
		top=-1;
	}

	public void push(String val){
		if(top==arr.length-1){
			System.out.println("Stack overFlow");
			return;
		}
		top++;
		arr[top]=val;

	}

	public String pop(){
		if(top==-1){
			System.out.println("Stack underFlow");
			return null;
		}
		String val=arr[top];
		top--;
		return val;
	}

	public String peek(){
		return arr[top];
	}

	public static void main(String[] args){
		StackArr stack=new StackArr(10);
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");
		stack.push("H");
		stack.push("I");
		System.out.println("Peeked element is :"+stack.peek());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());
		System.out.println("Popped element is :"+stack.pop());

	}
 }
