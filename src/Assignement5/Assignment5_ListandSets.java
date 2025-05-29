package Assignement5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import classesAndObjectsAssignment3.Assignment3Employees;

public class Assignment5_ListandSets{

    public static void main(String[] args) {
    	
    	
    	
    //Store all the values of students in a Map 
    	
    	Map<String,String>student1=new HashMap<String,String>();
    	
    	student1.put("Name", "John Doe");
    	student1.put("Age", "Twenty");
    	student1.put("Gender", "Male");
    	student1.put("Roll Number", "SBA12345");
    	student1.put("Grade", "A++");
    	student1.put("Major", "Computer Science");
    	student1.put("GPA", "A3.8");
    	student1.put("Email", "john@example.com");
    	student1.put("PAN Number", "SDF6543210");
    	student1.put("Address", "123 Elm St");
    	
   // Storing Student 2 data  	
Map<String,String>student2=new HashMap<String,String>();
    	
    	student2.put("Name", "Jane Smith");
    	student2.put("Age", "Twenty One");
    	student2.put("Gender", "Female");
    	student2.put("Roll Number", "SBA12346");
    	student2.put("Grade", "B+");
    	student2.put("Major", "Mathematics");
    	student2.put("GPA", "A3.5");
    	student2.put("Email", "jane@example.com");
    	student2.put("PAN Number", "REW6543211");
    	student2.put("Address", "456 Oak St");
    	
    	
    	
 Map<String,String>student3=new HashMap<String,String>();
    	
    	student3.put("Name", "MikeBrown");
    	student3.put("Age", "Twenty Two");
    	student3.put("Gender", "Male");
    	student3.put("Roll Number", "SBA12347");
    	student3.put("Grade", "A+");
    	student3.put("Major", "Physics");
    	student3.put("GPA", "A3.9");
    	student3.put("Email", "mike@example.com");
    	student3.put("PAN Number", "TYR6543212");
    	student3.put("Address", "789 Pine St");
    	
    	// putting  all the students students 1,students2 ,students3 in an array List in a single variable 
    	List<Map<String,String>>studentsList=new ArrayList<>();
    	studentsList.add(student1);
    	studentsList.add(student2);
    	studentsList.add(student3);
    	
    	//Creating  employee 1 emp1,emp2,emp3  data in a Map
    	
    	Map<String,String>emp1=new HashMap<String,String>();
        emp1.put("Employee ID", "E001");
		emp1.put("Name", "Alice Green");
    	emp1.put("Age", "Thirty");
    	emp1.put("Gender", "Female");
    	emp1.put("Department", "Engineering");
    	emp1.put("Position", "Software Engineer");
    	emp1.put("Salary", "75K Pounds");
    	emp1.put("Email", "alice@example.com");
     	emp1.put("PAN Number", "SDF6543210");
    	
    	
     	Map<String,String>emp2=new HashMap<String,String>();
     	 emp2.put("Employee ID", "E002");
 		 emp2.put("Name", "Bob Johnson");
     	 emp2.put("Age", "Thirty Five");
     	 emp2.put("Gender", "male");
     	 emp2.put("Department", "Marketing");
     	 emp2.put("Position", "Marketing Manager");
     	 emp2.put("Salary", "85K Pounds");
     	 emp2.put("Email", "bob@example.com");
      	 emp2.put("PAN Number", "REW6543211");
    	
    	
      	Map<String,String>emp3=new HashMap<String,String>();	
      	emp3.put("Employee ID", "E003");
		emp3.put("Name", "Carol White");
    	emp3.put("Age", "Twenty Eight");
    	emp3.put("Gender", "Female");
    	emp3.put("Department", "Sales");
    	emp3.put("Position", "Sales Executive");
    	emp3.put("Salary", "65K Pounds");
    	emp3.put("Email", "carol@example.com");
     	emp3.put("PAN Number", "TYR6543212");
     	
     	
     	List<Map<String,String>>emplist=new ArrayList<>();
     	emplist.add(emp1);
     	emplist.add(emp2);
     	emplist.add(emp3);
     	
     	
     	
     	//Creating  employee 1 emp1,emp2,emp3  data in a Map
     	Map<String, String> product1 = new HashMap<>();
		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12K Pounds");
		product1.put("Stock Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 years");
		product1.put("Rating", "4.5 Stars");
		product1.put("Manufacturing Date", "Aug 2023");
		product1.put("Expiry Date", "Aug 2028");

		Map<String, String> product2 = new HashMap<>();
		product2.put("ProductID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150K Pounds");
		product2.put("Stock Quantity", "Two");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 year");
		product2.put("Rating", "4 Stars");
		product2.put("Manufacturing Date", "Sep 2024");
		product2.put("Expiry Date", "N/A");

		Map<String, String> product3 = new HashMap<>();
		product3.put("ProductID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75 Pounds");
		product3.put("Stock Quantity", "Two Hundred");
		product3.put("Supplier", "KitchenWorld");
		product3.put("Warranty", "6 months");
		product3.put("Rating", "4.2 Stars");
		product3.put("Manufacturing Date", "Jan 2025");
		product3.put("Expiry Date", "Jan 2027");

		// storing all the products Lists in a variable 
		List<Map<String,String>> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);

    	//  We got a List of Students,employee,Product  and storing it in a single variable and accessing it
		// The purpose of Map is the <Key,value> key  refers--Students from where we can get the data
		
    	Map<String,List<Map<String,String>>> data =new HashMap<>();
    	data.put("Students", studentsList);
		data.put("Employees", emplist);
		data.put("Products", productList);
		
		 
		//System.out.println(data.get("Students"));

		// we need to print supplier details 
		
		System.out.println(data.get("Products").get(1).get("Supplier"));
    	
    }
	
    	
        
 
    }

