public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        this.totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public double addMeal(double cost) {
        return totalBillBeforeTip = totalBillBeforeTip + cost;
    }

    public double tipAmount() {
        return Math.round((totalBillBeforeTip * (tipPercentage / 100.0)) * 100.0) / 100.0;
    }

    public double totalBill() {
        return Math.round((tipAmount() + totalBillBeforeTip) * 100.0) / 100.0;
    }
    public double perPersonCostBeforeTip() {
        return Math.round((totalBillBeforeTip / numPeople) * 100.0) / 100.0;
    }

    public double perPersonTipAmount () {
        return Math.round((tipAmount() / numPeople) * 100.0) / 100.0;
    }

    public double perPersonTotalCost () {
        return Math.round((totalBill() / numPeople) * 100.0) / 100.0;
    }

}