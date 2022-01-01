package org.string;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		//Array List
		List l = new ArrayList();
		
		l.add(16);
		l.add("deva");
		l.add('A');
		l.add(1234.6789);
		l.add(16);
		System.out.println(l);
		// Get Method 
		 Object obj =l.get(3);
		 System.out.println(obj);
		 //Index of
		 int indexof = l.indexOf("deva");
		 System.out.println(indexof);
		//Set Override
		 l.set(0,12 );
		 System.out.println(l);
		 l.set(4,7890.1234);
		 System.out.println(l);
		 //for 
		 		}
		 
		 
		
	}
	
	

