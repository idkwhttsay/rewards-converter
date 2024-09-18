public class RewardValue {
    private double cashValue;
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    private double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    private double convertCashToMiles(double miles) {
        return miles / MILES_TO_CASH_CONVERSION_RATE;
    }

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}
