package task4;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        //take user input
        System.out.println("Enter upper bound: ");
        try (Scanner sc = new Scanner(System.in)) {
            int ub = sc.nextInt();
            forLoop(ub);
            whileLoop(ub);
            doWhileLoop(ub);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public static void forLoop(int upperBound) {
        int sum = 0;
        int avg;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        avg = sum / upperBound;
        System.out.println("For Loop Sum: " + sum);
        System.out.println("For Loop Avg: " + avg);
    }

    public static void whileLoop(int upperBound) {
        int sum = 0;
        int avg;
        int i = 1;
        while(i <= upperBound){
            sum += i;
            i++;
        }
        avg = sum / upperBound;
        System.out.println("While Loop Sum: " + sum);
        System.out.println("While Loop Avg: " + avg);
    }

    public static void doWhileLoop(int upperBound) {
        int sum = 0;
        int avg;
        int i = 1;
        do{
            sum += i;
            i++;
        }while(i <= 100);
        avg = sum / upperBound;
        System.out.println("Do-While Loop Sum: " + sum);
        System.out.println("Do-While Loop Avg: " + avg);
    }
}
