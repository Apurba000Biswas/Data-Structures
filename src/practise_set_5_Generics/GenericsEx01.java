package practise_set_5_Generics;

public class GenericsEx01 {

	public static void main(String[] args) {
		GenericsEx01 obj = new GenericsEx01();
		obj.run();
	}
	
	private void run(){
		
		System.out.println("Min = " + min(12, 6));
		System.out.println("Min = " + min(5.5678, 5.453));
		System.out.println("Min = " + min("yes", "you"));
		System.out.println("Min = " + min('d', 'f'));
		
		testLClass obj1 = new testLClass(1,2);
		testLClass obj2 = new testLClass(3,4);
		System.out.println("Min = " + min(obj1, obj2));
		System.out.println("Max = " + max(obj1, obj2));
		
		
		System.out.println("Max = " + max(12, 6));
		System.out.println("Max = " + max(5.5678, 5.453));
		System.out.println("Max = " + max("yes", "you"));
		System.out.println("Max = " + max('d', 'f'));
		
		System.out.println("Equal = " + isEqual(10, 10));
		System.out.println("Equal = " + isEqual(10, 1));
		System.out.println("Equal = " + isEqual(10.3401, 10.3401));
		System.out.println("Equal = " + isEqual("Apurba", "Apurba"));
		System.out.println("Equal = " + isEqual('d', 'D'));
		obj1 = new testLClass(1,2);
		obj2 = new testLClass(1,2);
		System.out.println("**Equal = " + isEqual(obj1, obj2));
	}
	
	
	public <T extends Comparable<T>> T min(T a, T b) {
		return (a.compareTo(b) < 0)? a : b;
	}
	
	public <T extends Comparable<T>> T max(T a, T b) {
		return (a.compareTo(b) > 0)? a : b;
	}
	
	public <T> boolean isEqual(Comparable<T> a, Comparable<T>  b){
		return a.compareTo((T) b) == 0;
	}
}

class testLClass<T> implements Comparable<T>{
	private int data1;
  	private int data2;
  	testLClass(int data1, int data2){
  		this.data1 = data1;
  		this.data2 = data2;
  	}
	
	@Override
	public int compareTo(T obj) {
		testLClass newObj = (testLClass)obj;
		if(newObj.data1 > this.data1 && newObj.data2 > this.data2){
			return -1;
		}else if (newObj.data1 == this.data1 && newObj.data2 == this.data2){
			return 0;
		}else{
			return 1;
		}
	}
	
	@Override
	public String toString(){
		return "data1 : " + data1 + " data2 : " + data2;
	}
}

