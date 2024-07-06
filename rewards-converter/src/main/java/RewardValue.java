
public class RewardValue {
    double cashValue;
    int milesValue;
    static final double CONVERSION = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue=Cashtomiles(cashValue);

    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue=milestocash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
    public double milestocash(int miles)
    {
        return miles * CONVERSION;
    }
    public int Cashtomiles(double cash)
    {
        return (int) (cash/CONVERSION);
    }
}
