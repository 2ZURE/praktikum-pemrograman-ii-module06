package module01.problem03;

import java.util.Scanner;

public class PRAK103_2510817220012_PutriMaizaAzzura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int startNumber = input.nextInt();

        int counter = 0;
        do {
            if (startNumber % 2 != 0) {
                System.out.print(startNumber);
                counter++;
                if (counter < count) {
                    System.out.print(", ");
                }
            }
            startNumber++;
        } while (counter < count);
    }
}