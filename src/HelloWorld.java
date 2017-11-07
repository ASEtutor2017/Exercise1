import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		String name;
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.println("Please enter your name   ");
		name=in.nextLine();
		HelloUser.greetUser(name);
		
	}
}

