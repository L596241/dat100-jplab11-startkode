package no.hvl.dat100.jplab11.common;

public class TODO {

	public static String method() {
		
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "Metoden " + methodName + " er ikke implementert";
	}
	
	
	public static String constructor(String className) {
				
	   return "KonstruktÝren for klassen " + className + " er ikke implementert";
		
	}

}
