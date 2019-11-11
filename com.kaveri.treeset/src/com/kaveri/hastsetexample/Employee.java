package com.kaveri.hastsetexample;

import java.util.HashMap;

import java.util.Set;


public class Employee {

public static void main(String[] args) {
	    String e=null;
        Date d = new Date();
	    HashMap<String, String> hp = new HashMap<String, String>();

	    
	    hp.put("18-10-1995", "ahem");
	    hp.put("18-10-1996", "john");
	    hp.put("04-09-2008", "mary");
	    hp.put("08-02-2011", "john");

	    Set<String> keys =hp.keySet();

	    for(String key:keys) {
	    	
	    e=key;
	    }
String r=e;

d.getMetodFail(e, r);
 
	    }
  }
	  


