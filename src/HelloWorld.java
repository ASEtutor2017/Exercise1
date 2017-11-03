import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		HelloUser user;

		Scanner scan = new Scanner(System.in);

		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.print("Please enter your name: ");
		user = new HelloUser(scan.nextLine().trim());
		greetUser(user);
	}

	static void greetUser(HelloUser user) { System.out.println(String.format("Hello %s!", user.getUserName())); }
}
