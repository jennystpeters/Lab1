import java.util.Scanner;

public class Lab1 {
    // Calculates perimeter and area of various classrooms at Grand Circus based on user input
    public static void main(String[] args) {
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        //Create scanner object
        Scanner input = new Scanner(System.in);

        char keepGoing = 'y';

        //Declare and initialize room dimensions
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        String areaFormatted;
        double perimeter = 0.0;
        String perimeterFormatted;
        double volume = 0.0;
        String volumeFormatted;

        //Only repeat if user enters 'y'
        while (keepGoing == 'y') {

            //Prompt user to input and receive room dimensions
            System.out.print("Enter length: ");
            length = input.nextDouble();
            System.out.print("Enter width: ");
            width = input.nextDouble();
            System.out.print("Enter height: ");
            height = input.nextDouble();

            //Calculate area:
            area = length * width;
            areaFormatted = String.format("%.0f", area);

            //Calculate perimeter:
            perimeter = (2 * length) + (2 * width);
            perimeterFormatted = String.format("%.0f", perimeter);

            //Calculate volume:
            volume = area * height;
            volumeFormatted = String.format("%.0f", volume);

            //Output area, perimeter, and volume to user:
            System.out.println("Area: " + areaFormatted);
            System.out.println("Perimeter: " + perimeterFormatted);
            System.out.println("Volume: " + volumeFormatted);

            System.out.println("Continue? (y/n): ");
            keepGoing = input.next().charAt(0);
        }

    }
}