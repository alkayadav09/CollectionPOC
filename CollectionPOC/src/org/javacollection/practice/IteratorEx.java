package org.javacollection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	
	public List<String> fillList(){
		List<String> colors = new ArrayList<String>();
		colors.add("Green");
		colors.add("Orange");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Pink");
		
		return colors;
	}
	
	public void useIterator(){
		
		List<String> colors = fillList();
		Iterator<String> itr = colors.iterator();
		
/*		By  using Enhanced For loop
 
 		for(String color : colors){
			System.out.println(color);
		}
*/		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	public void removeElement(){
		List<String> colors = fillList();
		String removeElement = "Red";
		System.out.println("Before Remove :");
		System.out.println(colors);
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()){
			//if(removeElement.equals(itr.next())){     ------ is same as the below line 
			if(itr.next().equals(removeElement)){
				itr.remove();
			}	
		}
		System.out.println("After Remove : ");
			System.out.println(colors);
		
	}
}
