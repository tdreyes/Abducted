/**
 * 
 */

/**
 * @author Bailb
 *
 */
public class Starting_Room implements Room {
	public final String RoomName = "Airlock";
	
	@Override public void EnterRoom() {
		System.out.println("You start the game in a dark poorly lit room. The room is small, maybe 6 feet by 8 feet,");
		System.out.println("the room contains 4 walls, two of which have windows, one window views the adjacent room,");
		System.out.println("you turn around to look out the other window to be greeted with the endless void of space.");
		System.out.println("Panicked on how to escape this place you look around  the entire room.");	
	}
	
	public void Look() {
		System.out.println("You see: Alien nanobot lockpick");
		System.out.println("Large Tooth");
		System.out.println("Alien blaster battery");
		System.out.println("Alien Blaster");
	}
	
	public void Take() {
		System.out.println("Please select the item");
	}
	

}
