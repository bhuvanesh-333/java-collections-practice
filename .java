package collections;

import java.util.TreeMap;

//to check the two interger values 
class y{
	static void dispaly() {
		TreeMap<Integer, Integer> a=new TreeMap<Integer, Integer>();
		
//		a.put(null, null);
//		a.put(null, null);   // ------> to check the duplicate values 
		a.put(1 ,2 );
		a.put(1 , 2);
		a.put(2 ,2 );          // -----> to check the insertion order 
		a.put( 2, 3);
		a.put( 8, 3);
		a.put( 4, 5);
		a.put(3 , 5);
		a.put(6 , 7);
		
		System.out.println(a);
		
	}
	
	
	static void output() {
		TreeMap<String, Integer> b=new  TreeMap<String, Integer>();
		b.put("a", 1);
		b.put("a", 2);
		b.put("b", 1);
		b.put("c", 1);
		b.put("d", 1);
		b.put("e", 1);
		b.put("f", 1);
		b.put("g", 1);
		b.put("h", 1);
		
		System.out.println(b);
	}
}


public class treemap {

	public static void main(String[] args) {
		y.dispaly();
		y.output();

	}

}
