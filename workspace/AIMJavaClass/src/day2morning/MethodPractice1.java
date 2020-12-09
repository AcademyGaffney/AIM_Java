package day2morning;

public class MethodPractice1 {

	public static void main(String[] args) {
		double value = 16;
		double result = nSqrt(value);
		System.out.println(result);
		
		int [] arr = {4,7,2,3,9,8,3};
		int max = maxValue(arr);
		System.out.println(max);
	}
	
	public static double nSqrt(double val) {
		double result = -Math.sqrt(val);
		
		return result;
	}
	
	public static int maxValue(int [] vals) {
		int max = vals[0];
		
		for(int i = 1; i<vals.length; i++) {
			if(vals[i] > max) {
				max = vals[i];
			}
		}
		return max;
	}

}
