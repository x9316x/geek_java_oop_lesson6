package geek_java_oop_lesson6;

public class Program {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();
    }

}