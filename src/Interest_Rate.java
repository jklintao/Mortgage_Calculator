import java.util.Scanner;

public class Interest_Rate {
    final double iMIN = 0;
    final double iMAX = 30;

    private float anInt;

    public void setAnInt(float anInt){
        this.anInt = anInt;
    }

    public float getMoInt(){
        return (this.anInt / 100 / 12);
    }

    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Annual Interest Rate: ");
            if (!scanner.hasNextFloat()) {
                System.out.println("Enter a value greater then 0 and less than or equal to 30.");
                scanner.next();
            }else {
                float anInt = scanner.nextFloat();
                if (anInt > iMIN && anInt <= iMAX) {
                    this.setAnInt(anInt);
                    break;
                }
                System.out.println("Enter a value greater then 0 and less than or equal to 30.");
            }
        }
    }
}
