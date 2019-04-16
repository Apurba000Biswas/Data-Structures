package practise_set_2;

public class MyStackTest {
	
	
	public static void main(String[] args){
		MyStackTest obj = new MyStackTest();
		obj.run();
	}
	
	private void run(){
		/*
		MyStack intStack = new MyStack();
		intStack.push(4);
		intStack.push(6);
		intStack.push(13);
		intStack.push(67);
		System.out.println(intStack);
		while(!intStack.isEmpty()){
			System.out.println("Top = " + intStack.peek());
			intStack.pop();
			System.out.println(intStack);
		}
		*/
		
		MyIntLinkedList ll = new MyIntLinkedList();
		ll.addFront(10);
		ll.addFront(11);
		ll.addFront(2);
		ll.addFront(76);
		ll.addFront(12);
		ll.addFront(13);
		
		ll.addBack(20);
		
		System.out.println("List is : " + ll);
		
		ll.removeFront();
		System.out.println("After Removing front : " + ll);
		ll.removeBack();
		System.out.println("After Removing Back : " + ll);
		ll.insert(2, 511);
		System.out.println("After Insert 511 in 2 : " + ll);
		
		System.out.println("Front is : " + ll.getFront());
		System.out.println("Back is : " + ll.getBack());
		System.out.println("Value in 3 is : " + ll.get(3));
		
		System.out.println("Minimum is : " + ll.getMinmum());
		System.out.println("Is Sorted? : " + ll.isSorted());
	}
}
