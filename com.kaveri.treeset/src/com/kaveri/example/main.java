package com.kaveri.example;

import java.util.Hashtable;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	  }
	}


