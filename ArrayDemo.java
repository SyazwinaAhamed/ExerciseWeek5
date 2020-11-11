public class ArrayDemo
{
	public static void main(String[]args)
	{
	//declare & create an array of integers
	int[] anArray = new int[10]; //default value 0

	//assign a value to each element and print
	for(int i=0; i <= 9; i++)
	{
	anArray[i] = i;
	System.out.println(anArray[i] + " ");

	}
	System.out.println();
	}
}