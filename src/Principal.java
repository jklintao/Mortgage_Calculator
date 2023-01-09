import java.util.Scanner;

public class Principal {
    final Scanner scanner = new Scanner(System.in);

    final int pMIN = 1000;
    final int pMAX = 100_000;

    private int principal;

    public void setPrincipal(int p){
        this.principal = p;
    }
    public int getPrincipal(){
        return this.principal;
    }

    public void UserInput(){
        while (true) {
            System.out.print("Principal $1K-$1M: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                scanner.next();
            }else {
                int p = scanner.nextInt();
                if (p >= pMIN && p <= pMAX) {
                    this.setPrincipal(p);
                    break;
                }
                System.out.println("Enter a number between 1,000 and 1,000,000");
            }
        }
        scanner.close();
    }
}
