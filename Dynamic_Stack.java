
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class Dynamic_Stack{
    Node top;
    Dynamic_Stack(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    main(String[] args) {
        Dynamic_Stack stack = new Dynamic_Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.print("Current Stack: ");
        stack.display();
        System.out.println("Popped element: " + stack.pop());
        System.out.print("Stack after pop: ");
        stack.display();
    }
}           