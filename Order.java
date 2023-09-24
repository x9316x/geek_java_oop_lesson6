package geek_java_oop_lesson6;  // Имя пакета

import java.io.FileWriter;  // Импорт класса для записи в файл
import java.io.IOException;  // Импорт класса исключений ввода-вывода
import java.util.Scanner;  // Импорт класса для считывания данных из консоли

public class Order {

    // Объявление приватных полей класса
    private String clientName;  // Имя клиента
    private String product;  // Наименование продукта
    private int qnt;  // Количество продукта
    private int price;  // Цена продукта

    // Конструктор без параметров
    public Order() {

    }

    // Конструктор с параметрами
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    // Геттеры для полей класса
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    // Метод для ввода данных заказа с консоли
    public void inputFromConsole() {
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    // Метод для сохранения данных заказа в файл в формате JSON
    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Приватный метод для вывода сообщения и считывания строки с консоли
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
