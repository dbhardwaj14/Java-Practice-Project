//example of Hashset
package com.CollectionDemo;

import java.util.HashSet;

public class C {
	public static void main(String[] args) {
		HashSet al = new HashSet();
		al.add(5);
		al.add("HY");
		al.add("Hello");
		al.add(5);
		al.add("HY");
		al.add(3.7);
		System.out.println(al);
		System.out.println(al.hashCode());
}
}
