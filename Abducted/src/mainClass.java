import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		//Teresa added the intro message
		System.out.println("Welcome to Abducted");
		System.out.println("Please type enter to start");
		//Baileys Push
		
		/**
		 * this is to check user input
		 */
		Scanner uAction = new Scanner(System.in);
		
		String uInput = uAction.nextLine();
		
		while(uAction.hasNext()) {
			System.out.println(uAction.next());
		}
		
		uAction.close();
		
	}

}
