class StackPrc{
	private String[] arr;
	private int top;
	private int capacity;

	StackPrc(int size){
	capacity=size;
	arr=new String[capacity];
	}




public void push(String data){
	if(top==arr.length-1){
	System.out.println("Stack is full can't insert");
	return;
	}
	top++;
	arr[top]=data;
}


 public String pop(){

 	if(top==-1){
 		System.out.println("Stack is empty can't remove");
 		return null;
 	}
 	String topitem=arr[top];	
 	arr[top]=null;		
 	top--;
 	return topitem;
 }


 		public static void main(String[] args) {
 			StackPrc obj=new StackPrc(5);
 			obj.push("Abdul Shakoor");
 			obj.push("Blawal");
 			obj.push("Simon");
 			 obj.push("Sonu");

 			System.out.println("Poped elemnt :"+obj.pop());
 		}

 }