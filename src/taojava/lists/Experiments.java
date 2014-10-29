package taojava.lists;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/**
 *  Experiments to support assertions made in
 *  answers to Exercise 1: Understanding  Iterators
 *  
 *  http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2014F/labs/current.html
 *  
 * @author Albert Owusu-Asare
 * @version 0.1 of October 2014
 *
 */
public class Experiments {
	
	/**
	 * Test if exceptions are thrown when the an iterator is made to remove
	 * an element from the collection when there is a previous <code>next()</code> has not
	 * been called.
	 */
	public static void removeWithoutNext()
	throws Exception{
		
		ArrayList<String> alphabets = new ArrayList<String>();
		alphabets.add("a");
		alphabets.add("b");
		alphabets.add("c");
		
		ListIterator<String> lstit = alphabets.listIterator();
		
		lstit.next();
		lstit.remove();
		
		try {
			
			lstit.remove();
			System.out.println("passed test");
		}//try
		catch(IllegalStateException e){
			System.out.println("failed test");
		}//catch(IllegalStateException)
		
	}//removeWithoutNext() 
	

	/**
	 * Test if exceptions are thrown when the an iterator is made to remove
	 * an element from the collection when there is a previous <code>next()</code> has not
	 * been called.
	 */
	public static void addAfterCreation()
	throws Exception{
		
		ListIterator<String> lstit = new SimpleListIterator<String>();
		
		try {
			
			lstit.add("a");
			System.out.println("passed addition test");
		}//try
		catch(NoSuchElementException e){
			System.out.println("failed:No such element");
		}//catch(IllegalStateException)
		
	}//addAfterCreation() 
	

	/**
	 * Checks if remove can be called right after creation of an Iterator
	 */
	public static void removeAfterCreation()
	throws Exception{
		
		ListIterator<String> lstit = new SimpleListIterator<String>();
		
		try {
			
			lstit.remove();
			System.out.println("passed remove  test");
		}//try
		catch(Exception e){
			System.out.println("failed to remove");
		}//catch(IllegalStateException)
		
	}//removeAfterCreation() 

	public static void main(String[] args) 
	throws Exception{
		Experiments.removeWithoutNext();
		Experiments.addAfterCreation();
		Experiments.removeAfterCreation();
	}//main()

}//Experiments
