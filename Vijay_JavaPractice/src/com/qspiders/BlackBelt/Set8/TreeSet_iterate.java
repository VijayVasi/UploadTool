package com.qspiders.BlackBelt.Set8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_iterate {

	public static void main(String[] args) {

		TreeSet tSet = new TreeSet();
		
		tSet.add(new Integer("2"));
		tSet.add(new Integer("1"));
		tSet.add(new Integer("3"));
		tSet.add(new Integer("2"));
		
		Iterator itr = tSet.iterator();
		
		System.out.println("TreeSet contains: ");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
