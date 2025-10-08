package collections.ListMapSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentEmployeeProduct {

	public static void main(String[] args) {
		
		//student Detail
		
		Map<String,String> Student1 = new HashMap<String,String>();
		Student1.put("Name","John Doe");
		Student1.put("Age","Twenty");
		Student1.put("Gender","Male");
		Student1.put("Roll Number","SBA12345");
		Student1.put("Grade","A++");
		Student1.put("Major","Computer Science");
		Student1.put("GPA","A3.8");
		Student1.put("Email","john@example.com");
		Student1.put("PAN Number","SDF6543210");
		Student1.put("Address","123 Elm St");
		
		Map<String,String> Student2 = new HashMap<String,String>();
		Student2.put("Name","Jane Smith");
		Student2.put("Age","Twenty One");
		Student2.put("Gender","Female");
		Student2.put("Roll Number","SBA12346");
		Student2.put("Grade","B+");
		Student2.put("Major","Mathematics");
		Student2.put("GPA","A3.5");
		Student2.put("Email","jane@example.com");
		Student2.put("PAN Number","REW6543211");
		Student2.put("Address","456 Oak St");
		
		
		Map<String,String> Student3 = new HashMap<String,String>();
		Student3.put("Name","Mike Brown");
		Student3.put("Age","Twenty Two");
		Student3.put("Gender","Male");
		Student3.put("Roll Number","SBA12347");
		Student3.put("Grade","A+");
		Student3.put("Major","Physics");
		Student3.put("GPA","A3.9");
		Student3.put("Email","mike@example.com");
		Student3.put("PAN Number","TYR6543212");
		Student3.put("Address","789 Pine St");
		
		List<Map <String,String>> StudentDetails = new ArrayList<>();
		StudentDetails.add(Student1);
		StudentDetails.add(Student2);
		StudentDetails.add(Student3);
		
		//Employee Detail
		
		Map<String,String> Employee1 = new HashMap<String,String>();
		Employee1.put("Employee ID","E001");
		Employee1.put("Name","Alice Green");
		Employee1.put("Age","Thirty");
		Employee1.put("Gender","Female");
		Employee1.put("Department","Engineering");
		Employee1.put("Position","Software Engineer");
		Employee1.put("Salary","75K Pounds");
		Employee1.put("Email","alice@example.com");
		Employee1.put("PAN Number","SDF6543210");
		
		Map<String,String> Employee2 = new HashMap<String,String>();
		Employee2.put("Employee ID","E002");
		Employee2.put("Name","Bob Johnson");
		Employee2.put("Age","Thirty Five");
		Employee2.put("Gender","Male");
		Employee2.put("Department","Marketing");
		Employee2.put("Position","Marketing Manager");
		Employee2.put("Salary","85K Pounds");
		Employee2.put("Email","bob@example.com");
		Employee2.put("PAN Number","REW6543211");
		
		
		
		Map<String,String> Employee3 = new HashMap<String,String>();
		Employee3.put("Employee ID","E003");
		Employee3.put("Name","Carol White");
		Employee3.put("Age","Twenty Eight");
		Employee3.put("Gender","Female");
		Employee3.put("Department","Sales");
		Employee3.put("Position","Sales Executive");
		Employee3.put("Salary","65K Pounds");
		Employee3.put("Email","carol@example.com");
		Employee3.put("PAN Number","TYR6543212");
		
		
		List<Map <String,String>> EmployeeDetails = new ArrayList<>();
		EmployeeDetails.add(Employee1);
		EmployeeDetails.add(Employee2);
		EmployeeDetails.add(Employee3);
		
		//Product Detail
		
		Map<String,String> Product1 = new HashMap<String,String>();
		Product1.put("Product ID","P001");
		Product1.put("Name","Laptop");
		Product1.put("Category","Electronics");
		Product1.put("Price","12K Pounds");
		Product1.put("Stock Quantity","Not Available");
		Product1.put("Supplier","Tech Supplies");
		Product1.put("Warranty","2 years");
		Product1.put("Rating","4.5 Stars");
		Product1.put("Manufacturing Date","Aug 2023");
		Product1.put("Expiry Date","Aug 2028");
		
		
		Map<String,String> Product2 = new HashMap<String,String>();
		Product2.put("Product ID","P002");
		Product2.put("Name","Desk Chair");
		Product2.put("Category","Furniture");
		Product2.put("Price","150K Pounds");
		Product2.put("Stock Quantity","Two");
		Product2.put("Supplier","Office Depot");
		Product2.put("Warranty","1 year");
		Product2.put("Rating","4 Stars");
		Product2.put("Manufacturing Date","Sep 2024");
		Product2.put("Expiry Date","N/A");
		
		Map<String,String> Product3 = new HashMap<String,String>();
		Product3.put("Product ID","P003");
		Product3.put("Name","Coffee Maker");
		Product3.put("Category","Kitchen");
		Product3.put("Price","75 Pounds");
		Product3.put("Stock Quantity","Two Hundred");
		Product3.put("Supplier","KitchenWorld");
		Product3.put("Warranty","6 months");
		Product3.put("Rating","4.2 Stars");
		Product3.put("Manufacturing Date","Jan 2025");
		Product3.put("Expiry Date","Jan 2027");
		
		List<Map <String,String>> ProductDetails = new ArrayList<>();
		ProductDetails.add(Product1);
		ProductDetails.add(Product2);
		ProductDetails.add(Product3);
		
		Map<String, List<Map<String,String>>> AllDetails = new HashMap <String, List<Map<String,String>>>();
		AllDetails.put("StudentDetails", StudentDetails);
		AllDetails.put("EmployeeDetails", EmployeeDetails);
		AllDetails.put("ProductDetails", ProductDetails);
		
		System.out.println("All Reqired Data is :" + AllDetails.get("ProductDetails").get(1).get("Supplier"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
