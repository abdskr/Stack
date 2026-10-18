class Static_Stack{
    int[] arr;
    int top;
    int count;

    Static_Stack(int size){
        this.arr = new int[size];
        this.top = -1;
        this.count = 0;
    }

    



public boolean isEmpty(){
	return count==0;
}
	public boolean isFull(){
	return count==arr.length;
	}

public void push(int val){
	if(isFull()){
	System.out.println("Stack overFlow");

	}
	top++;
	arr[top]=val;
	count++;
 
}

public int pop(){
	if(isEmpty()){
	System.out.println("Stack underFlow");
	return -1;

	}
	int val=arr[top];
	top--;
	count--;
	return val;
}

public int peek(){
	return arr[top];
}



public void display(){
    for(int i=top;i>=0;i--){
    System.out.print(arr[i]+" ");
    }
    System.out.println();

}
         public static void main(String[] args) {
        Static_Stack stack = new Static_Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        stack.display();

}
}