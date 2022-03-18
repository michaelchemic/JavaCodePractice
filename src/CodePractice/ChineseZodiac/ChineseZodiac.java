package CodePractice.ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        switch (year % 7) {
            case 0 -> System.out.println("monkey");
            case 1 -> System.out.println("rooster");
            case 2 -> System.out.println("dog");
            case 3 -> System.out.println("pig");
            case 4 -> System.out.println("rat");
            case 5 -> System.out.println("ox");
            case 6 -> System.out.println("tiger");

            //...
        }
    }
}
