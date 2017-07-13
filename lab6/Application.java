
public class Application {

    public static void main(String... args) {
        System.out.println("Starting Server");
        new Thread(new Server()).start();
        //Start the Clients
        new Thread(new ClientB()).start();
        new Thread(new ClientC()).start();
    }

}