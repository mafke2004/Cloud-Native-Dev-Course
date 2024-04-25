import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   // create carlist

    public static void main(String[] args) {
        String[] fileData =
                ReadFromFile.readFile("/Users/C71340I/IdeaProjects/Java 4/src/measurements.txt");
        ArrayList<CarData> cars = new ArrayList<>();

        for (String line : fileData) {
            String[] linedetail = line.split(" ");
            String Licence = linedetail[0];
            int HourIn = (Integer.parseInt(linedetail[1]));
            int MinuteIn = (Integer.parseInt(linedetail[2]));
            int SecondIn = (Integer.parseInt(linedetail[3]));
            int MilliIn = (Integer.parseInt(linedetail[4]));
            int HourOut = (Integer.parseInt(linedetail[5]));
            int MinuteOut = (Integer.parseInt(linedetail[6]));
            int SecondOut = (Integer.parseInt(linedetail[7]));
            int MilliOut = (Integer.parseInt(linedetail[8]));
            CarData car = new CarData(Licence, HourIn, MinuteIn, SecondIn, MilliIn, HourOut, MinuteOut, SecondOut, MilliOut);
            cars.add(car);
        }

        //EX 2
        int countCars =0;
        for (CarData car : cars) {
            countCars++;
        }
        System.out.println("Exercise 2 :");
        System.out.println("The data of "+ countCars + " vehicles were recorded in the measurement.");




        // EX3
        // calculation
        int teller = 0;
        for (CarData car : cars) {
            if (car.HourOut < 9) {
                teller++;
            }
        }
        System.out.println("Exercise 3 :");
        System.out.println("Before 9 o'clock " + teller + " vehicles passed the exit point recorder");

        // EX4
        // Get Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an hour and minute value divided by a space:");
        int givenHour = scanner.nextInt();
        int givenMinute = scanner.nextInt();


        teller = 0;
        for (CarData car : cars) {
            if (car.HourIn == givenHour && car.MinutesIn == givenMinute) {
                teller++;
            }
        }
        int counter = 0;
        for (CarData car : cars) {
            if (((car.HourIn == givenHour && car.HourOut == givenHour) && (!(car.MinutesIn > givenMinute +1  || car.MinuteOut <= givenMinute )))) {
                counter++;
            }


        }
        float density = (float)counter/10;
        System.out.println("Exercise 4 : ");
        System.out.println("a. The number of vehicle that passed the entry point recorder: " + teller);
        System.out.println("b. The traffic intensity: " + density );

    }

}