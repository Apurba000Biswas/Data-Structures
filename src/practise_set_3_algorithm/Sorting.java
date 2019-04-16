package practise_set_3_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		Sorting obj = new Sorting();
		obj.run();
	}
	
	private void run(){
		
		List<Integer> list = getList();
		System.out.println("List is : " + list);
		runSelectionSort(list);//Runtime : N + (N-1) + (N-2) + (N-3) + ....... + 3 + 2 + 1 = N(N+1)/2 = O(n^2)
		System.out.println("After Running Selection Sort List is : \n" + list);
		
		list = getList();
		System.out.println("List is : " + list);
		runInsertionSort(list); // Runtime : O(n^2) - slightly faster than Selection sort
		System.out.println("After Running Insertion Sort List is : \n" + list);
		
		list = getList();;
		System.out.println("List is : " + list);
		runMergeSort(list); // Runtime : O(n log n)
		System.out.println("After Running Mege Sort List is : \n" + list);
	}
	
	private List<Integer> getList(){
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++){
			int value = rand.nextInt(500);
			list.add(value);
		}
		return list;
	}
	
	private void runSelectionSort(List<Integer> list){
		for(int i=0; i<list.size(); i++){
			int smallestIndex = i;
			
			for(int j=i+1; j<list.size(); j++){
				if(list.get(smallestIndex) > list.get(j)){
					smallestIndex = j;	
				}
			}
			swap(list, i, smallestIndex);
		}
	}
	
	private void swap(List<Integer> list, int i, int smallestIndex){
		int temp = list.get(smallestIndex);
		list.set(smallestIndex, list.get(i));
		list.set(i, temp);
	}
	
	private void runInsertionSort(List<Integer> list){
		for(int i=1; i<list.size(); i++){
			int temp = list.get(i);
			
			int j = i;
			while(j >= 1 && list.get(j-1) > temp){
				list.set(j, list.get(j-1));
				j--;
			}
			list.set(j, temp);
		}
	}
	
	private void runMergeSort(List<Integer> list){
		if(list.size() <= 1){
			// lol do nothing to do
		}else{
			// divide the list in two halves
			List<Integer> left = new ArrayList<Integer>();
			left.addAll(list.subList(0, list.size()/2));
			
			List<Integer> right = new ArrayList<Integer>();
			right.addAll(list.subList(list.size()/2, list.size()));
			
			// sort the halves
			runMergeSort(left);
			runMergeSort(right);

			// left and right sublist are sorted now
			// merge them 
			int i1 = 0;
			int i2 = 0;

			for(int i=0; i<list.size(); i++){
				if( i2>= right.size() || (i1 < left.size() && (left.get(i1) < right.get(i2)))){
					// take value from left
					list.set(i, left.get(i1));
					i1++;
				}else{
					// take value from right
					list.set(i, right.get(i2));
					i2++;
				}
			}
		}
	}
}
