package practise_set_1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
	
	public static void main(String[] args){
		ListExample obj = new ListExample();
		obj.run();
	}
	
	private void run(){
		List<String> list;
		list = getArrayList();
		printList(list);
		
		list = getLinkedList();
		System.out.println("\nBefore inserting new data in the middle of the Linked List:");
		printList(list);
		insertInLinkedList(list);
		System.out.println("\nAfter inserting new data in the middle of the Linked List:");
		printList(list);
	}
	
	private List<String> getArrayList(){
		List<String> list = new ArrayList<>();
		list.add("Array List string data 1");
		list.add("Array List string data 2");
		list.add("Array List string data 3");
		list.add("Array List string data 4");
		list.add("Array List string data 5");
		list.add("Array List string data 6");
		return list;
	}
	
	private void printList(List<String> list){
		for(String data : list){
			System.out.println(data);
		}
	}
	
	private List<String> getLinkedList(){
		LinkedList<String> list = new LinkedList<>();
		list.add("Linked List string data 1");
		list.add("Linked List string data 2");
		list.add("Linked List string data 3");
		list.add("Linked List string data 4");
		list.add("Linked List string data 5");
		list.add("Linked List string data 6");
		list.add("Linked List string data 7");
		return list;
	}
	
	private void insertInLinkedList(List<String> list){
		list.add(4, "This is new Data");
	}

}
