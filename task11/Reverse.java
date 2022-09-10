package task11;

public class Reverse {
    public static void main(String[] args) {
        Reverse aDigits = new Reverse();
        aDigits.printDigits(1542, ',');
    }
    
    private void printDigits(long number, char separator)
    {
        long digit;
        
        System.out.printf("Digits from number %1$d in the reverse order are:\n", number);
        do{
            digit  = number % 10;
            number = number / 10;
            System.out.print(digit);
            if (number > 0) {
                System.out.print(separator);
            }            
        } while(number > 0);
        System.out.println();
    }
}
