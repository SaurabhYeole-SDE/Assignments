package collections.ListMapSet;

import java.util.HashMap;
import java.util.Map;

public class salaryHikecalculate {

	public static void main(String[] args) {
		String[] Name = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };
		double[] Salary = { 75000.0, 68000.0, 82000.0, 90000.0, 60000.0 };
		double[] Experience = { 5.1, 3.2, 7.1, 10.2, 2.4 };
		double[] Rating = { 4.2, 3.8, 4.5, 2.5, 3.5 };
		
		

		Map<String, Double> SalaryHike = new HashMap<String, Double>();
		for (int i = 0; i < Name.length; i++) {
			
			double VariablePercent;
			double Bonus;
			double Reward;
			
			if (Rating[i] > 4.0) {
				VariablePercent = 15;
				Bonus = 1500;
			} else if (Rating[i] > 3.0 && Rating[i] < 4) {
				 VariablePercent = 10;
				 Bonus = 1200;
			}

			else {
				 VariablePercent = 3;
				 Bonus = 300;
			}
			
			if(Experience[i]>5) {
				 Reward=5000;
			}
			else {
				 Reward=0;
			}
			
			//Hike = ( Base Salary * variable pay % ) + Bonus + Reward ;
			double Hike=(Salary[i] * VariablePercent/100) + Bonus + Reward ;
			double HikePercentage= (Hike/Salary[i]*100);
			
			SalaryHike.put(Name[i],HikePercentage);
			System.out.println("Name =  "+Name[i] +" Hike% =  "+ String.format("%.2f",HikePercentage));
		}

	}

}
