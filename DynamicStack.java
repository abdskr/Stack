class Node {
    int data;
    Node next;

    Node(int s) {
        this.data = s;
        this.next = null;
    }
}

class DynamicStack {
    Node head;

    public void push(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        // Null check to prevent crash if stack is empty
        if (head == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        // 1. LOOP TO PUSH ELEMENTS (10, 20, 30, 40, 50)
        System.out.println("--- Pushing Elements ---");
        for (int i = 2; i <= 20; i += 2) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }

        System.out.print("\nCurrent Stack (Top to Bottom): ");
        stack.display();

        // 2. LOOP TO POP ALL ELEMENTS UNTIL STACK IS EMPTY
        System.out.println("\n--- Popping Elements ---");
        while (stack.head != null) {
            System.out.println("Popped element: " + stack.pop());
            System.out.print("Stack after pop: ");
            stack.display();
        }

        System.out.print("\nFinal Stack Status: ");
        stack.display();
    }
}