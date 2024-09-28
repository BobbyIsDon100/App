import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 nubers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + "/" + y + "= " + z);

        } catch (ArithmeticException ex) {
            System.out.println("........CatchBlock............");
            System.out.println(ex.toString());
        } finally {
            System.out.println("........FinallyBlock..........");
            System.out.println("Application Designed and developed by");
            System.out.println("Abhishek");
            sc.close();
        }
        System.out.println("................DONE.............");
    }
}