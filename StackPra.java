class StackPra{
	private String[] arr;
	private int top;
	private int cap;

	public StackPra(int size){
	cap=size;
	arr=new String[cap];
	} 

	public void push(String data){

		if(top==cap-1){
		System.out.println("Sorry! Stack overFlow");
		return;
		}
		top++;
		arr[top]=data;

	}
	public String pop(){
	if(top==-1){
	System.out.println("Sorry! Stack underFlow");
		return null;
	}
	String topItem=arr[top];
	arr[top]=null;
		top--;

	return topItem;
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