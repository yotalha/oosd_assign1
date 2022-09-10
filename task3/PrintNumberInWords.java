package task3;

public class PrintNumberInWords {
    public static void main(String[] args) {
        useNestedIf(3);
        useSwitchCase(6);
        useArrayCase(11);
    }

    public static void useNestedIf(int number)
    {
        String numberStr = null;
        if (0 == number) {
            numberStr = "ZERO";
        } else if (1 == number) {
            numberStr = "ONE";
        } else if (2 == number) {
            numberStr = "TWO";
        } else if (3 == number) {
            numberStr = "THREE";
        } else if (4 == number) {
            numberStr = "FOUR";
        } else if (5 == number) {
            numberStr = "FIVE";
        } else if (6 == number) {
            numberStr = "SIX";
        } else if (7 == number) {
            numberStr = "SEVEN";
        } else if (8 == number) {
            numberStr = "EIGHT";
        } else if (9 == number) {
            numberStr = "NINE";
        } else {
            numberStr = "OTHER";
        }
        System.out.println("Nested if-else: " + numberStr);
    }

    public static void useSwitchCase(int number)
    {
        String numberStr = null;
        switch (number) {
            case 0:  numberStr = "ZERO";  break;
            case 1:  numberStr = "ONE";   break;
            case 2:  numberStr = "TWO";   break;
            case 3:  numberStr = "THREE"; break;
            case 4:  numberStr = "FOUR";  break;
            case 5:  numberStr = "FIVE";  break;
            case 6:  numberStr = "SIX";   break;
            case 7:  numberStr = "SEVEN"; break;
            case 8:  numberStr = "EIGHT"; break;
            case 9:  numberStr = "NINE";  break;
            default: numberStr = "OTHER"; break;
        }
        System.out.println("Switch case: " + numberStr);
    }

    public static void useArrayCase(int number){
        String[] arr = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        boolean check = true;
        for(int i = 0; i < 10; i++){
            if(number == i){
                System.out.println("Array case: " + arr[i]);
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Array case: OTHER");
        }
    }
}
