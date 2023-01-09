public class Main {

    public static void main(String[] args) {

        Principal principal = new Principal();
        Interest_Rate interestRate = new Interest_Rate();
        Monthly_Term monthlyTerm = new Monthly_Term();
        Mortgage_Calculation mortgageCalculation = new Mortgage_Calculation();

        principal.UserInput();
        interestRate.UserInput();
        monthlyTerm.UserInput();

        mortgageCalculation.Mortgage_Equation(
                principal.getPrincipal(),
                monthlyTerm.getMonthly_term(),
                interestRate.getMoInt());
    }
}