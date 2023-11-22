package org.example;

import org.example.state.DeliveredState;
import org.example.state.InTransitState;
import org.example.state.PackageState;
import org.example.strategy.ExpressShippingStrategy;
import org.example.strategy.ShippingStrategy;
import org.example.strategy.StandardShippingStrategy;

import java.util.Scanner;

public class ShippingSystem {
    private static ShippingStrategy standardShipping = new StandardShippingStrategy();
    private static ShippingStrategy expressShipping = new ExpressShippingStrategy();
    private static Package myPackage = new Package();
    private static PackageState inTransitState = new InTransitState(myPackage);
    private static PackageState deliveredState = new DeliveredState(myPackage);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Package Management and Shipping System");
        System.out.println("Enter the weight of you package");
        int package_weight = scanner.nextInt();
        handleShippingStrategyMenu(scanner);

        int option = 0;

        while (option != 3) {
            printMainMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    handleShippingStrategyMenu(scanner);
                    break;
                case 2:
                    handlePackageStateMenu(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }

            // Perform shipping and update state after each choice
            myPackage.shipPackage();
            myPackage.updatePackageState();
        }

        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Change Shipping Strategy");
        System.out.println("2. Update Package State");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleShippingStrategyMenu(Scanner scanner) {
        System.out.println("Select Shipping Strategy:");
        System.out.println("1. Standard Shipping");
        System.out.println("2. Express Shipping");
        System.out.print("Enter your choice: ");
        int strategyOption = scanner.nextInt();

        switch (strategyOption) {
            case 1:
                myPackage.setShippingStrategy(standardShipping);
                break;
            case 2:
                myPackage.setShippingStrategy(expressShipping);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private static void handlePackageStateMenu(Scanner scanner) {
        System.out.println("Select Package State:");
        System.out.println("1. In Transit");
        System.out.println("2. Delivered");
        System.out.print("Enter your choice: ");
        int stateOption = scanner.nextInt();

        switch (stateOption) {
            case 1:
                myPackage.setPackageState(inTransitState);
                break;
            case 2:
                myPackage.setPackageState(deliveredState);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}
