package org.string;

public class String1 {

	public static void main(String[] args) {
		String s = " Krishna Gopalan";
		
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		boolean startsWith = s.startsWith("K");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("a");
		System.out.println(endsWith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String substring = s.substring(8);
		System.out.println(substring);
		
		String substring2 = s.substring(0, 7);
		System.out.println(substring2);
		
		boolean contains = s.contains("K");
		System.out.println(contains);
		
		String s1="jav";
		boolean empty2 = s1.isEmpty();
		System.out.println(empty2);
		
		String s2= "java";
		String s3= "Java";
		String s4 = "maven";
		
		boolean equals = s2.equals(s3);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);
		
		String replace = s.replace("a", "r");
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("Krishna", "sandhiya");
		System.out.println(replaceAll);
		
		String concat = s2.concat(s4);
		System.out.println(concat);
		
		String trim = s.trim();
		System.out.println(trim);
		
		int compareTo = s2.compareTo(s4);
		System.out.println(compareTo);
		
		
		
		
	
		
		
		
		
		
	}

}
