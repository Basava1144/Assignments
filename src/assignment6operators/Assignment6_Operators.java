package assignment6operators;

public class Assignment6_Operators {

	public static void main(String[] args) {
		
		
		String[]studentnames= {"Suresh","Mahesh","Naresh"};
		int[]marks= {75,80,82};
		
		//Adding 10 marks to each student creating new variable  for storing the updated value
	/*	
	   int[] Newmarks= new int[3];
	   Newmarks[0]=marks[0]+10;
	  //System.out.println(updatedmarks[0]);
	  Newmarks[1]=marks[1]+10;
	  Newmarks[2]=marks[2]+10;
	  */
	  
	  //Using assignement Operators 
	  
	  marks[0]+= 10;
	  marks[1]+= 10;
	  marks[2]+= 10;
	  //Average marks 
	  
	  double average = (marks[0] + marks[1] + marks[2]) / 3.0;
	  
	  
	  
	  System.out.println("Updated Marks:" +"\n"+ studentnames[0]+":" +marks[0]+"\n"+studentnames[1]+":" +marks[1]+"\n"+studentnames[2]+":" +marks[2]);

	  System.out.println("Average Marks:"+average);
		

	}

}
