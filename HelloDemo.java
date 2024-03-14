import java.util.Scanner;

public class HelloDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.err.println("whats the input");
        int a = sc.nextInt();
        System.out.println("Value = 39" + a);
        sc.close();
    }
}