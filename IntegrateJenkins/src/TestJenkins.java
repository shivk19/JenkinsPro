
public class TestJenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(greetFriends("Shiv"));
		System.out.println(greetFriends("Vihaan"));
		System.out.println(greetFriends("Harshith"));

	}

	private static String greetFriends(String friendName) {
		String greetingType;
		greetingType="Hello! "+friendName;
		return greetingType;
	}
	
	

}
