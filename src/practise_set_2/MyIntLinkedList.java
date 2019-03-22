package practise_set_2;

public class MyIntLinkedList {
	
	private ListNode front;
	
	public MyIntLinkedList(){
		front = null;
	}
	
	public void addFront(int value){
		if(front == null){
			front = new ListNode(value);
		}else{
			ListNode newNode = new ListNode();
			newNode.data = value;
			newNode.next = front;
			front = newNode;
		}
	}
	
	public void addBack(int value){
		if(front == null){
	        // empty list
	        front = new ListNode(value);
	    }else{
	        ListNode current = front;
	        while(current.next != null){
	            current = current.next;
	        }
	        // at this point current is pointing to the last element
	        ListNode newValue = new ListNode();
	        newValue.data = value;
	        newValue.next = null;

	        current.next = newValue;
	    }
	}
	
	public void insert(int index, int value){
		ListNode current = front;
	    ListNode previous = null;
	    int currentIndex = 0;
	    while(true){
	        if(currentIndex == index){
	            //now current is pointing to the given index
	            ListNode newNode = new ListNode();
	            newNode.data = value;
	            newNode.next = current;
	            previous.next = newNode;
	            break;
	        }
	        currentIndex++;
	        previous = current;
	        current = current.next;
	    }
	}
	
	public void removeFront(){
		if(front != null){
	        front = front.next;
	    }
	}
	
	public void removeBack(){
		ListNode current = front;
		ListNode previous = null;
		while(current.next != null){
			previous = current;
			current = current.next;
		}
		current = previous;
		current.next = null;
	}
	
	public final int getFront() {
	    return front.data;
	}

	public final int getBack() {
	    if(front.next != null){
	        ListNode current = front;
	        while(current.next != null){
	            current = current.next;
	        }
	        // now current is pointing to the last element
	        return current.data;
	    }else{
	        return 0;
	    }
	}

	public int get(int index) {
	    int currentIndex = 0;
	    ListNode current = front;
	    while(true){
	        if(currentIndex == index){
	            return current.data;
	        }
	        currentIndex++;
	        current = current.next;
	    }
	}
	
	public int getMinmum(){
		int min = 10000;
		ListNode current = front;
		while(current.next != null){
			min = getMin(min, current.data);
			current = current.next;
		}
		min = getMin(min, current.data);
		System.out.println("in getMinimum");
		return min;
	}
	
	private int getMin(int value1, int value2){
		return (value1 < value2) ? value1: value2;
	}
	
	
	public boolean isSorted(){
		if(front == null){
			return true;
		}else{
			ListNode current = front;
			
			while(current.next != null){
				if(current.data > current.next.data){
					return false;
				}
				current = current.next;
			}
			return true;
		}
	}
	
	public final String toString(){
		StringBuilder sb = new StringBuilder("[");
		ListNode current = front;
		while(current.next != null){
			sb.append(current.data + ", ");
			current = current.next;
		}
		
		sb.append(current.data + "]");
		return sb.toString();
	}
}


class ListNode{
	int data;
	ListNode next;
	
	ListNode(){
		data = 0;
		next = null;
	}
	
	ListNode(int value){
		data = value;
		next = null;
	}
}