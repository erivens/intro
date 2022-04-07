package intro;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a set is a set of unique elements.  Cannot have repeats, and position doesn't matter
	//////    SETS	
		Set<Integer> h = new HashSet<Integer>();
		h.add(5);
		h.add(7);
		h.add(5);
		h.add(9);
		System.out.println(h); //notice 5 is only in the set 1 time (remember unique)
		boolean b1 = h.contains(9);
		System.out.println("does the set contain 9? " + b1);
		h.remove(9);
		System.out.println(h); //notice 5 is only in the set 1 time (remember unique)
		boolean b2 = h.contains(9);
		System.out.println("does the set contain 9? " + b2);
		System.out.println(h);
		int x = h.size();
		System.out.println("The size of the set: " + x);
		
		h.clear();
		System.out.println(h);
		System.out.println("The set has been cleared using s.clear();");
		
		//Tree Set (ordered data structure)
		Set<Integer> t = new TreeSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		System.out.println("The set is orderd using a TreeSet<>");
		System.out.println(t);
		
	//////   LISTS - like an array but slower to compute and it can change sizes (add/remove/etc)
		//    Array List     - position matters so an index can be used
		System.out.println("Array List");
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(8);
		a.add(1);
		a.add(6);
		a.add(2);
		System.out.println(a);
		a.set(2, 3);
		System.out.println(a);
		System.out.println(a.subList(1,3));  //subList goes up to but does not include y (x,y)
		// Linked List
		System.out.println("Linked List");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(18);
		l.add(11);
		l.add(66);
		l.add(22);
		System.out.println(a);
		l.set(2, 33);
		System.out.println(l);
		System.out.println(l.subList(1,3));  //subList goes up to but does not include y (x,y)
	}

}
