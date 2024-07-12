package itstep.learning;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    Map<String, String> dictionary = new LinkedHashMap<>();

    public void fillDictionary() {
        dictionary.put("axe", "сокира");
        dictionary.put("box", "коробка");
        dictionary.put("cow", "корова");
        dictionary.put("day", "день");
        dictionary.put("eye", "око");
        dictionary.put("fox", "лис");
        dictionary.put("gym", "спортивна зала");
        dictionary.put("hay", "сіно");
        dictionary.put("ink", "чорнило");
        dictionary.put("jaw", "щелепа");
        dictionary.put("key", "ключ");
        dictionary.put("law", "закон");
        dictionary.put("map", "мапа");
        dictionary.put("nap", "дрімота");
        dictionary.put("oak", "дуб");
        dictionary.put("paw", "лапа");
        dictionary.put("qua", "у якості");
        dictionary.put("row", "рядок");
        dictionary.put("sky", "небо");
        dictionary.put("tax", "податок");
        dictionary.put("use", "користь");
        dictionary.put("van", "фургон");
        dictionary.put("wax", "віск");
        dictionary.put("xyz", "і т.д. і т.п.");
        dictionary.put("yet", "все ще");
        dictionary.put("zip", "застібка-блискавка");
    }

    public void run() {
        this.fillDictionary();

        System.out.println("Вітаємо в англо-українському словнику");
        Scanner scanner = new Scanner(System.in);
        String word;
        while (true) {
            System.out.print("\nВведіть англійське слово для перекладу: ");
            word = scanner.nextLine().toLowerCase();
            if (dictionary.containsKey(word))
                System.out.printf("\"%s\" - \"%s\"\n", word, dictionary.get(word));
            else
            {
                System.out.println("На жаль, переклад для цього слова не знайдено");
                String addingChoice;
                while (true) {
                    System.out.printf("Якщо бажаєте додати \"%s\" до словника - введіть \"+\", якщо ні - \"-\": ", word);
                    addingChoice = scanner.nextLine();
                    if (addingChoice.equals("+")) {
                        System.out.print("Введіть переклад цього слова на українську мову: ");
                        dictionary.put(word, scanner.nextLine());
                        System.out.printf("Слово \"%s\" з його перекладом успішно додані до словника!\n", word);
                    }
                    else if (!addingChoice.equals("-")) {
                        System.out.println("Ви ввели неправильний знак. Спробуйте ще раз.");
                        continue;
                    }
                    break;
                }
            }
            System.out.println();
            String continuingChoice;
            while (true) {
                System.out.print("Якщо бажаєте продовжити працювати зі словником - введіть \"+\", якщо ні - \"-\": ");
                continuingChoice = scanner.nextLine();
                if (continuingChoice.equals("-")) {
                    System.out.println("Бувайте!");
                    return;
                }
                else if (continuingChoice.equals("+")) break;
                else System.out.println("Ви ввели неправильний знак. Спробуйте ще раз.");
            }
        }
    }
}