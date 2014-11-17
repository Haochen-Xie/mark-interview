package name.haochenxie.tryout.mark_interview_question;

public class Question2 {
	
	public static String rbg2html(int red, int green, int blue) {
		return "#" + int2hex(red) + int2hex(green) + int2hex(blue);
	}
	
	public static String int2hex(int num) {
		String str = Integer.toHexString(num);
		return str.length() == 2 ? str : "0" + str;
	}
	
}
