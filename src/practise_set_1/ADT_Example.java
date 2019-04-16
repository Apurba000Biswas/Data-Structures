package practise_set_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ADT_Example {
	
	public static void main(String[] args){
		ADT_Example obj = new ADT_Example();
		obj.run();
	}
	
	private void run(){
		Stack<String> stack = getStack();
		System.out.println("Top element of Stack is: " + stack.peek());
		printStack(stack);
		
		Queue<String> queue = getQueue();
		System.out.println("\nTop element of queue is : " + queue.peek());
		printQueue(queue);
	}
	
	private Stack<String> getStack(){
		Stack<String> stack = new Stack<>();
		stack.push("stack data 1");
		stack.push("stack data 2");
		stack.push("stack data 3");
		stack.push("stack data 4");
		stack.push("stack data 5");
		return stack;
	}
	
	private void printStack(Stack<String> stack){
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	
	private Queue<String> getQueue(){
		Queue<String> queue = new LinkedList<>();
		queue.add("queue data 1");
		queue.add("queue data 2");
		queue.add("queue data 3");
		queue.add("queue data 4");
		queue.add("queue data 5");
		return queue;
	}
	
	private void printQueue(Queue<String> queue){
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}

}
