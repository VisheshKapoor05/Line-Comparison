public class Line_Comparison {
	public static void main(String[] args)
	{

	double x1 = 2;
	double y1 = 3;
	double x2 = 4;
	double y2 = 6;

	double X = Math.pow((x2-x1),2);
	double Y = Math.pow((y2-y1),2);

	double Length = Math.sqrt(X+Y);

	System.out.println("length of the line = " +Length);

  	}
}
