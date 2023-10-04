import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");

        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();

        System.out.print("What is the tip percentage? ");
        int tipPercentage = scan.nextInt();

        TipCalculator receipt = new TipCalculator(numPeople, tipPercentage);

        System.out.println();

        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double cost = scan.nextDouble();

        receipt.addMeal(cost);

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();

            receipt.addMeal(cost);
        }
        receipt.addMeal(1);

        System.out.println();

        System.out.println("Total Bill Before Tip: " + receipt.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + receipt.getTipPercentage());
        System.out.println("Total Tip: " + receipt.tipAmount());
        System.out.println("Total Bill With Tip: " + receipt.totalBill());
        System.out.println("Per Person Cost Before Tip: " + receipt.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: " + receipt.perPersonTipAmount());
        System.out.println("Total Cost Per Person: " + receipt.perPersonTotalCost());
    }

}