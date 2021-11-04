import java.util.Scanner;

public class Line_Comparison {
	public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in);

	//First Line
	System.out.print("First Coordinate of Line 1, X1: ");
	double x11 = sc.nextDouble();
	System.out.print("First Coordinate of Line 1, y1: ");
	double y11 = sc.nextDouble();
	System.out.print("Second Coordinate of Line 1, X2: ");
	double x12 = sc.nextDouble();
	System.out.print("Second Coordinate of Line 1, y2: ");
	double y12 = sc.nextDouble();

	//Second Line
	System.out.print("First Coordinate of Line 2, X1: ");
	double x21 = sc.nextDouble();
	System.out.print("First Coordinate of Line 2, y1: ");
	double y21 = sc.nextDouble();
	System.out.print("Second Coordinate of Line 2, X2: ");
	double x22 = sc.nextDouble();
	System.out.print("Second Coordinate of Line 2, y2: ");
	double y22 = sc.nextDouble();

	double line1 = linelength(x11, x12, y11, y12);
	double line2 = linelength(x21, x22, y21, y22);
	System.out.println("length of the line 1 = " +line1);
	System.out.println("length of the line 2 = " +line2);

	/* Its showing error: double cannot be dereferenced
	if( line1.equals(line2) )
	 System.out.println("The 2 lines are equal in length");
	else
 	 System.out.println("The 2 lines are  not equal in length");
	
	int comparison = (line1.compareTo(line2));
	System.out.print(comparison);
	*/


	if( line1>line2 )
	 System.out.println("The line 1 is longer than line 2");
	else if( line2>line1 )
 	 System.out.println("The line 2 is longer than line 1");
  	else
 	 System.out.println("The 2 lines are equal in length");

	}

	static double linelength(double x1, double x2, double y1, double y2)
	{
	double X = Math.pow((x2-x1),2);
	double Y = Math.pow((y2-y1),2);
	double Length = Math.floor(Math.sqrt(X+Y));
	return Length;
	}

}
