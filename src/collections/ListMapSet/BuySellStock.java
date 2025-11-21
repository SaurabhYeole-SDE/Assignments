package collections.ListMapSet;

public class BuySellStock {

	public static void main(String[] args)
	{
        int[] prices = {20000, 29000,25000, 23000, 35500, 18000};
        
        int maxProfit = 0;
        
        int buyDay =0;
        int sellday=0;
        
       for( int i=0; i<prices.length; i++)
       {
    	   for(int j=i+1; j<prices.length;j++)
    	   {
    		   int profit = prices[j]-prices[i];
    		   
    		   if (profit > maxProfit) 
    		   {
    			   maxProfit = profit;
    			   
    			   buyDay =i+1;
    		       sellday=j+1;
    			   
    		   }
    	   }
       }
        
       System.out.println("Maximum Profit: " + maxProfit);
       System.out.println("Buy on Day: " + buyDay);
       System.out.println("Sell on Day: " + sellday);
       
	}
	

}
