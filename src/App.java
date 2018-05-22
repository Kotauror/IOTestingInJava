import java.io.IOException;
import java.util.Scanner;

public class App {

    App() {
    }

    public static void main(String[] args) throws IOException {
        App app = new App();
        app.sayname();
        app.returntwo();
        app.callThemByTheirNames("Kota");
        app.askForAge();
    }

    public void sayname() {
        System.out.println("hi");
    }

    public void callThemByTheirNames(String name) {
        System.out.println("hi " + name);
    }

    public String askForAge() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how old are you");
        String age = scanner.nextLine();
        System.out.println(age);
        if (Integer.parseInt(age) == 20) {
            System.out.println("hhehe");
            return "hehehe";
        } else {
            System.out.println("boring");
            return "boring";
        }
    }

    public int returntwo() {
        return 2;
    }

}
