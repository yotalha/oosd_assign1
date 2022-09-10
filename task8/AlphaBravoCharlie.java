package task8;

public class AlphaBravoCharlie {
    public static void main(String[] args){
        for(int i = 1; i <= 110; i++){
            if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print("AlphaBravoCharlie ");
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.print("AlphaBravo ");
            }
            else if(i % 3 == 0 && i % 7 == 0){
                System.out.print("AlphaCharlie ");
            }
            else if(i % 5 == 0 && i % 7 == 0){
                System.out.print("BravoCharlie ");
            }
            else if(i % 3 == 0){
                System.out.print("Alpha ");
            }
            else if(i % 5 == 0){
                System.out.print("Bravo ");
            }
            else if(i % 7 == 0){
                System.out.print("Charlie ");
            }
            else{
                System.out.print(i + " ");
            }
            if(i % 11 == 0){
                System.out.println();
            }
        }
    }
}
