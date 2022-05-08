/*
 * @author teresa
 */
public class Room2 implements Room {
	public final int RoomNumber = 2;
	public final String RoomName = "Room2";
	

	@Override
	public void EnterRoom() {
		System.out.println("You unlock the door and exit the airlock,");
		System.out.println("the door seals behind you hissing with a high pressure sealing system.");
		System.out.println("You look around and find yourself in a cargo hold, inside are crates, ");
		System.out.println("boxes and three cages that contain alien monsters. At the end of the room lies a locked door.\n");	
	}
	
	@Override
	public void Look() {
		System.out.println("You see: Large cage");
		System.out.println("Medium cage");
		System.out.println("Small cage");
		System.out.println("Take a closer look?");
	}
	
	public void closerCage1() {
		System.out.println("Cage 1: Contains a large alien monster with 4 legs and 4 arms covered with spikes. \n ");
	}
	
	public void closerCage2() {
		System.out.println("Cage 2: An arachnoid looking alien drooling with acidic fangs. ");
		System.out.println("metal floor sizzles as the acid hits the floor. It eyes you up with curiosity. \n");
	}
	
	public void closerCage3() {
		System.out.println("Cage 3:A fuzzy cute lemur-like creature looks at you with its big eyes while tilting its head to the side. \n");
	}
	
	@Override
	public void Take() {
		System.out.println("Please list the item youd like to take after the take command");
	}
	
	public void exitRoom() {
		System.out.println("The arachnoid creature melts the lock on the door and runs into the next room. ");
	}

	
}
