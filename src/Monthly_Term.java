import java.util.Scanner;

public class Monthly_Term {
    private int monthly_term;

    final int yMIN = 1;
    final int yMAX = 30;

    public void setMonthly_term(int y){
        this.monthly_term = y * 12;
    }
    public int getMonthly_term(){
        return this.monthly_term;
    }

    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Period(Years): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter a value between 1 and 30.");
                scanner.next();
            }else {
                int years = scanner.nextInt();
                if (years > yMIN && years <= yMAX) {
                    this.setMonthly_term(years);
                    break;
                }
                System.out.println("Enter a value between 1 and 30.");
            }
        }
    }
}
