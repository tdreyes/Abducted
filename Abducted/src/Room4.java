/*
 * @author teresa
 */
public class Room4 implements Room{

	public final int RoomNumber = 4;
	public final String RoomName = "Room4";
	

	@Override
	public void EnterRoom() {
		System.out.println("You walk down a long hallway leading away from the biolab,");
		System.out.println("You see multiple escape pods but you possess no way to operate one.");
		System.out.println("You keep walking down the hallway to be met with horrific noises of screaming and chopping.");
		System.out.println("You turn a corner and see it, the alien that is running the ship and kidnapped you.\n");	
	}
	
	@Override
	public void Look() {
		System.out.println("You see multiple escape pods but you possess no way to operate one.");
	}
	
	@Override
	public void Take() {
		System.out.println("There's nothing to take");
	}

}
