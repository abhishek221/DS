/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 10-04-2020
 *  Time: 18:46
 */
package Tasks;

import java.util.Scanner;

public class RemindAge {
    public static void remindAge(String userName){
        System.out.println(" So "+userName+", let me guess your age");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        Scanner scanner = new Scanner(System.in);
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();


        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("I think your age is "+age);
        System.out.println("was this guess correct ?   press y for yes and n for no ");
        while(true) {
            char response = scanner.next().charAt(0);
            if (response == 'y' || response == 'n') {
                System.out.println("Well the credit goes to my creator  :) :P  ");
                break;
            } else {
                System.out.println("please enter a valid input , your input should either be 'y' or 'n' ");
            }
        }

    }
}
