public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+375-25-123-45-67");
        phoneBook.add("Петров", "+375-33-234-56-78");
        phoneBook.add("Иванов", "+375-44-345-67-89"); // Еще один Иванов

        System.out.println("Телефон Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефон Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефон Сидорова: " + phoneBook.get("Сидоров"));

        System.out.println("\nВсе записи в телефонной книге:");
        phoneBook.printAll();
    }
}