package day1afternoon;

public class StringSandbox {

	public static void main(String[] args) {
		String s = "Tomorrow and tomorrow and tomorrow";
		String s2 = "Whether tis nobler in the mind";
		System.out.println(s.charAt(6));
		System.out.println(s.compareTo("today") > 0);//s > "today"
		System.out.println(s.compareToIgnoreCase("today"));
		System.out.println(s.equals("Tomorrow and" + " tomorrow and tomorrow"));

		System.out.println(s.indexOf("tomorrow", 0));
		System.out.println(s.substring(13, s.length()));
		System.out.println(("" + 45).charAt(1));
	}

}
