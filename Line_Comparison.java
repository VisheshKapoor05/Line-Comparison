package Line_Comparison;
import java.util.Scanner;

public class Line_Comparison {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
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

		computation_of_lines line1 = new computation_of_lines(x11, x12, y11, y12);
		computation_of_lines line2 = new computation_of_lines(x21, x22, y21, y22);
		double linelength_1 = line1.linelength();
		double linelength_2 = line2.linelength();
		System.out.println("length of the line 1 = " +linelength_1);
		System.out.println("length of the line 2 = " +linelength_2);
		
		actions_on_lines lines = new actions_on_lines(linelength_1, linelength_2);
		
		lines.compareTo_method();
		lines.equalsTo_method();
	}

}
