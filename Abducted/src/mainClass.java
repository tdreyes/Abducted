import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import javax.sound.sampled.*;


public class mainClass {
	// for simplicities sake deeper in the ship will be north.
 public static boolean gamestarted = false;
 protected static int currentRoom = 1;
	public static LocalDateTime StartAlarms;
	public static LocalDateTime FiveRemaining;
	public static LocalDateTime OneRemaining;
	public static LocalDateTime Eject;
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		String path = System.getProperty("user.dir") + "/Abducted/AirLock Alarm.wav";
		System.out.println(path);
		File airlockalarm1 = new File(path);
		AudioInputStream Airlock1Stream = AudioSystem.getAudioInputStream(airlockalarm1);
		Clip clip = AudioSystem.getClip();
		try {
			clip.open(Airlock1Stream);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clip.start();
		//Bailey added the lettering
		/*try {
		System.out.println("     _        ______   ______     ___    ___    _____    _________    ________    ______       ");
		System.out.println("	/ \      |  __  \ |  __  \    | |    | |   /  __/   |         |   |  _____|	 |  __  \ 		");
		System.out.println("   / _ \     | |__|	| | |  \  \   | |    | |  |  |      |____  ___|   | |_____   | |  \  \     	");
		System.out.println("  / ___ \    |  __  | | |   |  |  | |    | |  |  |          |  |      |  _____|  | |   |  |     ");
		System.out.println(" / /   \ \   | |__/ / | |___| /   | \___ / |  |  \____      |  |      | |_____   | |___| /      ");
		System.out.println("/_/     \_\  |_____/  |______/     \______/    \_____/      |__|      |_______|  |______/       "); 
		catch{
			 just to get program to run
			 System.out.println("Title Card not working");
		}
		finally {*/
		//Teresa added the intro message
				System.out.println("Welcome to Abducted");
				System.out.println("Would you like to start the game?");
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
					Room2 secondR = new Room2();
					Room3 thirdR = new Room3();
					Room4 fourthR = new Room4();
					Items item = new Items();
					//prints back what the user inputed.
					System.out.println(uInput);
					if(uInput.toLowerCase().equals("yes") && gamestarted == false) {	
						StartAlarms = LocalDateTime.now();
						FiveRemaining = StartAlarms.plusMinutes(5);
						OneRemaining = StartAlarms.plusMinutes(9);
						Eject = StartAlarms.plusMinutes(9);
						gamestarted = startR.startGame();
					}
					if(uInput.toLowerCase().contains("look") && gamestarted == true) {
						if(currentRoom == 1)
						{
						startR.Look();		
						}
					}
					if(uInput.toLowerCase().contains("take") && gamestarted == true) {
						if(currentRoom == 1)
						startR.Take();	
						{
							if(uInput.toLowerCase().contains("large tooth")) {
								item.inventory.add("large tooth");
							}
							else if (uInput.toLowerCase().contains("lockpick")) {
								item.inventory.add("lockpick");
							}
							else if (uInput.toLowerCase().contains("blaster battery")) {
								item.inventory.add("blaster battery");
							}
							else if (uInput.toLowerCase().contains("blaster")) {
								item.inventory.add("blaster");
							}		
						
						}
					}
					if(uInput.toLowerCase().contains("second") && gamestarted == true) {
						if(currentRoom == 1)
						currentRoom += 1;			
					}
					
					//teresa
					if(uInput.toLowerCase().contains("enter") && gamestarted == true) {
						if(currentRoom == 2){
							secondR.EnterRoom();		
						}
					}
					if(uInput.toLowerCase().contains("look") && gamestarted == true) {
						if(currentRoom == 2){
							secondR.Look();					
						}
					}						
					if(uInput.toLowerCase().contains("yes") && gamestarted == true) {
						if(currentRoom == 2){
							secondR.closerCage1();	
							secondR.closerCage2();
							secondR.closerCage3();
						}
					}
					if(uInput.toLowerCase().contains("take") && gamestarted == true) {
						if(currentRoom == 2){
							secondR.Take();
							}
					}
					if(uInput.toLowerCase().contains("cage")){
								System.out.println("lYou cannot take the cage");
							
					}
					
					if(uInput.toLowerCase().contains("third") && gamestarted == true) {
						if(currentRoom == 2)
						currentRoom += 1;			
					}
					//teresa
					if(uInput.toLowerCase().contains("enter") && gamestarted == true) {
						if(currentRoom == 3){
							thirdR.EnterRoom();		
						}
					}
					if(uInput.toLowerCase().contains("look") && gamestarted == true) {
						if(currentRoom == 3){
							thirdR.Look();					
						}
					}	
					if(currentRoom == 3) {
						if(uInput.toLowerCase().contains("take") && gamestarted == true) {	
								thirdR.Take();
							}
						if(uInput.toLowerCase().contains("yellow")){
								thirdR.takeYellow();
								uAction.close();
								System.out.println("Game over! Thank you for playing");
								System.exit(0);
							}
						if(uInput.toLowerCase().contains("blue")){
								thirdR.takeBlue();
							}
							if(uInput.toLowerCase().contains("purple")){
								thirdR.takePurple();
							}
							if(uInput.toLowerCase().contains("carnivorous")){
								thirdR.takeCarnivorous();
								uAction.close();
								System.out.println("Game over! Thank you for playing");
								System.exit(0);
							}
						}
					//this is for testing. I forced user to type per room just to see if it works
					if(uInput.toLowerCase().contains("fourth") && gamestarted == true) {
						if(currentRoom == 3)
						currentRoom += 1;			
					}
					//teresa
					if(uInput.toLowerCase().contains("enter") && gamestarted == true) {
						if(currentRoom == 4){
							thirdR.EnterRoom();		
						}
					}
					if(uInput.toLowerCase().contains("look") && gamestarted == true) {
						if(currentRoom == 4){
							fourthR.Look();					
						}
					}						
					if(uInput.toLowerCase().contains("take") && gamestarted == true) {
						if(currentRoom == 4){
							fourthR.Take();
						}
					}
					/**
					 * TODO we need to find a way to make the items accessible
					 * maybe a enum? a list? what d you guys think? Coz I dont want us to manually type it all
					 */
				
					if (uInput.toLowerCase().equals("h")) {
						// Bailey added all the current possible actions
						System.out.println("Possible Actions Include:");
						System.out.println("GO");
						System.out.println("USE");
						System.out.println("LOOK");
						System.out.println("TAKE");
						System.out.println("SMASH");
						System.out.println("SHOOT");
						System.out.println("RELOAD");
						System.out.println("SAVE GAME"); // doesnt work yet
						System.out.println("LOAD GAME"); // doesnt work yet
						System.out.println("You May also Look in your inventory by typing either I or Inventory");
						System.out.println("You may also type E or Exit At any time to exit the game");
						System.out.println("Helpful Tip: North is always deeper into the ship");
					}
					// Bailey added a search inventory command
					//I tried to make the list item show but it gave me an error
					if (uInput.toLowerCase().equals("i") || uInput.toLowerCase().equals("inventory")  && gamestarted == true) {
						/**
						 * Old code to view or add items to inventory threw a null error
						 */
						
					}
					// Bailey added a search inventory command
					if (uInput.toLowerCase().equals("e") || uInput.toLowerCase().equals("exit")) {
						uAction.close();
						System.out.println("Thank you for playing!");
						System.exit(0);
					}
					
					uInput = uAction.next();
					uInput += uAction.nextLine();
				}
				if (uInput.toLowerCase().equals("e") || uInput.toLowerCase().equals("exit")) {
					uAction.close();
					System.out.println("Thank you for playing!");
					System.exit(0);
				}
	}
	private static void Spaced() {
		System.out.println("You were sent Flying into the vast emptieness of space where you were instantly mummified");
		System.out.println("GAME OVER");
		System.exit(0);
	}
	public enum Actions{
		GO,
		USE,
		LOOK,
		TAKE,
		SMASH,
		SHOOT,
		RELOAD,
		HIDE;
	}
}
