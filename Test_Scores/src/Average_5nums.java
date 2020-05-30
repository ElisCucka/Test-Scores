/*******************************************************************
 * New York Institute of Technology  
 * Elis Cucka                      
 * Goal: Calculating the average of 5 numbers
 ********************************************************************/
////////////////////////////////////////////////////////////////////
import java.util.Random;

public class Average_5nums 
{
	/****************************************************************************
	* main - generate 5 random numbers and display their average and letter grade
	* Inputs: args - String
	* Outputs: none - void
	****************************************************************************/
	public static void main(String[] args)
	{
		Random ran = new Random();

		int ran1 = ran.nextInt(51) + 50;
		int ran2 = ran.nextInt(51) + 50;
		int ran3 = ran.nextInt(51) + 50;
		int ran4 = ran.nextInt(51) + 50;
		int ran5 = ran.nextInt(51) + 50;

		double average = calcAverage(ran1, ran2, ran3, ran4, ran5);

		String letterGrade = determineGrade(ran1);
		String letterGrade1 = determineGrade(ran2);
		String letterGrade2 = determineGrade(ran3);
		String letterGrade3 = determineGrade(ran4);
		String letterGrade4 = determineGrade(ran5);
		String letterGrade5 = determineGrade(average);

		System.out.println("Score     Letter Grade");
		System.out.println(ran1 + "        " + letterGrade);
		System.out.println(ran2 + "        " + letterGrade1);
		System.out.println(ran3 + "        " + letterGrade2);
		System.out.println(ran4 + "        " + letterGrade3);
		System.out.println(ran5 + "        " + letterGrade4);
		System.out.println(average  + "      " + letterGrade5);
	}
	
	/*****************************************************************
	* calcAverage - find the average of 5 numbers
	* Inputs: r1, r2, r3, r4, r5 - 5 random integers
	* Outputs: average - double
	*****************************************************************/
	public static double calcAverage(int r1, int r2, int r3, int r4, int r5)
	{
		double average = (double) (r1 + r2 + r3 + r4 + r5) / (5);
		return average; 
	}
	
	/*****************************************************************
	* determineGrade - determine the letter grade for a score
	* Inputs: testScore1 - double
	* Outputs: letter grade - String
	*****************************************************************/
	public static String determineGrade(double testScore1)
	{
		if(testScore1 >= 90)
			return "A";
		else if(testScore1 >= 80)
			return "B"; 
		else if(testScore1 >= 70)
			return "C"; 
		else if(testScore1 >= 60)
			return "D"; 
		else 
			return "F"; 
	}
}
