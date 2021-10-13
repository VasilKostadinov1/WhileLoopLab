package BASIC.WhileLoopLab;

import java.util.Scanner;

public class Graduation2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // my solution 100/100
        String name = scanner.nextLine();
        int counter = 0;  //start from zero!
        double sum = 0;
        int countFailed = 0;

        while (counter < 12) {   // !! not =
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                counter++;
                sum += grade;
            } else if (grade < 4) {
                countFailed++;
                counter++;
                if (countFailed >= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, counter - 1);
                    break;
                }
            }
            if (counter == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
            }
        }
    }
}
