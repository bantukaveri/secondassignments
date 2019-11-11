package com.kaveri.listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {
	 
	  
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	   
	
	    ArrayList arrayList = new ArrayList();
	   
	  
	    arrayList.add("john");
	    arrayList.add("mary");
	    arrayList.add("scott");
	    arrayList.add("peter");
	    arrayList.add("ester");
	   
	    
	    ListIterator itr = arrayList.listIterator();
	   
	    
	    while(itr.hasNext())
	      System.out.println(itr.next());
	 System.out.println("******************");
	    while(itr.hasPrevious())
	      System.out.println(itr.previous());
	   
	  }
	}

