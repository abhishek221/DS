/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 10-04-2020
 *  Time: 18:35
 */
package main;

import Tasks.Exit;
import Tasks.Greet;
import Tasks.Quiz;
import Tasks.RemindAge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = Greet.greet();
        RemindAge.remindAge(userName);
        while (true) {
            System.out.println("Press 1 for playing a Quiz ");
            System.out.println("Press 2 for exiting ");
            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    Quiz.quiz();
                    break;

                case 2:
                    Exit.exit();
                    break;

                default:
                    System.out.println("please enter a valid input ");
                    break;

            }
            System.out.println("do you wanna do that again ? press n for no ");
            char responseV = scanner.next().charAt(0);

            if (responseV == 'n') {
                System.out.println("exiting ....");
                break;
            }


        }
    }
}