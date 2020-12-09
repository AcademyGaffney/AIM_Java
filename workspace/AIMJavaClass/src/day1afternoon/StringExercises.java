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
	
	public static String exercise2(String s) {//"every good boy deserves favor"
		String s1 = s.substring(0,1).toUpperCase();//"E"
		int sp1 = s.indexOf(" ");//5
		String s2 = s.substring(1, sp1+1).toLowerCase();//(1, 6): "very "
		String s3 = s.substring(sp1+1, sp1+2).toUpperCase();
		int sp2 = s.indexOf(" ", sp1+1);
		String s4 = s.substring(sp1+2, sp2+1).toLowerCase();
		String s5 = s.substring(sp2+1, sp2+2).toUpperCase();
		String s6 = s.substring(sp2+2).toLowerCase();
		
		return s1+s2+s3+s4+s5+s6;
		
	}
	
	public static String exercise2a(String s) {//"every good boy deserves favor"
		int sp1 = s.indexOf(" ");//5
		int sp2 = s.indexOf(" ", sp1+1);
		int sp3 = s.indexOf(" ", sp2+1);
		String s4 = s.substring(0, sp3+1).toUpperCase();
		String s5 = s.substring(sp3+1);

		
		return s4+s5;
		
	}

}
