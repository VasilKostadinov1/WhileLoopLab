package BASIC.WhileLoopLab;

import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int totalVolume = width * length * height;
        boolean noVolume = false;
        //int shortageSpace = sumBoxes-totalVolume;
        //int sumBoxes =0;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);          // input !!!
            //sumBoxes+=boxes;                              // increase boxes
            totalVolume -= boxes;                           // decrease free volume

            if (totalVolume <= 0) {
                noVolume = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (noVolume) {
            System.out.printf("%d Cubic meters left.", totalVolume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolume));  // use Math.abs to trim volume !!!
        }


    }
}
