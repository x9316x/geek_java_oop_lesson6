package geek_java_oop_lesson6;

public class Program {

    public static void main(String[] args) {
        Order order = OrderInput.inputFromConsole();
        OrderSaver.saveToJson(order);
    }
}
