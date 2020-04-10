/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 10-04-2020
 *  Time: 18:35
 */
package main;

import Tasks.Greet;
import Tasks.RemindAge;

public class Main {
    public static void main(String[] args) {
        String userName = Greet.greet();
        RemindAge.remindAge(userName);

    }
}
