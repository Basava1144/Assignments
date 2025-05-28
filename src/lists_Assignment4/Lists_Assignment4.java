package lists_Assignment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists_Assignment4 {

	public static void main(String[] args) {
	
		//1. Create Lists with area of top 5 largest cities. 
		//Print the total area of the 3rd and 4th  cities combined. 
		
		List <String>cityname =new ArrayList<String>();
		
		cityname.add("Bengaluru");
		cityname.add("Hubli");
		cityname.add("Chennai");
		cityname.add("Madurai");
		cityname.add("Belgavi");
		cityname.add("Mysore");

		List <Integer>area =new ArrayList<>();
		area.add(10000);
		area.add(20000);
		area.add(30000);
		area.add(40000);
		area.add(50000);
		area.add(60000);
		
		//
		int totalarea=area.get(3)+area.get(4)	;
		
		System.out.println("Total Area of 3rd and 4th cities combined:"+ totalarea);
		 
		
		/*2. Create a set of the top 10 most visited tourist attractions in the world
	       and print out all  of them and its size */
		
		  List <String>Touristattraction =new ArrayList<String>();
		  Touristattraction.add("Lakshadweep");
		  Touristattraction.add("Bali");
		  Touristattraction.add("Barcelona");
		  Touristattraction.add("mykonos");
		  Touristattraction.add("Goa");
		  Touristattraction.add("Manali");
		  Touristattraction.add("Alleppey");
		  Touristattraction.add("karabi");
		  Touristattraction.add("Shimla");
		  Touristattraction.add("Mathura");
		
		  System.out.println("top 10 most visited tourist attractions in the world and print out all  of them and its size:"+ Touristattraction +" & size is:"+Touristattraction.size() );
		  
	/*3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and  6th Value. */
		 
		  int[]  numbers= {1,2,3,5,6,7,8,9,10};
		  
		   double average=(numbers[5]+numbers[6])/2.0;
		   
		   System.out.println("Average of 5th and  6th Value is :"+average);
		   
	/* 4.Create a list of the top 5 highest-grossing movies of all time and print out the third  movie on the list.*/
		   
		   List <String>grossingmovies= new LinkedList<String>();
		   grossingmovies.add("Kantara");
		   grossingmovies.add("KGF");
		   grossingmovies.add("Chhaavva");
		   grossingmovies.add("Pushpa-2");
		   grossingmovies.add("Bahubali-2");
		   
		   System.out.println("Top 5 highest-grossing movies of all time :"+grossingmovies+ "third  movie on the list:"+grossingmovies.get(3));
		   
		   
		  
		
		
	
	}
}




 