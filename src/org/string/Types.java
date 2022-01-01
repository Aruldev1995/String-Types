package org.string;

public class Types {

	public static void main(String[] args) {
		// Immutable String
		
		String s   = "dev";
		String s1  = "bab";
		String s2  = s.concat(s1);
		
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		 // Mutable String
		
		StringBuffer v = new StringBuffer("SQL");
		
		StringBuffer v1 = new StringBuffer("abc");
		StringBuffer v2 = v.append(v1);
		System.out.println("Mutable String");
		System.out.println(System.identityHashCode(v));
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		
		
		
		
	}
}
