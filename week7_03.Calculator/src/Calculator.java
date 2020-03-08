import java.util.Scanner;

public class Calculator {
    private Reader reader;
    private int totalCal;

    public Calculator() {
        reader = new Reader();
        this.totalCal = 0;
    }

    private void sum() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of the values " + sum);
        totalCal++;
    }

    private void difference() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int difference = value1 - value2;
        System.out.println("difference of the values " + difference);
        totalCal++;
    }

    private void product() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int product = value1 * value2;
        System.out.println("product of the values " + product);
        totalCal++;
    }

    private void statistics() {
        System.out.println("Calculations done " + totalCal);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
