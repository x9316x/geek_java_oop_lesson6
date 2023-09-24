package geek_java_oop_lesson6;

// Класс для представления заказа
public class Order {
    private String clientName;  // Имя клиента
    private String product;     // Наименование продукта
    private int quantity;            // Количество продукта
    private int price;          // Цена продукта

    // Конструктор без параметров
    public Order() {
    }

    // Конструктор с параметрами
    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // Геттеры для полей класса
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
