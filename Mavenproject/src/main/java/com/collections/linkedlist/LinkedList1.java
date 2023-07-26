package com.collections.linkedlist;
import java.util.*;
public class LinkedList1 {
public static void main(String args[]) {
	LinkedList<String>name=new LinkedList<String>();
	name.add("ANAS");
	name.add("fathima");
	name.add("Hyrin");
	name.add("ilmunisa");
	name.add("ANAS");
	Iterator<String>itr=name.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	
} 
}
