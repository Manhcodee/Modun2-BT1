import java.util.Scanner;

public class CoverMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double rate = scanner.nextDouble();
        double cover = rate * 24000;
        System.out.println("VND = : " + cover + "VND");
    }
}
