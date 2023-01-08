import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal;
        float aInterest;
        float mInterest;
        int years;
        int months;
        double Mortgage;

        System.out.print("Principal: ");
        if(!scanner.hasNextInt()){
            System.out.println("Invalid Entry. Please Try again.");
        }
        principal = scanner.nextInt();

        System.out.print("Annual Interest: ");
        if(!scanner.hasNextFloat()){
            System.out.println("Invalid Entry. Please Try again.");
        }
        aInterest = scanner.nextFloat();
        mInterest = aInterest /100/ 12;

        System.out.print("Period(Years): ");
        if(!scanner.hasNextInt()){
            System.out.println("Invalid Entry. Please Try again.");
        }
        years = scanner.nextInt();
        months = years * 12;

        double power = Math.pow((1 + mInterest),months);

        Mortgage = (principal*((mInterest*power)/(power-1)));

        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(Mortgage));
    }
}