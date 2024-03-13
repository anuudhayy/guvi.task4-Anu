package com.guvi.task4;

import java.util.Stack;

//import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class StackDemo {

	public static void main(String[] args) {
		 Stack<String> stack = new Stack<String>(); 
		  
	        // Use push() method to add elements in the Stack 
	        stack.push("Anu");
	        stack.push("Arthy");
	        stack.push("Mithra"); 
	        stack.push("Mithu"); 
	        stack.push("20");
	        System.out.println("the pushed elements are:"+stack);
	        stack.pop();
	        stack.pop();
	        System.out.println("the poped elements are:"+stack);
	        stack.isEmpty();
	        System.out.println("checking stack is empty:"+stack);
	
/*
 * the pushed elements are:[Anu, Arthy, Mithra, Mithu, 20]
the poped elements are:[Anu, Arthy, Mithra]
checking stack is empty:[Anu, Arthy, Mithra]

 */
	        
	       



	}

}
