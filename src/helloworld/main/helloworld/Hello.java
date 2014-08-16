package helloworld;

public class Hello {
	public static String tell(String who){
		String message = "Hello Anonymous !!!";
		if (who!=null){
				message = "Hello "+who+" !!!";
		}
		return message;
	}
}
