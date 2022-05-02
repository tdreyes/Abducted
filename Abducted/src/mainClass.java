import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
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
					//instantiate for the first room
					Starting_Room startR = new Starting_Room();
					Items item = new Items();
					//put the user input on  println
					System.out.println(uInput);
					
					if(uInput.toLowerCase().equals("start")) {			
						startR.EnterRoom();			
					}
					if(uInput.toLowerCase().equals("look")) {
						startR.Look();				
					}
					if(uInput.toLowerCase().equals("take")) {
						startR.Take();	
					}
					/**
					 * TODO we need to find a way to make the items accessible
					 * maybe a enum? a list? what d you guys think? Coz I dont want us to manually type it all
					 */
					if(uInput.toLowerCase().equals("Large tooth")) {
						item.inventory.add(uInput);
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
					//I tried to make the list item show but it gave me an error
					if (uInput.toLowerCase().equals("i") || uInput.toLowerCase().equals("inventory")) {
						System.out.println(item.inventory);
						
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
}
