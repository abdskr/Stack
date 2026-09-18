
class StackScr{
	int[] arr;
	int top;
	int capacity;


	public StackScr(int s){
		capacity=s;
		arr=new int[capacity];
		top=-1;
	}

	public void push(int data){

		if(top==arr.length-1){
			System.out.println("Sorry! Stack overFlow");
			return;
		}
		top++;
		 arr[top]=data;
		 System.out.println("Pushed "+data+"at index "+top);
	}

	public int pop(){
		if(top==-1){
			System.out.println("Sorry! Stack underFlow");
			return -1;
		}
		
		int poppedVal=arr[top];
		top--;
		return poppedVal;

	}

	public static void main(String[] args) {
        StackScr stack = new StackScr(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // This will trigger Stack Overflow
        stack.push(40);

        // System.out.println("Top element (Peek): " + stack.peek()); // 30
        System.out.println("Popped element: " + stack.pop());     // 30
       // System.out.println("New Top element: " + stack.peek());     // 20
    }
}