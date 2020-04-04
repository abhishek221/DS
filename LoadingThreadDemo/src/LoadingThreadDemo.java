/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 04-04-2020
 *  Time: 10:27
 */

import java.io.IOException;

public class LoadingThreadDemo {
    public static void main(String[] args) throws InterruptedException, IOException {

        Thread thread = Thread.currentThread();
        String str = "|";

        for (int i = 0; i <=100 ; i++) {
            System.out.println(str);
            System.out.println("Loading : "+i+"%");
            Thread.sleep(10);
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            str = str+"|";
        }
    }
}