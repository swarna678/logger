package src;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Performing operation...");

        if (logger1 == logger2) {
            System.out.println("Same instance confirmed (Singleton works).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}
