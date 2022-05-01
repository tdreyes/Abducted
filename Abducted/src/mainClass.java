import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;

public class mainClass {

	public static void main(String[] args) {
		boolean gamestarted = false;
		//Teresa added the intro message
				System.out.println("Welcome to Abducted");
				System.out.println("Please type enter to start");
				
				/**
				 * this is to check user input
				 */
				Scanner uAction = new Scanner(System.in);
				String uInput;
				uInput = uAction.next();
				uInput += uAction.nextLine();
				// Bailey Fixed input results
				while(!uInput.equals("e")) {
					System.out.println(uInput);
					if(uInput.toLowerCase().equals("enter") && gamestarted == false) {
						Room1Desc();
						gamestarted = true;
					}
					if (uInput.toLowerCase().equals("h")) {
						// Bailey added all the current possible actions
						System.out.println("Possible Actions Include:");
						System.out.println("USE");
						System.out.println("LOOK");
						System.out.println("TAKE");
						System.out.println("SMASH");
						System.out.println("SHOOT");
						System.out.println("RELOAD");
						System.out.println("HIDE");
						System.out.println("You May also Look in your inventory by typing either I or Inventory");
						System.out.println("You may also type E or Exit At any time to exit the game");
					}
					// Bailey added a search inventory command
					if (uInput.toLowerCase().equals("i") || uInput.toLowerCase().equals("inventory")) {
						System.out.println("nothing here yet");
						
					}
					// Bailey added a search inventory command
					if (uInput.toLowerCase().equals("e") || uInput.toLowerCase().equals("exit")) {
						uAction.close();
						System.exit(0);
					}
					uInput = uAction.next();
					uInput += uAction.nextLine();
				}
				if (uInput.toLowerCase().equals("e") || uInput.toLowerCase().equals("exit")) {
					uAction.close();
					System.exit(0);
				}
				
	}
	
	public static void Room1Desc() {
		System.out.println("You wake up in a dark poorly lit room. The room is small, maybe 6 feet by 8 feet, the room contains 4 walls,");
		System.out.println("two of which have windows, one window views the adjacent room, you turn around to look out the other window to be");
		System.out.println("greeted with the endless void of space. Panicked on how to escape this place you look around  the entire room.");
		System.out.println("You see corpses of extraterrestrial creatures, two of them are similar in appearance, the only way you can describe the");
		System.out.println("creatures in your head is that they look similar to a flying squirrel if they were twice as big, purple, slimy,");
		System.out.println("and had 3 mouths with sharp fangs. The other creature which you assume was the master of the other two creatures");
		System.out.println("It seems you got lucky as you’re the only living creature in this room. You stand up and observe the entire room, you’ve");
		System.out.println("seen enough sci-fi movies to recognize that you are in an airlock on a spaceship. you start to feel less lucky");
		System.out.println("as an alarm starts beeping, red lights start flashing in tune to the alarm.");
	}
}
