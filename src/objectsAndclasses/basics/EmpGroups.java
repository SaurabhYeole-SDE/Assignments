package objectsAndclasses.basics;

public class EmpGroups {
	
	 public static void main(String[] args) {
		
	 Employee EmployeeObj = new Employee();
		
        String EmpName [] = new String[3];
		EmpName [0]= EmployeeObj.Emp1name;
		EmpName [1]= EmployeeObj.Emp2name;
		EmpName [2]= EmployeeObj.Emp3name;
		
		int EmpID [] = new int[3];
		EmpID [0]= EmployeeObj.Emp1id;
		EmpID [1]= EmployeeObj.Emp2id;
		EmpID [2]= EmployeeObj.Emp3id;
		
		System.out.println(EmpName[0] + " :  "  + EmpID[0]);
		System.out.println(EmpName[1] + "   :  "  + EmpID[1]);
		System.out.println(EmpName[2] + "   :  "  + EmpID[2]);
				
		

	}

}
