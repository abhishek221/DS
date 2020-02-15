package Main;

import definition.TOH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH obj = new TOH();
        obj.TowerOfHanoi(n,"A","B","C");
    }
}
