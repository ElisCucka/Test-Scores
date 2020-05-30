/*******************************************************************
 * New York Institute of Technology  
 * Elis Cucka                      
 * Goal: Find the lowest score of 5 random numbers
 ********************************************************************/
////////////////////////////////////////////////////////////////////
import java.util.Random;

public class Lowest_Score_5nums
{
	/*****************************************************************
	* main - generate 5 random numbers and display the lowest number
	* Inputs: args - String
	* Outputs: none - void
	*****************************************************************/
	public static void main(String[] args)
	{
        Random ran = new Random();
        
        int ran1 = ran.nextInt(51) + 50;
        int ran2 = ran.nextInt(51) + 50;
        int ran3 = ran.nextInt(51) + 50;
        int ran4 = ran.nextInt(51) + 50;
        int ran5 = ran.nextInt(51) + 50;
        
        int lowest = findLowest(ran1, ran2, ran3, ran4, ran5);
        
        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);
        System.out.println(ran4);
        System.out.println(ran5);
        System.out.println(lowest);
	}
	
	/*****************************************************************
	* findLowest() - finds the lowest number between 5 numbers
	* Inputs: r1, r2, r3, r4, r5 - 5 random numbers - integers
	* Outputs: lowest number - int
	*****************************************************************/
	public static int findLowest(int r1, int r2, int r3, int r4, int r5)
	{
		//Compare
		int lowest = r1; 
		lowest =  Compare(lowest , r2); 
		lowest =  Compare(lowest , r3); 
		lowest =  Compare(lowest , r4); 
		lowest =  Compare(lowest , r5); 
		return lowest; 
	}

	/*****************************************************************
	* Compare - compare 2 numbers and find the lowest
	* Inputs: num1, num2 - integers
	* Outputs: lowest number - integer
	*****************************************************************/
	private static int Compare(int num1, int num2) 
	{
	if(num1 <= num2)
		return num1; 
	else
		return num2; 
	}
}	