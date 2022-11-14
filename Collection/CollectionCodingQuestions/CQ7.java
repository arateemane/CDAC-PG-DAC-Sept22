/*Write a Java program to print all the elements of a ArrayList using the position of the
elements.*/

import java.util.*;
class CQ7{
	
	public static void main(String[] args){
		List<String> colors = new ArrayList<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		colors.add(0,"Black");
		for(int i = 0; i < colors.size(); i++){
			System.out.println("Element at position " +i+ " is : " +colors.get(i));
		}
	}
}