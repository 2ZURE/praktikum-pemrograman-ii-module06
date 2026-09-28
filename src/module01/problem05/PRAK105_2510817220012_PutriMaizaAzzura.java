package module01.problem05;

import java.util.Scanner;

public class PRAK105_2510817220012_PutriMaizaAzzura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius = scan.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scan.nextDouble();

        double cylinderVolume = PI * radius * radius * height;

        System.out.println("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height
                + " cm adalah " + String.format("%.3f", cylinderVolume) + " m3");
    }
}