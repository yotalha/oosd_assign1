package task5;

import java.util.Scanner;

public class Square2D {
    public static void main(String[] args){
        int[][] arr = new int[10][2];
        System.out.println("Enter 10 numbers");
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i < 10; i++){
                int temp = sc.nextInt(); 
                arr[i][0] = temp;
                arr[i][1] = temp * temp;
            }
        }
        // loop for printing row 1
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i][0] + " ");
        }

        System.out.println();

        // loop for printing row 2
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i][1] + " ");
        }
    }
}
