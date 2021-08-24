package stack;

public class StackX {
	private int maxSize; // size of the stack array
	private double []stackArray;
	private int top; // top of the stack 
	
	public StackX (int s) {
		maxSize = s; //set array size
		stackArray = new double[maxSize];
		top = -1; //no of items
	}

	//push method (insert the values to the stack)
	public void push (double j) {
		if (top == maxSize -1) 
			System.out.println("Stack os full !");
		else
			stackArray[++ top] = j;
	}
	
	// pop method (delete the values of the stack)
	public double pop() {
		if ( top == -1)
			return -99;
		else 
			return stackArray [top--];
	}
	
	//peek method (only see the first value of the stack)
	public double peek() {
		if (top == -1)
			return -99;
		else
			return stackArray [top];
	}
	
	public boolean isFull() {
		if (top == maxSize -1)
			return true;
		else
			return false;
		//return(top == maxSize -1);
	}
	
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else 
			return false;
		//return(top == -1)
	}

	
}
