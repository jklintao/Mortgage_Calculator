import java.text.NumberFormat;

public class Mortgage_Calculation {

    public void Mortgage_Equation(int p, int m, float i){
        float mortgage = (float) (p * ( (i * (Math.pow((1 + i),m)) / ((Math.pow((1 + i),m) - 1))) ));
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
    }

}
