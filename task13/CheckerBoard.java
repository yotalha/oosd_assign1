package task13;

public class CheckerBoard {
    public static void main(String[] args){
        int n = 7;
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                System.out.print(" ");
            }
            for(int j = 0; j < 7; j++){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
