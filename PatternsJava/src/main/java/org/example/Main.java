package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pattern6(5);

    }
    static void pattern6(int n){
        for (int row = 1; row < n; row++) {
            for (int i = 0; i < n - row; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < 2 * n; i++) {
            int colAtEveryRow = i > n ? 2 * n - i: i;
            int NoOfSpaces = n - colAtEveryRow;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colAtEveryRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 0; i < 2 * n; i++) {
            int colAtEveryRow = i > n ? 2 * n - i: i;
            for (int j = 0; j < colAtEveryRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}