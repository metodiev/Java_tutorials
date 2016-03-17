package data_structures;

import java.util.*;

public class Stack_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("1. Gosho");
		stack.push("2. Pesho");
		 while (stack.size() > 0) {
		        String personName = stack.pop();
		        System.out.println(personName);
		    }

	}

}
