import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Menu.mainMenu();

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                controller.login();
                break;
            case 2:
                controller.createNewAccount();
                break;
            default:
                break;
        }

    }
}