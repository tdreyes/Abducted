import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author Bailb
 *
 */
public class Starting_Room implements Room {
	public final int RoomNumber = 1;
	public final String RoomName = "Airlock";
	
	@Override public void EnterRoom() {
		System.out.println("You are standing in a dark poorly lit room. The room is small, maybe 6 feet by 8 feet,");
		System.out.println("the room contains 4 walls, two of which have windows, one window views the adjacent room,");
		System.out.println("you turn around to look out the other window to be greeted with the endless void of space.");
	}
	
	public void Look() {
		System.out.println("You see: Alien nanobot lockpick");
		System.out.println("Large Tooth");
		System.out.println("blaster battery");
		System.out.println("Blaster");
	}
	
	public void Take() {
		System.out.println("Please list the item youd like to take after the take command");
	}

	public Boolean startGame() {
		System.out.println("You start the game in a dark poorly lit room. The room is small, maybe 6 feet by 8 feet,");
		System.out.println("the room contains 4 walls, two of which have windows, one window views the adjacent room,");
		System.out.println("you turn around to look out the other window to be greeted with the endless void of space.");
		System.out.println("you begin to feel paniked as an alarm begins to go off, and you identify this place as an airlock");	
		return true;
	}
	

}
