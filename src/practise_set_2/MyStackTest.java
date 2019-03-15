package practise_set_2;

public class MyStackTest {
	
	
	public static void main(String[] args){
		MyStackTest obj = new MyStackTest();
		obj.run();
	}
	
	private void run(){
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
	}
}
