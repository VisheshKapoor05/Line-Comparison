package Line_Comparison;

public class computation_of_lines {
		
	public double Length;
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public computation_of_lines(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;		
		}
		
	double linelength() {
		double X = Math.pow((x2-x1),2);
		double Y = Math.pow((y2-y1),2);
		Length = Math.floor(Math.sqrt(X+Y));
		return Length;
		}
	
}
