package Line_Comparison;

public class actions_on_lines {
	
	public /*static*/ double linelength_1;
	public double linelength_2;
	
	public actions_on_lines(double linelength_1, double linelength_2) {
		this.linelength_1 = linelength_1;
		this.linelength_2 = linelength_2;
	}

	public void compareTo_method() {
		if( linelength_1 > linelength_2 )
		 System.out.println("The line 1 is longer than line 2");
		else if( linelength_2 > linelength_1 )
	 	 System.out.println("The line 2 is longer than line 1");
	  	else
	 	 System.out.println("The 2 lines are equal in length");
		}
		
	public void equalsTo_method() {
		if( linelength_1 == linelength_2)
			 System.out.println("The 2 lines are equal in length");
		else
		 	 System.out.println("The 2 lines are  not equal in length");
		  }

}
