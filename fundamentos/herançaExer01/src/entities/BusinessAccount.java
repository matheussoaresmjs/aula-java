package entities;

public class BusinessAccount extends Account {
    
    private double loanLimit;

    public BusinessAccount() {
        super(); //Posso chamar o "super" no construtor padrão, caso exista alguma lógica implementada no construtor padrão da classe "Account"
    }

    // O super aqui faz sentido, pois está herdando um construtor de uma classe herdada
    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount) {
        if (amount <= loanLimit) {
        balance += amount - 10.0;

        }
    }
}
