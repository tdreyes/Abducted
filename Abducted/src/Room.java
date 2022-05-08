
public interface Room {
	/**
	 * Is the individual name for each room
	 */
	public String RoomName = "";
	/**
	 * displays unique message for each room
	 */
	abstract void EnterRoom();
	
	void Look();
	
	void Take();
	

}
