package module01.problem02;

import java.util.Scanner;

public class PRAK102_2510817220012_PutriMaizaAzzura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startNumber = input.nextInt();
        int counter = 0;

        while (counter <= 10) {
            if (startNumber % 5 == 0) {
                System.out.print(startNumber / 5 - 1);
            } else {
                System.out.print(startNumber);
            }

            if (counter < 10) {
                System.out.print(", ");
            }

            startNumber++;
            counter++;
        }
    }
}