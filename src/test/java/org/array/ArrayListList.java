package org.array;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListList {


public static void main(String[] args) {
	List<Integer> l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	int size = l.size();
	System.out.println(size);
	for(int i=0;i<l.size();i++) {
		if(l.get(i)==10) {
			l.set(i, 60);
		}
	}
	System.out.println(l);
	List li=new LinkedList();
	li.add(100);
	li.add(100);
	li.add(300);
	li.add(405);
	li.add(500);
	li.add(100);
	li.add(700);
	int size2 = li.size();
	System.out.println(size2);
	List n=new Vector();
	n.add(105);
	n.add(205);
	n.add(305);
	n.add(405);
	n.add(505);
	n.add(605);
	n.add(705);
	n.add(805);
	int length = n.size();
	System.out.println(length);
	List<Integer> e=new LinkedList<Integer>();
	e.add(60);
	e.add(10);
	e.add(20);
	e.add(30);
	e.add(90);
	int indexOf = e.indexOf(20);
	System.out.println(indexOf);
	int lastIndexOf = e.lastIndexOf(90);
	System.out.println(lastIndexOf);
	e.add(10);
	e.add(10);
	e.add(40);
	e.add(50);
	int IndexOf = e.indexOf(50);
	System.out.println(IndexOf);
	int indexOf2 = e.indexOf(90);
	System.out.println(indexOf2);
		for(int i=0;i<e.size();i++) {
			if(e.get(i)==10) {
			System.out.println("index"+i);
			}
		}
		for(int i=0;i<e.size();i++) {
			if(e.get(i)==70) {
				System.out.println("index"+i);
			}
		}
		Integer presentindex = e.get(2);
		System.out.println(presentindex);
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
		for(int x:e) {
			System.out.println(x);
		}
		l.remove(4);
		System.out.println(l);
		e.add(2, 50);
		System.out.println(e);
		n.set(3, 350);
		System.out.println("replace"+n);
		
		
	l.retainAll(e);
	System.out.println("common values"+l);
	n.retainAll(l);
	System.out.println("common values"+n);
	e.removeAll(l);
	System.out.println(e);
	
	
	
}
}
