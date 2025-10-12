package coditionalStatements;

public class BankTransactions {

	public static void main(String[] args) {
		
	
		int Transactions [] = new int [8];
		Transactions[0]= 50000;
		Transactions[1]= 2000;
		Transactions[2]= 3000;
		Transactions[3]= -15000;
	    Transactions[4]= -200;
		Transactions[5]= -300;
	    Transactions[6]= 4000;
		Transactions[7]= -3000;
								
		
		int TotalcreditNumber = 0;
		int	TotaldebitNumber = 0;
		int TotalsuspiciousNumber = 0;
        int TotalCreditAmount = 0;
        int TotalDebitAmount = 0;
        
        for (int amount : Transactions) {
        	if(amount>0)
        	{ TotalcreditNumber++;
        	TotalCreditAmount += amount;
        	}
        
             if(amount<0)
    	    { TotaldebitNumber++;
    	      TotalDebitAmount += amount;
    	    }
        
             if(amount<10000)
    	    {  TotalsuspiciousNumber++;
    	    TotalCreditAmount += amount;
    	    }
             
             else {
            	 if (amount < -10000) {
                     System.out.println(" Suspicious Debit Transaction: " + amount);
                     TotalsuspiciousNumber++;
             }
	}

}

	int balance = TotalCreditAmount - TotalDebitAmount;

    
    System.out.println("AllTransactions");
    System.out.println("Total Credit Transactions: " + TotalcreditNumber);
    System.out.println("Total Debit Transactions: " + TotaldebitNumber);
    System.out.println("Total Amount Credited: " + TotalCreditAmount);
    System.out.println("Total Amount Debited: " + TotalDebitAmount);
    System.out.println("Total Ban Balance at end Balance: " + balance);
    System.out.println("Total Suspicious Transactions: " + TotalsuspiciousNumber);	
}
}
