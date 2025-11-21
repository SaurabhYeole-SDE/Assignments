package collections.ListMapSet;

public class SortArrayNumber {
	
	public static void main(String args[]) {

	int[] numbers = { 12, 34, 11, 36, 87, 98, 93 };

	int first = Integer.MIN_VALUE;
	int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    {

	for(int num:numbers)
	{
		if (num > first) {
			// shift values down
			third = second;
			second = first;
			first = num;
		} else if (num > second && num < first) {
			third = second;
			second = num;
		} else if (num > third && num < second) {
			third = num;
		}
	}

	System.out.println("Second largest number: "+second);
	
	System.out.println("Third largest number: "+third);
}
}
}
