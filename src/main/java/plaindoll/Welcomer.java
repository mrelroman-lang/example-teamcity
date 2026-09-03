package plaindoll;

public class Welcomer{
	// Если хочешь больше веселья и информации про ДевОпс - приходи.
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}

	// Возвращает новую реплику, связанную с путем охотника.  
	public String sayHunterPath() {
		return "The path of a hunter is paved with patience and silence.";
	}
}
