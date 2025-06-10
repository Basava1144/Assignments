package assignment6operators;

public class Assignement7_Conditionalstatement {
	
	//Credit score:if elseif(>750,650>750,650)
			//income :50000(650 >750)
			//emplyemt status:yes or no
			//dti income 
	
	

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if (creditScore>750)
		{
			System.out.println(customerName+"the loan is automatically approved.");
			
		}
		else if(creditScore >= 650 && creditScore <= 750) 
		{
			if (income>=50000) {
				
				if (isEmployed)
				{
					if (debtToIncomeRatio<=40) 
					{
						System.out.println(customerName +"the loan is approved.");
					}
					else  
					{
						
						System.out.println(customerName +"the loan is denied.");
					}
				}
				
						
					
				else
				{  
					System.out.println(customerName + "is unemployed");
				}
				}
			else 
			{
				System.out.println(customerName+"The income is below $500000.");
				
			}
				
				
			}
			
			else
		 {
			System.out.println(customerName +"The Loan cannot  be consideredas score is less then 650");
			
			
		}
			
	}}
	
		
		
