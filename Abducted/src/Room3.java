/**
 * 
 * @author teresa
 *
 */
public class Room3 implements Room{

	public final int RoomNumber = 3;
	public final String RoomName = "Room3";
	

	@Override
	public void EnterRoom() {
		System.out.println("You see something big and green with big jaws snatch it and swallow it whole.");
		System.out.println("You peek your head around the corner to see a huge carnivorous monster chewing on the monster.");
		System.out.println("You realize the plant is preoccupied with chewing on the alien. ");
		System.out.println("You are safe for the time being… until it’s done chewing. You are in a lush biolab filled with alien flora. \n");	
	}
	

	@Override
	public void Look() {
		System.out.println("There are four different plants in the room. ");
		System.out.println("One yellow plant, a purple plant, a blue plant and the carnivorous plant.");
		System.out.println("A door lies ahead of you locked.");
	}
	
	public void takeYellow() {
		System.out.println("This plant is venomous");
	}
	
	public void takeBlue() {
		System.out.println("This plant oozes liquid nitrogen.");
	}
	
	public void takePurple() {
		System.out.println("Smelling this plant will make you hallucinate.");
	}
	
	public void takeCarnivorous() {
		System.out.println("You got chewed!!");
	}
	@Override
	public void Take() {
		System.out.println("Please list the item youd like to take after the take command");
		System.out.println("1: Yellow Plant");
		System.out.println("2: Blue Plant");
		System.out.println("3: Purple Plant");
		System.out.println("1: Carnivorous Plant");
	}

}
