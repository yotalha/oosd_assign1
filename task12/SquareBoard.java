package task12;

public class SquareBoard {
    public static void main(String[] args) {
        SquareBoard aSquareBoard = new SquareBoard();
        aSquareBoard.printSquareBoard(5);
    }
    
    
    private void printSquareBoard(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
