package FundamentalQuestions;

public class TransportationOnVehicle {

    public static int rentalCarCost(int d) {
        // Car rental is $40 daily
        // If car is rented for 7 or more days its $50 off
        //If the car is rented for 3 or more days, its $20 off

        int carRental = 40;
        int total = 0;
        if(d <= 0) {
            return 0;
        }
        if(d < 3) {
            return total += carRental * d;
        }
        else if(d >= 3 && d < 7) {
            return total += (carRental * d) - 20;
        }
        return total += (carRental * d) - 50;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }
}
