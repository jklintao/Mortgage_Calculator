import java.text.NumberFormat;
import java.util.Scanner;

public class Principal {

    final int pMIN = 1000;
    final int pMAX = 100_000_000;

    private int principal;

    public void setPrincipal(int p){
        this.principal = p;
    }
    public int getPrincipal(){
        return this.principal;
    }

    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal $1K-$1M: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter a number between " + NumberFormat.getInstance().format(pMIN) +
                                " and " + NumberFormat.getInstance().format(pMAX));
                scanner.next();
            }else {
                int p = scanner.nextInt();
                if (p >= pMIN && p <= pMAX) {
                    this.setPrincipal(p);
                    break;
                }
                System.out.println("Enter a number between " + NumberFormat.getInstance().format(pMIN) +
                        " and " + NumberFormat.getInstance().format(pMAX));
            }
        }
    }
}
