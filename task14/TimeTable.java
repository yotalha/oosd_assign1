package task14;

public class TimeTable {
    public static void main(String[] args) {
        TimeTable aTimeTable = new TimeTable();
        aTimeTable.printTimeTable(9);
    }
    
    private void printTimeTable(int n)
    {
        for(int i = -1; i <= n; i++) 
        {
            if (i == -1) {
                System.out.print("\t|");
            }
            else if (i == 0) {
                System.out.print("------------");
            }
            else if (i > 0) {                    
                System.out.printf("%1$d\t|", i);    
            }
            
            for(int j = 1; j <= n; j++)
            {        
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                }
                else if (i == 0) {
                    System.out.print("--------");
                    continue;
                }
                
                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }
}
