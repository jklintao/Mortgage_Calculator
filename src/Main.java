import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        final int MIN = 1000;
        final int MAX = 100_000;

        Scanner scanner = new Scanner(System.in);
        Principal principal = new Principal();
        Interest_Rate interestRate = new Interest_Rate();
        Monthly_Term monthlyTerm = new Monthly_Term();
        Mortgage_Calculation mortgageCalculation = new Mortgage_Calculation();

        while (true) {
            System.out.print("Principal $1K-$1M: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid. Try again.");
                scanner.next();
            }else {
                int p = scanner.nextInt();
                if (p >= MIN && p <= MAX) {
                    principal.setPrincipal(p);
                    break;
                }
            }
        }



    }
}