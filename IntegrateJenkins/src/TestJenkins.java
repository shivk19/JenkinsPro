
public class TestJenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(greetFriends("Shiv"));
		System.out.println(greetFriends("Vihaan"));
		System.out.println(greetFriends("Harshith"));
		System.out.println(greetFriends("KK"));
		System.out.println(greetFriends("Vijaya"));

	}

	private static String greetFriends(String friendName) {
		String greetingType;
		greetingType="Hello! "+friendName;
		return greetingType;
	}
	
	

}
