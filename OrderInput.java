package geek_java_oop_lesson6;

import java.util.Scanner;

// Класс для ввода данных о заказе
public class OrderInput {

    // Статический метод для ввода данных о заказе с консоли
    public static Order inputFromConsole() {
        String clientName = prompt("Client name: ");  // Ввод имени клиента
        String product = prompt("Product: ");         // Ввод наименования продукта
        int qnt = Integer.parseInt(prompt("Quantity: "));  // Ввод количества продукта
        int price = Integer.parseInt(prompt("Price: "));   // Ввод цены продукта

        return new Order(clientName, product, qnt, price);  // Создание и возврат объекта заказа
    }

    // Приватный метод для вывода сообщения и считывания строки с консоли
    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
