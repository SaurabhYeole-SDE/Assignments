package coditionalStatements;

public class BankLoan {

	public static void main(String[] args) 
	{
		String customerName = "John Doe";
	    int creditScore = 720;
	    Double income = 55000.0;
	    Boolean isEmployed = true;
	    Double debtToIncomeRatio = 35.0;
	    System.out.println("Customer Detais:\nCustomerName: " +customerName + 
	    		"CreditScore: " +creditScore  + "\n" +
	    		"Income: " +income  + "\n" +
	    		"IsEmployed: " +isEmployed  + "\n" +
	    		"DTI: " +debtToIncomeRatio) ;
	    
	    {
		
	    if(creditScore>720)
	    {
		System.out.println("Loan is approved as Credit score is above 720");
		}
		
	          else if(creditScore >= 650 && creditScore <= 750)
	           {
			     System.out.println("creditscore is  "+creditScore + " so Additional Approval Required");
			     
			         if(income>=55000)
			             {
				            System.out.println("Income is "+income  + " so Customer is Eligible incomewise");
				              if(isEmployed) 
				               {
					                System.out.println("Cutomer is employed and eligible");
				
				                       if(debtToIncomeRatio<40.0)
				                         {
					                            System.out.println("DTI is " +debtToIncomeRatio +" so Customer is eligible DTI wise");}
					
				                       else 
				                                {
					                            System.out.println("Loan is dennied");   
				                                }
				                          }
				            else 
				              {
					               System.out.println("Loan is dennied");
				              }
				              
			             }
				
				else 
				   {
					System.out.println("Loan is dennied");
				   }
				}
		else 
			{
			System.out.println("Loan is dennied");
			}
		}
				   
	   
	    }
}
			
				
				  
				   
				   
				   
	    	 
				 
	
	

	


