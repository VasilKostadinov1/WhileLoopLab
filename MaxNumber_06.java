package BASIC.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {   //  подаваме Stop или 4исло под формата на текст!!! Парсни inta
            //число под формата на текст -> "100"
            //текст -> число (parse)
            int number = Integer.parseInt(input); // with sc.next, we'll skip the 1st num. see it in Debug
            if (number > max) {
                max = number;        // Not: number =max !!!
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
        // Защо не се ползва scanner.nextLine в While-a?
        // !!!защото числото трябва да е равно на това, което сме въвели, а не да въвеждаме ново

    }
}
