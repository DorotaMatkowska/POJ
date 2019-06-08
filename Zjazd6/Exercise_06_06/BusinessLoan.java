/*
    Tyński Aleksander
    Dorota Matkowska
    Zadanie 6 lab6
 */
public class BusinessLoan extends Loan {

    BusinessLoan(String loanNum, String lastName,double loanAmt, int term, double primeIntRate)
    {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.01 / (primeIntRate / 100);
    }
}
