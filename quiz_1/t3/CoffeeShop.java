package t3;

public class CoffeeShop {
    int pricePerCoffee = 250; // tetri
    int numCoffeeSold = 100;
    int totalCostOfBeans = 15000; // tetri
    int totalExpenses;

    int otherExpenses;


    // TODO 1
    // include all the expenses that are provided in the expenses.txt file
    // file reading is not mandatory to implement programmatically, you can view the file yourself and hardcode the
    // provided values in this java file.


    
    int Tax = 5100;
    int Water = 75;
    int Gas = 159;
    int Electricity = 14800;
    int Parking = 5100;


    // actually i started doing this
    // but since this tasks are not written in the pdf file provided via email
    // i am not finishing them.
    // instead, i am writing reflection.txt as a third task

    double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {

        double profitInLaris = 0;

        // TODO 2
        // Finish this function

        return profitInLaris;
    }

}
