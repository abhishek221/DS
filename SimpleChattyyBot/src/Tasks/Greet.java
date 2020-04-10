/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 10-04-2020
 *  Time: 18:36
 */
package Tasks;

import java.util.Scanner;

public class Greet {
    public static void greet(){
        System.out.println("Hello my name is Scrappy");
        System.out.println("I was created in the year 2020");

        System.out.println("I am here at your service ");
        System.out.println("Can you please remind me of your name ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What a great name you have "+userName+"!");

    }

}
