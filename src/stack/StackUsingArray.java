package stack;

public class StackUsingArray {
	private int top;
	private final int capacity=10;
	private int[] s;
	
	public StackUsingArray() {
		s=new int[capacity];
		top=-1;
	}
	public StackUsingArray(int n) {
		s=new int[n];
		top=-1;
	}
	
	public void push(int ele) throws Exception {
		if((top+1)==s.length) {
			throw new Exception("Stack Overflow: Cannot push " + ele);
		}
		top++;
		s[top]=ele;
	}
	
	public int pop() throws Exception {
		if(top==-1) {
			throw new Exception("Stack is empty");
		}
		int del=s[top];
		top--;
		return del;
	}
	
	public int peek() throws Exception{
		if(top==-1) {
			throw new Exception("Stack is Empty");
		}
		return s[top];
	}
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		StackUsingArray s=new StackUsingArray();
		s.push(10);
		s.push(20);
		s.display();
		System.out.println(s.peek());

	}

}
