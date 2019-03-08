package practise_set_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args){
		SetExample obj = new SetExample();
		obj.run();
	}
	
	private void run(){
		Set<String> set = getSet();
		printSet(set);
	}
	
	private Set<String> getSet(){
		Set<String> set = new HashSet<>();
		set.add("set data 1");
		set.add("set data 2");
		set.add("set data 3");
		set.add("set data 4");
		set.add("set data 5");
		return set;
	}
	
	private void printSet(Set<String> set){
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
