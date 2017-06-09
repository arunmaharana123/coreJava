package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Diffrence_ArrayList_LinkedList {

	
	/*
	Difference
	   
	   ArrayList							LinkedList
	
	1. backed by array,                   1.  doubly linkedList.
	   dynamic array. 
	
	2. Insertion and removal is           2.  Insertion and removal is faster than 
	   not fast.because resizing              arrayList.No need of resizing so time complexity
	   is required,if ArrayList grow          is O(1).
	   copying of content to another 
	   list takes time
	   for these operations time
	   Complexity is O(n).                             
	
	3. Less memory is required            3.  More memory required as it holds 
	   because each index holds               actual data as well as address of 
	   actual data.                           next and previous node.
	
	4. Required O(n) to search            4.  Also required O(n) time 	                                          
	   element,However binary search          to find element.    
	   can be applied if it is sorted.
	
	
	
	Note : ArrayList is based on index so any where if you want to perform operation then go for ArrayList.
	
	
	*/
	
	 public static void main(String[] args)
	    {
	        ArrayList<String> arrlistobj = new ArrayList<String>();
	        arrlistobj.add("Bhushan");
	        arrlistobj.add("Arun");
	        arrlistobj.add("Amol");
	        arrlistobj.remove(1);  // Remove value at index 2
	        System.out.println("ArrayList object output :" +  arrlistobj);
	 
	        // Checking if an element is present.
	        if (arrlistobj.contains("Amol"))
	            System.out.println("Found");
	        else
	            System.out.println("Not found");
	 
	 
	        LinkedList llobj = new LinkedList();
	        llobj.add("Bhushan");
	        llobj.add("Arun");
	        llobj.add("Amol");
	        llobj.remove("Arun");
	        System.out.println("LinkedList object output :" + llobj);
	 
	        // Checking if an element is present.
	        if (llobj.contains("Amol"))
	            System.out.println("Found");
	        else
	            System.out.println("Not found");
	    }
	
	
	
}
