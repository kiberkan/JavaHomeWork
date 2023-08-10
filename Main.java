
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		Phonebook book = new Phonebook();
		while (flag) {
			System.out.println(
					"Выберите пункт меню: 1 - добавить абонента или номер, 2 - показать все номера, 3 - показать отсортированный список, 4 - выйти");
			boolean chose = scanner.hasNextInt();
			if (chose) {
				String input = scanner.nextLine();
				switch (input) {
					case "1":
						System.out.println("Введите имя и номер телефона через запятную: ");
						String[] nameAndPhone = scanner.nextLine().trim().split(",");
						book.addInfo(nameAndPhone);
						break;
					case "2":
						book.showBook();
						break;
					case "3":
						book.sortBook();
						break;
					default:
						System.out.println();
						System.out.println("Good bye!");
						flag = false;
						break;
				}
			} else {
				System.out.println("You press not a number");
				flag = false;
				scanner.close();
			}
		}
	}
}