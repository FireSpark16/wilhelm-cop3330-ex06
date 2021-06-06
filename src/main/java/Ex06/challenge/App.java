/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex06.challenge;

import java.util.Date;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.getAge();
        int retire = myApp.getRetire();
        int year = myApp.getCurYear();
        int retYear = myApp.calcYear(year, retire, age);
        int retTime = myApp.calcTime(year, retYear);

        if(retTime >= 0)
            myApp.output(year, retYear, retTime);
        else
            myApp.specialOutput(((-1) * retTime));
    }

    private int calcTime(int year, int retYear) {
        return retYear - year;
    }

    private void output(int year, int retYear, int retTime) {
        System.out.print("You have " + retTime + " years left until you can retire.\nIt's " + year + ", so you can retire in " + retYear);
    }

    private void specialOutput(int retTime) {
        System.out.print("You can retire!\nYou could have retired " + retTime + " years ago!");
    }

    private int calcYear(int year, int retire, int age) {
        return (retire - age) + year;
    }

    private int getCurYear() {
        Date d = new Date();
        return d.getYear() + 1900;
    }


    private int getAge() {
        System.out.print("What is your current age? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getRetire() {
        System.out.print("At what age would you like to retire? ");
        return Integer.parseInt(in.nextLine());
    }
}
