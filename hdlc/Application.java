
public class Application {

    public static void main(String... args) {
        System.out.println("Starting app");
        new Thread(new Server()).start();
        new Thread(new ClientB()).start();
        new Thread(new ClientC()).start();
    }

}