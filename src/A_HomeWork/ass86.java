package A_HomeWork;

import java.util.*;

public class ass86 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();
		for (int i = 0; i < word.length() - 2; i++) {
			if (word.substring(i, i + 3).equals("cat")) {
				countOfCats++;
			} else if (word.substring(i, i + 3).equals("dog")) {
				countOfDogs++;
			}
		}
		if (countOfCats == countOfDogs) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
