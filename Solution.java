//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

import java.util.*;

/*
 * Experiment with the Collections List.
 */
public class Solution {

	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) {

		// **** ****
		final int 	NUM_ELEMENTS 	= 5;
		final int	NUM_LISTS		= 3;
		
		// **** experiment with an array list ****
		ArrayList<Comparable> ali = new ArrayList<Comparable>();
		
		// **** populate the array list with strings ****
		for (int i = 1; i <= NUM_ELEMENTS; i++) {
			String temp = String.valueOf(i);
			System.out.println("main <<< i: " + i + " temp: " + temp);
			ali.add(temp);
		}
		System.out.println();

		// **** display the array list ****
		System.out.println("main <<< ali toString: " + ali.toString());
		
		// **** traverse the array list (method: 1) ****
		System.out.print("main <<< ali      get: [");
		for (int i = 0; i < ali.size(); i++) {
			if (i + 1 < ali.size())
				System.out.print(ali.get(i) + ", ");
			else
				System.out.print(ali.get(i));
		}
		System.out.println("]");
				
		// **** traverse the array list (method: 2) ****
		Iterator<Comparable> it = ali.iterator();
		System.out.print("main <<< ali iterator: [");
		while (it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext())
				System.out.print(", ");
		}
		System.out.println("]");
		
		// **** traverse the array list (method: 3) ****
		System.out.print("main <<< ali      for: [");
		int j = 0;
		for (Object o : ali) {
			if (j + 1 < ali.size())
				System.out.print(o + ", ");
			else
				System.out.print(o);
			j++;
		}
		System.out.println("]\n");
		
		// **** remove elements from the list ****
		while (ali.size() > 0) {
			System.out.println("main <<<      removed: " + ali.remove(0));
			System.out.println("main <<< ali toString: " + ali.toString());
		}
		System.out.println();

		
		// **** experiment with a linked list ****
		List<Integer> lli = new LinkedList<Integer>();
		
		// **** populate the linked list ****
		for (int i = 1; i <= NUM_ELEMENTS; i++)
			lli.add(i);
		
		// **** display the list ****
		System.out.println("main <<< lli toString: " + lli.toString());
		
		// **** traverse the linked list (method: 1) ****
		System.out.print("main <<< lli      get: [");
		for (int i = 0; i < lli.size(); i++) {
			if (i + 1 < lli.size())
				System.out.print(lli.get(i) + ", ");
			else
				System.out.print(lli.get(i));
		}
		System.out.println("]");
		
		// **** traverse the linked list (method: 2) ****
		Iterator<Integer> iter = lli.iterator();
		System.out.print("main <<< lli iterator: [");
		while (iter.hasNext()) {
			System.out.print(iter.next());
			if (iter.hasNext())
				System.out.print(", ");
		}
		System.out.println("]");	
				
		// **** traverse the linked list (method: 3) ****
		System.out.print("main <<< lli      for: [");
		int k = 0;
		for (Object o : lli) {
			if (k + 1 < lli.size())
				System.out.print(o + ", ");
			else
				System.out.print(o);
			k++;
		}
		System.out.println("]\n");
		
		// **** remove elements from the list ****
		while (!lli.isEmpty()) {
			System.out.println("main <<<      removed: " + lli.remove(lli.size() - 1));
			System.out.println("main <<< lli toString: " + lli.toString());
		}
		System.out.println();

		
		// **** list of lists with ArrayList ****
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		
		// **** loop building a list of lists ****
		for (int i = 0; i < NUM_LISTS; i++) {
			
			// **** ****
			ArrayList<Integer> aList = new ArrayList<Integer>();
			
			// **** populate the list ****
			for (int l = i; l < NUM_ELEMENTS + i; l++)
				aList.add(l);
			
			// **** display the list ****
			System.out.println("main <<<       aList: " + aList.toString());
			
			// **** add the list to the list of lists ****
			listOfLists.add(aList);
			
			// **** display the list of lists ****
			System.out.println("main <<< listOfLists: " + listOfLists.toString());
		}
	}

}
