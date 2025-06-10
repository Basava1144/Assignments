package Assignement8Conditionalstatement;

public class Assignement8 {

	public static void main(String[] args) {
		
		int[]trans= {50000,-2000,3000,-15000,-200,-300,4000,-3000};
		
		int totalcredit=0;
		int totaldebit=0;
		int totalcreditedamount=0;
		int totaldebitedamount=0;
		int suspiciousamount=0;
		int suspiciouscreditcounter=0;
	    int suspiciousdebitcounter=0;	
		
		
		 for (int amt: trans) {
			 
			 if (amt>0)
			 {
				// Total credits 
				 totalcredit ++;
				 
				//sum of credited amount
				totalcreditedamount=totalcreditedamount +amt;
				if (amt >10000)
				{
					suspiciouscreditcounter++;
					System.out.println("Suspicouius credit :"+suspiciouscreditcounter+"and amount is :"+ amt);
					 
				}
				
			 }
			 
			 else {
				 
				 totaldebit++;
				 
				 totaldebitedamount =totaldebitedamount-amt;
				 
				
			 }
			 
			if (amt<-10000)
			{
				suspiciousdebitcounter++;
				System.out.println("Suspicouius debit :"+suspiciousdebitcounter+"and amount is :"+ amt);
				 
			}
			
			
		 }

		 int  balance= totalcreditedamount-totaldebitedamount;
		 System.out.println("Remaining Balance ="+ balance);
		 //System.out.println("Suspicouius credit"+);
		 System.out.println("total debited amount"+totaldebitedamount);
		 System.out.println("Count of debited amount:"+totaldebit);
		 System.out.println("Totalcredited amount:"+totalcreditedamount);
		 System.out.println("Count of credited amount:"+totalcredit);
		 
		 
	}

}
