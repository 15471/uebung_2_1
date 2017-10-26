package uebung_2_1;

public class uebung_2_1 {
	public static void main(String[] args) {
		
	
	double p = 10;
	double q = 2;
	
	double unterderwurzel = (((p/2)*(p/2))-q);
	double vorderwurzel = (-1 * (p/2));
	
	double x1 = vorderwurzel - Math.sqrt(unterderwurzel);
	double x2 = vorderwurzel + Math.sqrt(unterderwurzel);
	
	System.out.println("x1 =" + x1);
	System.out.println("x2 =" + x2);

	}
}
