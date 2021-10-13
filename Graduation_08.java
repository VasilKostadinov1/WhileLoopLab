package BASIC.WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     // RESOLVE it
        String name = scanner.nextLine();
        int counterGrade = 0;
        double sum = 0;
        int counterGradeLessThan4 = 0;

        for (int i = 1; i <= 12; i++) {     // for cycle might be replaced : while (counterGrade <=12) ....
            double grade = Double.parseDouble(scanner.nextLine());
            counterGrade++;
            sum += grade;

            if (grade < 4) {
                counterGradeLessThan4++;
                if (counterGradeLessThan4 > 2) {
                    System.out.printf("%s has been excluded at %d grade%n", name, counterGrade );
                    break;   // break !!!! Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва
                }
            }
        }
        if (counterGradeLessThan4 <2) {            // < 2 !!!!
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }



    }
}
