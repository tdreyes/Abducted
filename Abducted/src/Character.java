
public class Character {

	String name = "Alien";
	
	public class UserCharacter{
		String name = "";
		boolean isdead = false;
		//checks if user is dead
		public void ChecksDeathStatus(boolean deathstatus) {
			if (deathstatus = true)
			{
				System.exit(0);
			}
		}
	}
	public enum Actions{
		USE,
		LOOK,
		TAKE,
		SMASH,
		SHOOT,
		RELOAD,
		HIDE;
	}
}
