package Java_homework.homework_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Map<String, List<String>> book = new HashMap<>();
        book.put("Ваня", List.of("8 923 000 0000", "8 923 000 0001"));
        book.put("Петя", List.of("8 923 000 0002"));
        book.put("Вася", List.of("8 923 000 0003", "8 923 000 0004"));

        menu(book);
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static void find(Map<String, List<String>> phoneBook)
    // Поиск абонента
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        System.out.println("Имя: " + name + "\nТелефон(ы): " + phoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> AllBook)
    // Печать книги
    {
        for (var item : AllBook.entrySet()) {
            System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
        }
    }

    public static Map<String, List<String>> add(Map<String, List<String>> book)
    // Добавление в тел. книгу
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        List<String> data = new ArrayList<>();
        while (true) {
            System.out.println("Если номеров больше нет, введите 'Q'");
            System.out.print("Введите номер: ");
            String nomer = scan();
            if (nomer.equals("Q")) {
                break;
            } else {
                data.add(nomer);
            }
        }
        book.put(name, data);

        return book;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> book) {
        while (true) {
            System.out.println("\nТелефонная Книга:\n" +
                    "\n1. Найти контакт \n2. Добавить контакт" +
                    " \n3. Печать телефонной книги \n4. Выход");
            System.out.print("\nвыберите пункт меню: ");
            String comands = scan();
            if (comands.equals("4")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(book);
                        break;
                    case "2":
                        add(book);
                        break;
                    case "3":
                        allBook(book);
                        break;
                    default:
                        break;
                }
            }
        }
        return book;
    }
}
