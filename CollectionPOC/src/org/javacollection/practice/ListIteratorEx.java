package org.javacollection.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	
	public List<String> fillList(){
		List<String> colors = new ArrayList<String>();
		colors.add("Green");
		colors.add("Orange");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Pink");
		
		return colors;
	}
	
	public void useListIterator(){
		
		List<String> colorList = fillList();
		
		ListIterator<String> listItr = colorList.listIterator();
		System.out.println("Colors in forward direction");
		while(listItr.hasNext()){
			System.out.println(listItr.next());
		}
		
		System.out.println("Colors in backward direction");
		while(listItr.hasPrevious()){
			System.out.println(listItr.previous());
		}
	}

}
