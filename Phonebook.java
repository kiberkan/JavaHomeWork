

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
	private Map<String, List<String>> phoneBook = new HashMap<>();

	public void addInfo(String[] nameAndPhone) {
		if (phoneBook.containsKey(nameAndPhone[0])) {
			List<String> list = new ArrayList<>();
			list = phoneBook.get(nameAndPhone[0]);
			list.add(nameAndPhone[1]);

		} else {
			List<String> list = new ArrayList<>();
			list.add(nameAndPhone[1]);
			phoneBook.put(nameAndPhone[0], list);
		}
	}

	public void showBook() {
		StringBuilder stringbuilder = new StringBuilder();
		for (Map.Entry entry : phoneBook.entrySet()) {
			stringbuilder.append(entry.getKey());
			stringbuilder.append(" : ");
			stringbuilder.append(entry.getValue());
			stringbuilder.append("\n");
		}
		System.out.println(stringbuilder);
	}

	public void sortBook() {
		StringBuilder stringbuilder = new StringBuilder();
		int minValue = 1_000_000;
		int maxValue = 0;
		for (var entry : phoneBook.entrySet()) {
			if (minValue > entry.getValue().size()) {
				minValue = entry.getValue().size();
			}
			if (maxValue < entry.getValue().size()) {
				maxValue = entry.getValue().size();
			}
		}
		int index = minValue;
		System.out.println(index);
		while (index <= maxValue) {
			for (var entry : phoneBook.entrySet()) {
				if (entry.getValue().size() == index) {
					stringbuilder.append(entry.getKey());
					stringbuilder.append(" : ");
					stringbuilder.append(entry.getValue());
					stringbuilder.append("\n");
				}
			}
			index++;
		}
		System.out.println(stringbuilder);
	}
}