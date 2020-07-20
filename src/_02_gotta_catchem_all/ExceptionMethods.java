package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double x, double y){
		if(y==0.0) {
			throw new IllegalArgumentException();
		}
		else {
			return x/y;
		}
	}
	
	public static String reverseString(String s) {
		if(s=="") {
			throw new IllegalStateException();
		}
		String s1 = "";
		for (int i = s.length()-1; i > -1; i--) {
			s1 = s1+s.charAt(i);
		}
		return s1;
	}
}
