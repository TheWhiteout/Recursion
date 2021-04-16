import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Map<String, String> answers = new HashMap<String, String>();
		answers.put("Greece", "Athens");
		answers.put("Bulgaria", "Sofia");
		answers.put("United Kingdom", "London");
		answers.put("France", "Paris");
		answers.put("Russia", "Moscow");
		answers.put("Ireland", "Dublin");
		int points = 0;
		Scanner input = new Scanner(System.in);
		List<String> keys = new ArrayList<String>(answers.keySet());
		Collections.shuffle(keys);
		for (String country : keys) {
			System.out.println(country);
			String capital = input.nextLine();
			if (capital.equals(answers.get(country))) {
				points++;
			} else {
				points--;
			}
		}
		input.close();
		System.out.println(points);
	}

}
