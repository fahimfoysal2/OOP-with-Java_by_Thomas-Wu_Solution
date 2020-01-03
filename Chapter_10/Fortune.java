package Chapter_10;
import java.util.*;

public class Fortune {
	private ArrayList<String> fortuneList = new ArrayList<String>();

	Fortune() {
		fortuneList.add("You will qet 4.0 GPA this semester.");
		fortuneList.add("Happiness is programming.");
		fortuneList.add("Satisfaction follows hard work.");
		fortuneList.add("Patience is virtue.");
		fortuneList.add("Fortun 5");
		fortuneList.add("Fortun 6");
		fortuneList.add("Fortun 7");
		fortuneList.add("Fortun 8");
		fortuneList.add("Fortun 9");
		fortuneList.add("Fortun 10");
	}

	public String getRandomFortune() {
		Random rand = new Random();
		int n = rand.nextInt(10);
		return fortuneList.get(n);
	}
}