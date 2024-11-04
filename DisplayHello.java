import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.printf("Hello: " + name);
    }
}
