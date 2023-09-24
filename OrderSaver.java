package geek_java_oop_lesson6;

import java.io.FileWriter;
import java.io.IOException;

// Класс для сохранения данных о заказе в файл
public class OrderSaver {

    // Статический метод для сохранения данных о заказе в файл в формате JSON
    public static void saveToJson(Order order) {
        String fileName = "order.json";  // Имя файла
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\\n");
            writer.write("\\\"clientName\\\": \\\"" + order.getClientName() + "\\\",\\n");
            writer.write("\\\"product\\\": \\\"" + order.getProduct() + "\\\",\\n");
            writer.write("\\\"quantity\\\": " + order.getQuantity() + ",\\n");
            writer.write("\\\"price\\\": " + order.getPrice() + "\\n");
            writer.write("}\\n");
            writer.flush();  // Очистка буфера и запись в файл
        } catch (IOException ex) {
            System.out.println(ex.getMessage());  // Вывод сообщения об ошибке
        }
    }
}
