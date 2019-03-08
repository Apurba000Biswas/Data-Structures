package practise_set_1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class CountWords {
	private static final String FILE_NAME = "D:/Project/Data Structures/rand_storry.txt";

	private long timeTakenByList;
	private long timeTakenBySet;
	private long timeTakenByMap;
	
	public static final void main(String[] args){
		
		CountWords obj = new CountWords();
		obj.run();
	}
	
	private void run(){
		try{
			countWordsUsingList();
			countWordsUsingSet();
			countWordsUsingMap();
			
			System.out.println("\n\nList Took : ------- " + timeTakenByList + " Seconds");
			System.out.println("Set Took : ------- " + timeTakenBySet + " Seconds");
			System.out.println("Map Took : ------- " + timeTakenByMap + " Seconds");
		}catch(IOException ex){
			System.out.println("?????  " + ex.getMessage());
		}
	}
	
	private void countWordsUsingList() throws IOException{
		long startTime = System.nanoTime();
		Path path = Paths.get(FILE_NAME);
		Scanner scanner = new Scanner(path);
		System.out.println("Counting ... (Using ArrayList)");
		ArrayList<String> uniqueWords = new ArrayList<>();
		while(scanner.hasNext()){
			String word = scanner.next();
			if(!uniqueWords.contains(word)){
				uniqueWords.add(word);
			}
		}
		System.out.println("Total Unique Words : " + uniqueWords.size());
		scanner.close();
		
		long endTime   = System.nanoTime();
		timeTakenByList = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
	}
	
	private void countWordsUsingSet() throws IOException{
		long startTime = System.nanoTime();
		Path path = Paths.get(FILE_NAME);
		Scanner scanner = new Scanner(path);
		System.out.println("Counting ... (Using HashSet)");
		Set<String> uniqueWords = new HashSet<String>(); 
		while(scanner.hasNext()){
			String word = scanner.next();
			if(!uniqueWords.contains(word)){
				uniqueWords.add(word);
			}
		}
		System.out.println("Total Unique Words : " + uniqueWords.size());
		scanner.close();
		
		long endTime   = System.nanoTime();
		timeTakenBySet = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
	}
	
	private void countWordsUsingMap() throws IOException{
		long startTime = System.nanoTime();
		Path path = Paths.get(FILE_NAME);
		Scanner scanner = new Scanner(path);
		System.out.println("Counting ... (Using HashMap)");
		Map<String, Integer> wordsMap = new HashMap<>(); 
		while(scanner.hasNext()){
			String word = scanner.next();
			wordsMap.put(word, 1);
		}
		System.out.println("Total Unique Words : " + wordsMap.size());
		scanner.close();
		
		long endTime   = System.nanoTime();
		timeTakenByMap = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
	}
}
