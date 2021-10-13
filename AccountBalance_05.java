package BASIC.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //команда -> double или "NoMoreMoney"
        //повтарям: въвеждам команда
        //стоп: команда == "NoMoreMoney"
        //продължавам: команда != "NoMoreMoney"

        String input = scanner.nextLine(); // input is either String or int, how to make the magic?
        double sum = 0.0;

        while (!input.equals("NoMoreMoney")) {    // if input is not String, therefore is int; we declare "currentNum" on next line
            //command = "5.51" -> дробно число
            double currentNum = Double.parseDouble(input);   // not (scanner.nextLine())  !!!
            if (currentNum < 0) {                        // if sc.next is used, in Debug could be seen, how it skips the 1st number
                System.out.println("Invalid operation!");
                break;            // break!!!
            }
            System.out.printf("Increase: %.2f%n", currentNum);
            sum += currentNum;

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);

    }
}
