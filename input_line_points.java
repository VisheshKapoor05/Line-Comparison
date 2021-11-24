package Line_Comparison;

import java.util.Scanner;

public class input_line_points {

	input_line_points() {
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
	}	
}
