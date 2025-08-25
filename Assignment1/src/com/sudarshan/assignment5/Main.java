package com.sudarshan.assignment5;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the choice:\n");
        int choice = sc.nextInt();       // 1, 2, or 3
        System.out.println("\n");
        System.out.print("Enter the no. of Hours:\n");
        int hours = sc.nextInt();        // hours of travel
        System.out.println("\n");
        System.out.print("Enter the Cost per Hours:\n");
        double costPerHour = sc.nextDouble(); // cost per hour

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        airfare.display();
        sc.close();
    }
}
