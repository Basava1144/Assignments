package assignments;

public class Assignment2_Arrays1D_2D_3D {

	public static void main(String[] args) {
		
	    // Array 1 
		String[] semester= {"sem1","sem2","sem3","sem4","sem5"};
		
	
		// Array 2
		String[] subjects = {"Mathematics I","Physics","Chemistry","Computer Programming",
				             "Engineering Drawing","Basic Electrical Eng","Mathematics II","Mechanics", 
				             "EnvironmentalSci", "Basic Electronics ","Engineering Physics",
				             "Engineering Graphics","Data Structures", "DiscreteMathematics",
				             "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog",
				             "Algorithms", "ComputerNetworks","DatabaseSystems" ,"Microprocessors" ,"Communication Eng", "Software Engineering" ,
				             "Probability &Stats","MachineLearning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics" 
				            } ;
		
	     //Array 3
	    String[] marks  = { "Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)",
			                "Pass(82)"," Pass(77)","Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)",
			                "Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)",
			                "Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)",
			                "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"
			                };
	    
	    
	    // 2d array
	    String[][] exam= {semester,subjects};
	    
	  // Print Semester 2 Subject 4 and Subject 5 names.
	    System.out.println(exam[1][9]);
	    System.out.println(exam[1][10]);
	    
	    
	    
	    
	   // String[][][] college={exam,marks};
	    
	    
	    
	    
	    

	    
	
	    
	    
		
		
				
				

		
		
		
	}

}
