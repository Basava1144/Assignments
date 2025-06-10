package Assignement9;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		
		String[] employees = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		
		Double[]empdata1= {75000.0, 5.0, 4.2};
		Double[]empdata2= {68000.0, 3.0, 3.8};
		Double[]empdata3= {82000.0, 7.0,  4.5};
		Double[]empdata4= {90000.0, 10.0, 2.0};
		Double[]empdata5=  {60000.0, 2.0, 3.5};
		

	Map<String,Double[]>empdata=new HashMap<>();
	
  
	empdata.put(employees[0], empdata1);
	empdata.put(employees[1], empdata2);
	empdata.put(employees[2], empdata3);
	empdata.put(employees[3], empdata4);
	empdata.put(employees[4], empdata5);

	
	  //getting the data 
	
	     
	
	
	
	
	
	 
		Map<String, Double> hikeMap = new HashMap<>();
	 for(String emp1 :employees) 
	   {
		   //System.out.println(emp1);
		 
		   //getting empoyloyee data 
		 
		 Double[] data=empdata.get(emp1);
		 
		 double baseSalary = data[0];
         double experience = data[1];
         double rating     = data[2];
		 
         double variablepay;
    	 double bonus;
    	 double reward=0;
    	 
		 if (rating >=4) 
		 
		 {
			 variablepay=15.0;
			 
			bonus=1500;
		 }
		 else if(rating >=3 )
		 {
			 variablepay=10.0;
			 bonus=1200;
		 }
		 else
		 {
			 
			 variablepay=3.0;
			 bonus=300;
			 
		 }
		 
		  if(experience >=5) 
		 {
			 reward=5000;
		 }
		  
		  
		  double hike = (baseSalary * variablepay / 100) + bonus + reward;
		     double hikePercentage = (hike / baseSalary) * 100;
		     hikeMap.put(emp1, hikePercentage);
        
	 }
		
	 System.out.println(hikeMap);
	

	}

}
