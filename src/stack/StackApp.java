package stack;


public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackX  myStack = new StackX(10);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		
		while (!myStack.isEmpty()) {
			double value = myStack.pop();
			System.out.println(value);					
		}
	}

	}


