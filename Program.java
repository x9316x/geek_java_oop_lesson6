package geek_java_oop_lesson6;  // Имя пакета

public class Program {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();  // Создание нового объекта заказа
        order.inputFromConsole();  // Ввод данных заказа с консоли
        order.saveToJson();  // Сохранение данных заказа в файл в формате JSON
    }
}