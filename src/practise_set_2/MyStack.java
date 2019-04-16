package practise_set_2;

public class MyStack {
	
	private int[] elements;
	private int size;
	private int capacity;
	
	// constructor
	public MyStack(){
		elements = new int[10];
		size = 0;
		capacity = 10;
	}
	
	public void push(int value){
		if(size <= capacity){
			elements[size] = value;
			size++;
		}else{
			System.out.println("MyStack - out of capacity");
		}
	}
	
	public int pop(){
		if(size>0){
			int result = elements[size-1];
			elements[size-1] = 0;
			size--;
			return result;
		}else{
			return -1;
		}
	}
	
	public int peek(){
		if(size>0){
			return elements[size-1];
		}else{
			return -1;
		}
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public String toString(){
		StringBuilder sbStr = new StringBuilder("{");
		for(int i=0; i<size; i++){
			sbStr.append(elements[i] + " ");
		}
		sbStr.append("}");
		return sbStr.toString();
	}
	

}
