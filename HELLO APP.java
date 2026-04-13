public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names using String.join()
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}
