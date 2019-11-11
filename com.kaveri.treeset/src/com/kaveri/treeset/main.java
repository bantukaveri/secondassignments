package com.kaveri.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
       Person p = new Person(65, 5.2, "john");
       Person p1 = new Person(75,5.5," scott");
       Person p2 = new Person(65,4.9,"jersy");
       Person p3 = new Person(63,5.0,"dabuu");
       Person p4 = new Person(69,5.1,"hari");
       Person p5 = new Person(70,5.3,"viren");
       Person p6 = new Person(68,5.6,"miller");
       Person p7 = new Person(61,5.6,"john");
       Person p8 = new Person(62,4.8,"mery");
       
        TreeSet <Person >t = new TreeSet<Person >(Comparator.comparing(Person::getWeight));
        
        t.add(p);
        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);
        t.add(p5);
        t.add(p6);
        t.add(p7);
        t.add(p8);
        
       System.out.println(t);
        
	}

}
