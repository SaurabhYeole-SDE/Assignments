package coditionalStatements;

public class AverageMarks {
	
	

	public static void main(String[] args) {
		
		String StudentNames []= {"Suresh","Mahesh","Naresh"};
		int Marks[]= {75, 80, 82};
		int updatedMark [] = new int [Marks.length];
	
		for(int i = 0; i<Marks.length; i++) 
		{
		
			updatedMark[i] = Marks[i] + 10;
		}
		
		System.out.println("Updated Marks: ");
		{
			for(int i=0; i<StudentNames.length;i++) 
			{
				System.out.println(StudentNames[i]+ ":"+updatedMark[i] );
			}
		}
		
		int TotalMarks=0;
		for(int Mark : updatedMark)
		{
			
			TotalMarks += Mark;
		}
		
		int Average= TotalMarks/Marks.length;
		
		System.out.println("Average="+Average);

	}

}
