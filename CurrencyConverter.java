import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Example exchange rates (you can update them as needed)
        double usdToInr = 83.20;
        double eurToInr = 91.50;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;

        while (true) {
            System.out.println("===== Currency Converter =====");
            System.out.println("1. USD to INR");
            System.out.println("2. INR to USD");
            System.out.println("3. EUR to INR");
            System.out.println("4. INR to EUR");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Currency Converter!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = amount * usdToInr;
                    System.out.println(amount + " USD = " + result + " INR");
                    break;
                case 2:
                    result = amount * inrToUsd;
                    System.out.println(amount + " INR = " + result + " USD");
                    break;
                case 3:
                    result = amount * eurToInr;
                    System.out.println(amount + " EUR = " + result + " INR");
                    break;
                case 4:
                    result = amount * inrToEur;
                    System.out.println(amount + " INR = " + result + " EUR");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println(); // empty line for spacing
        }

        sc.close();
    }

}
