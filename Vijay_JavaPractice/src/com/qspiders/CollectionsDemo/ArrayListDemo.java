package com.qspiders.CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


interface Fruit
{
	
}

class Orange implements Fruit
{
	
}

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Object> lst = new ArrayList<Object>();
		
				lst.add(10);
				lst.add(true);
				lst.add("Hello");
				lst.add(new String("Bangalore"));
				lst.add(new Orange());
				
				Orange o1 = new Orange();
				lst.add(o1);
				System.out.println(lst);
				
				System.out.println(lst.size());
				
				System.out.println(lst.contains(true));
				System.out.println(lst.contains("Hello"));
				System.out.println(lst.contains("Bangalore"));
				System.out.println(lst.contains(new Orange()));
				System.out.println(lst.contains(o1));
				
				System.out.println("--------Get Specific Object----------");
				
				System.out.println(lst.get(0));
				System.out.println(lst.get(4));
				
				String s1 = null;
				
				if(lst.get(2) instanceof String)
				{
					s1 = (String) lst.get(2);
					System.out.println(s1);
					System.out.println(s1.length());
				}
				
				System.out.println("------get all objects and print----------");
				
				for(int i=0; i<lst.size(); i++)
				{
					System.out.println(lst.get(i));
				}
				
				System.out.println("------get all objects & print using enhanced loop------------");
				
				for(Object obj:lst)
				{
					System.out.println(obj);
				}
				
				// To add objects of same type
				
				//ArrayList<Integer> lst2 = new ArrayList();
				//ArrayList<Orange> lst3	= new ArrayList();
				//ArrayList<Fruit> lst4	= new ArrayList();
				
				ArrayList<String> lst1 = new ArrayList();
				{
					lst1.add("Rajesh");
					lst1.add("Pinki");
					lst1.add("Monkey");
				}
				
				System.out.println("-----get all string objects & print using enhanced for loop------");
				
				for(String str:lst1)
				{
					System.out.println(str);
				}
				
				System.out.println("------Converting to Object Array and Printing Objects-----");
				
				Object[] objs = lst1.toArray();
				
				for(Object o:lst1)
				{
					System.out.println(o);
				}
				
				//Iterator is like a x-ray of collection, it is an Interface
				
				System.out.println("-------Using Iterator--------");
				
				Iterator itr = lst.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				System.out.println("--------Using List Iterator--------");
				
				ListIterator litr = lst.listIterator();
				
				while(litr.hasNext())
				{
					System.out.println(litr.next());
				}
				
				System.out.println("----------Going Reverse--------------");
				
				while(litr.hasPrevious())
				{
					System.out.println(litr.previous());
				}
				
				System.out.println("-----------Using List-----------");
				
				List lst4 = new ArrayList();
				
				lst4.add("Java");
				lst4.add(100);
				lst4.add(1,true);
				System.out.println(lst4);
				
				System.out.println("-------Adding elements from one list to other----------");
				
				lst1.addAll(lst4);
				System.out.println(lst1);
				
				System.out.println("-------Adding in the middle--------");
				
				lst1.addAll(2,lst4);
				System.out.println(lst1);
				
				lst1.remove(new Integer(100));
				System.out.println(lst1);
				
				lst1.remove(1);
				System.out.println(lst1);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
