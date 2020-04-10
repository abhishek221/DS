/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 10-04-2020
 *  Time: 19:17
 */
package Tasks;

import java.util.Scanner;

public class Quiz {

    public static void quiz(){
        System.out.println("Lets test your general knowledge ");
        System.out.println("\n");
        System.out.println("Who is the president of India ?");
        System.out.println("1. Narendra Modi");
        System.out.println("2. Manmohan Singh");
        System.out.println("3. Rahul Gandhi");
        System.out.println("4. RamNath Kovind");
        Scanner scanner = new Scanner(System.in);
        int answer1=4;
        int guess = scanner.nextInt();
        while (guess != answer1) {
            System.out.println("Please, try again.");
            guess = scanner.nextInt();
        }
        if(guess==answer1){
            System.out.println("Congratulations correct answer");
        }

    }
}
