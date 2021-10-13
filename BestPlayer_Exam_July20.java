package BASIC.WhileLoopLab;

import java.util.Scanner;

public class BestPlayer_Exam_July20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String bestPlayer = "";
        int max = Integer.MIN_VALUE;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals>max){
                max=goals;
                bestPlayer=name;
            }
            if (max>=10){
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (max>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        }else {
            System.out.printf("He has scored %d goals.",max);
        }

    }
}
