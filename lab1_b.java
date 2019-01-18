package ICP;
import java.math.*;
@SuppressWarnings("unused")
public class lab1_b {
	/**
	 * 
	 * @param radius
	 * @return circumference
	 */
	
	public static float circumVal (float radius) { 
		
		float circumference = (float) (Math.PI * Math.round((2*radius)));
		
		return circumference;
	}
	
	/**
	 * 
	 * @param radius
	 * @return area
	 */
	
	public static float areaVal (float radius) { 
		
		float area = (float)(Math.PI * Math.pow(radius, 2));
		
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(circumVal(5));
		
		System.out.println(areaVal(5));

	}

}
