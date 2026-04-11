import java.util.Scanner;
public class Authentication {
	public static void main(String args[]) {
		String username = "MBITS";
		String password = "MBITS";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String u1 = sc.nextLine();
		System.out.println("Enter the password:");
		String u2 = sc.nextLine();
		
		try {
			if((u1.equals(username)) && (u2.equals(password))) {
				System.out.println("Access Granted");
			}
			
			else {
				throw new credential_exception("Invalid Credentials");
			}
		}
		
		catch(credential_exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}