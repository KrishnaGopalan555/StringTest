package org.string;

public class StringTypes {

	public static void main(String[] args) {
	String s1="java";
	String s2="java";
	String s3="maven";
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	
	
	
	String s4=new String("java");
	String s5=new String("java");
	String s6=new String("maven");
	
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	System.out.println(System.identityHashCode(s6));
	
	String s7 ="java";
	String s8="maven";
	String concat = s7.concat(s8);
	System.out.println(System.identityHashCode(s7));
	System.out.println(System.identityHashCode(s8));
	System.out.println(System.identityHashCode(concat));
	
	StringBuilder s9= new StringBuilder("java");
	StringBuilder s10=new StringBuilder("maven");
	StringBuilder append = s10.append(s9);
	System.out.println(System.identityHashCode(s9));
	System.out.println(System.identityHashCode(s10));
	System.out.println(System.identityHashCode(append));
		
	
	}

}
