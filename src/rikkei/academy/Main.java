package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập chiều dài:");
                    int width = input.nextInt();
                    System.out.println("Nhập chiều rộng");
                    int height = input.nextInt();
                    for (int i = 0; i < width ; i++) {
                        for (int j = 0; j < height ; j++){
                            System.out.print("*" + " 1");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập độ dài cạnh:");
                    int a = input.nextInt();
                    for (int i = 0; i <= a; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.println("Nhập độ dài cạnh:");
                    int b = input.nextInt();
                    for (int i = b; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}