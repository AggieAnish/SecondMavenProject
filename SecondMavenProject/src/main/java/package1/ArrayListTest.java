package package1;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String args[]) {
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("Mango");
	arr.add("Apple");
	arr.add(0, "Banana");	
	System.out.println(arr);
	
	
	ArrayList<String> arr1 = new ArrayList<String>();
	arr1.add("Potato");
	System.out.println(arr1);
	arr.addAll(arr1);
	System.out.println(arr);
	
	//arr1.clear();
//	System.out.println(arr1);
	
	if (arr.contains(arr1)) {}
	
	System.out.println(arr1);	
	System.out.println(arr);	
	
	}

}
