package day2morning;

public class MainExample {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++ ) {
			if(args[0].equals("--version")) {
				System.out.println("MainExample: Version 0.0.1a");
			}
			else {
				System.out.println(args[i]);
			}
		
		}

	}

}
