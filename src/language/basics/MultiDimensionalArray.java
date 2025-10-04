package language.basics;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		String BECourse [] [] []= new String [5][2][6];
		//sem1>> subjects
		BECourse [0][0][0]= "Mathematics I";
		BECourse [0][0][1]= "Physics";
		BECourse [0][0][2]= "Chemistry";
		BECourse [0][0][3]= "Computer Programming";
		BECourse [0][0][4]= "Engineering Drawing";
		BECourse [0][0][5]= "Basic Electrical Eng";
				
		
		//sem1>> Marks 
		BECourse [0][1][0]= "Pass(78)";
		BECourse [0][1][1]= "Pass(85) ";
		BECourse [0][1][2]= "Fail(21)";
		BECourse [0][1][3]= "Pass(74)";
		BECourse [0][1][4]= "Pass(88)";
		BECourse [0][1][5]= "Pass(79)";
		
		//sem2>> subjects
		BECourse [1][0][0]= "Mathematics II";
		BECourse [1][0][1]= "Mechanics";
		BECourse [1][0][2]= "Environmental Sci.";
		BECourse [1][0][3]= "Basic Electronics";
		BECourse [1][0][4]= "Engineering Physics";
		BECourse [1][0][5]= "Engineering Graphics";
						
				
		//sem2>> Marks >> 
		BECourse [1][1][0]= "Pass(82)";
		BECourse [1][1][1]= "Pass(77)";
		BECourse [1][1][2]= "Pass(93)";
		BECourse [1][1][3]= "Fail(19)";
		BECourse [1][1][4]= "Fail(24)";
		BECourse [1][1][5]= "Pass(90)";
		
		//sem3>> subjects>> Data Structures Discrete Mathematics Digital Electronics Operating Systems Signals and Systems Object-Oriented Prog.
		BECourse [2][0][0]= "Data Structures";
		BECourse [2][0][1]= "Discrete Mathematics";
		BECourse [2][0][2]= "Digital Electronics";
		BECourse [2][0][3]= "Operating Systems";
		BECourse [2][0][4]= "Signals and Systems";
		BECourse [2][0][5]= "Object-Oriented Prog";
								
						
		//sem3>> Marks >> Pass(88) Pass(81) Pass(76) Fail(32) Pass(85) Pass(78)
		BECourse [2][1][0]= "Pass(88)";
		BECourse [2][1][1]= "Pass(81)";
		BECourse [2][1][2]= "Pass(76)";
		BECourse [2][1][3]= "Fail(32)";
		BECourse [2][1][4]= "Pass(85)";
		BECourse [2][1][5]= "Pass(78)";
		
		
		//sem4>> subjects>> Algorithms ComputerNetworks Database Systems Microprocessors Communication Eng. Software Engineering
		BECourse [3][0][0]= "Algorithms";
		BECourse [3][0][1]= "ComputerNetworks";
		BECourse [3][0][2]= "Database Systems";
		BECourse [3][0][3]= "Microprocessors";
		BECourse [3][0][4]= "Communication Eng.";
		BECourse [3][0][5]= "Software Engineering";
										
								
		//sem4>> Marks >> Pass(91) Pass(73) Fail(19) Pass(80) Pass(76) Pass(87)
		BECourse [3][1][0]= "Pass(91)";
		BECourse [3][1][1]= "Pass(73)";
		BECourse [3][1][2]= "Fail(19)";
		BECourse [3][1][3]= "Pass(80)";
		BECourse [3][1][4]= "Pass(76)";
		BECourse [3][1][5]= "Pass(87)";
		
		//sem5>> subjects>> Probability &Stats Machine Learning Compiler Design Theory of Computation Embedded Systems Computer Graphics
		BECourse [4][0][0]= "Probability &Stats";
		BECourse [4][0][1]= "Machine Learning";
		BECourse [4][0][2]= "Compiler Design";
		BECourse [4][0][3]= "Theory of Computation";
		BECourse [4][0][4]= "Embedded Systems";
		BECourse [4][0][5]= "Computer Graphics";
												
										
		//sem5>> Marks >> Pass(86) Pass(88) Pass(84) Pass(95) Pass(73) Pass(90)
		BECourse [4][1][0]= "Pass(86)";
		BECourse [4][1][1]= "Pass(88)";
		BECourse [4][1][2]= "pass(84)";
		BECourse [4][1][3]= "Pass(95)";
		BECourse [4][1][4]= "Pass(73)";
		BECourse [4][1][5]= "Pass(90)";
		
		System.out.println("Semester 2 >> Subject 4: "+BECourse [1][0][3]);
		System.out.println("Semester 2 >> Subject 5: "+BECourse [1][0][4]);
		System.out.println("Semester 4 >> Subject 3 >> Status/Marks : "+BECourse [3][1][2]);
		System.out.println("Semester 4 >> Subject 6 >> Status/Marks : "+BECourse [3][1][5]);
		


	}

}
