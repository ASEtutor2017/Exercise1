import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("Please enter your name   ");
		String name=in.nextLine();
		HelloUser user= new HelloUser(name);
		user.greetUser();
		
	}
}

