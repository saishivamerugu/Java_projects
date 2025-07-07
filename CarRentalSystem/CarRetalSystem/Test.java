package CarRetalSystem;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n====================================");
            System.out.println("         CAR RENTAL SYSTEM          ");
            System.out.println("====================================");
            System.out.println("1. Rent a Car");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter License Number: ");
                    String license = sc.nextLine();

                    System.out.print("Enter Car Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Car Model: ");
                    String model = sc.nextLine();

                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNumber = sc.nextLine();

                    System.out.print("Enter Number of Rental Days: ");
                    int noOfDays = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Start Date: ");
                    String startDate = sc.nextLine();

                    System.out.print("Enter End Date: ");
                    String endDate = sc.nextLine();

                    System.out.print("Enter Rent Per Day: ");
                    int rentPerDay = sc.nextInt();
                    sc.nextLine();

                    RentalService rental = new RentalService(
                        new Car(brand, model, vehicleNumber),
                        new Customer(name, license),
                        noOfDays,
                        startDate,
                        endDate
                    );

                    System.out.print("Press 'x' to generate the bill: ");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("x")) {
                        int totalRent = rental.calculateRent(rentPerDay);

                        System.out.println("\n============  Bill ===============");
                        System.out.println("        Car Rental Serivce          ");
                        System.out.println("        Hanamkonda Warangal         ");
                        System.out.println("==================================");
                        System.out.println("Customer Name    : " + rental.getCustomer().getName());
                        System.out.println("License Number   : " + rental.getCustomer().getLiscence());
                        System.out.println("----------------------------------");
                        System.out.println("Car Brand        : " + rental.getCar().getBrand());
                        System.out.println("Car Model        : " + rental.getCar().getModel());
                        System.out.println("Vehicle Number   : " + rental.getCar().getvehicleNumber());
                        System.out.println("----------------------------------");
                        System.out.println("Start Date       : " + rental.getStartDay());
                        System.out.println("End Date         : " + rental.getEndDate());
                        System.out.println("Days Rented      : " + rental.getNoOfDays());
                        System.out.println("Rent/Day         : " + rentPerDay);
                        System.out.println("Total Rent       : " + totalRent);
                        System.out.println("==================================");
                    } else {
                        System.out.println("Bill not generated. Returning to main menu.");
                    }
                    break;

                case 0:
                    System.out.println("Exited Sucessfully");
                    break;

                default:
                    System.out.println("Enter correct choice between 0 and 1 ");
            }
        }

        sc.close();
    }
}
