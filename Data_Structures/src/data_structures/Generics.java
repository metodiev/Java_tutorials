package data_structures;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		  ArrayList<Integer> primes = getPrimes(20, 30);
		    for (int p : primes) {
		        System.out.printf("%d ", p);
		    }
		    System.out.println();
		    
		    
		    //obedinenie i sechenie 
		    ArrayList<Integer> firstList = new ArrayList<Integer>();
		    firstList.add(1);
		    firstList.add(2);
		    firstList.add(3);
		    firstList.add(4);
		    firstList.add(5);
		    System.out.print("firstList = ");
		    printList(firstList);
		 
		    ArrayList<Integer> secondList = new ArrayList<Integer>();
		    secondList.add(2);
		    secondList.add(4);
		    secondList.add(6);
		    System.out.print("secondList = ");
		    printList(secondList);
		 
		    ArrayList<Integer> unionList = union(firstList, secondList);
		    System.out.print("union = ");
		    printList(unionList);
		 
		    ArrayList<Integer> intersectList =
		        intersect(firstList, secondList);
		    System.out.print("intersect = ");
		    printList(intersectList);

		    //Arraylist i masiv nqmat direktna syvmestimost v Java
		    
	}
	
	
	
	public static ArrayList<Integer> getPrimes(int start, int end) {
	    ArrayList<Integer> primesList = new ArrayList<Integer>();
	    for (int num = start; num <= end; num++) {
	        boolean prime = true;
	        for (int div = 2; div <= Math.sqrt(num); div++) {
	            if (num % div == 0) {
	                prime = false;
	                break;
	            }
	        }
	        if (prime)
	            primesList.add(num);
	    }
	    return primesList;
	}
	
	
	//obedinenie i sechenie 
	public static ArrayList<Integer> union(ArrayList<Integer>
    firstList, ArrayList<Integer> secondList) {
			ArrayList<Integer> union = new ArrayList<Integer>();
	    union. addAll(firstList);
	   
	for (Integer item : secondList) {
	    if (!union.contains(item)) {
	        union.add(item);
	    }
	}
	return union;
	}
	
	public static ArrayList<Integer> intersect(ArrayList<Integer>
	    firstList, ArrayList<Integer> secondList) {
	ArrayList<Integer> intersect = new ArrayList<Integer>();
	for (Integer item : firstList) {
	    if (!secondList.contains(item)) {
        intersect.add(item);
    }
	}
	return intersect;
	}
	
	public static void printList(ArrayList<Integer> list) {
	System.out.print("{ ");
	for (Integer item : list) {
	    System.out.print(item);
	    System.out.print(" ");
	}
	System.out.println("}");
	}

}



