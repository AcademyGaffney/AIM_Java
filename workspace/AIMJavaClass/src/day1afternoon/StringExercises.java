package day1afternoon;

public class StringExercises {

	public static void main(String[] args) {
		System.out.println(exercise1("hello there Mr. Andrews"));
		
		System.out.println(exercise3("hello there Mr. Andrews"));

	}
	
	public static String exercise1(String s) {
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		
		first = first.toUpperCase();
		rest = rest.toLowerCase();
		
		return first + rest;
	}
	
	public static String exercise3(String s) {
		int s1 = s.indexOf(" ");
		int s2 = s.indexOf(" ", s1 + 1);
		int s3 = s.indexOf(" ", s2 + 1);
		
		//return(s.substring(s2 +1, s3));
		
		String [] words = s.split(" ");
		return words[2];
	}

}
