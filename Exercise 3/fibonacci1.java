import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, next;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}

