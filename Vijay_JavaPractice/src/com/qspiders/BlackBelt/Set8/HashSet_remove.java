package com.qspiders.BlackBelt.Set8;

import java.util.HashSet;

public class HashSet_remove {

	public static void main(String[] args) {

		HashSet hSet = new HashSet();
		
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		
		System.out.println("HashSet before removal: " + hSet);
		
		hSet.clear();	//clear method can be used
		hSet.removeAll(hSet);	//removeAll method can be used
		
		System.out.println("HashSet after removal: " + hSet);
		
		System.out.println("Is HashSet empty? " + hSet.isEmpty());

	}

}
