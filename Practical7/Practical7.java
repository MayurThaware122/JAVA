class Practical7
{
    static int rowCount; 
    static int colCount; 
    static int mid;
    // my name methord
    public static void MAYUR(int num)
    {
         rowCount = 5 + num; // base value
         colCount =  5 + num; // base value
        if(rowCount % 2 == 0)rowCount++;
        if(colCount % 2 == 0)colCount++; 
         mid = rowCount / 2 + 1;
         for (int row = 1; row <= rowCount; row++)// loop for row  
         {
            printM(row);
            System.out.print("  "); // Space between letters
            printA(row);
            System.out.print(""); // Space between letters
            printY(row);
            System.out.print("    "); // Space between letters
            printU(row);
            System.out.print("    "); // Space between letters
            printR(row);
            System.out.println();
         }
    }
    // Letter M
    public static void printM(int row)
    {
        for(int col = 1;col <= colCount; col++)//for column
            {
                if(col == 1 || col == colCount || (col == colCount - row * 1 + 1 && row < mid) || (row <= mid &&(row == col)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
    }
    // Letter A
    public static void printA(int row)
    {
        for(int col = 1; col <= 2 * colCount; col++)//for column
            {
                if((row == rowCount - col + 1 && row > 1)|| col == colCount + row -1 || (row == mid && col > rowCount - mid && col < rowCount + mid)) /*(col > num - row && col < num +row)*/
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
    }
    
    // Letter Y 
    public static void printY(int row)
    {
        for(int col = 1; col <= colCount; col++)
            {
                // condition 
                if(row <= rowCount / 2 && (row == col || col == colCount - row * 1 + 1) || row > rowCount/2 && col == colCount /2 + 1)
                {
                    System.out.print("*");
                }
                // to print spaces
                else
                {
                    System.out.print(" ");
                }
            }
    }
    // Letter U
    public static void printU(int row)
    {
        for(int col = 1;col <= colCount; col ++)
        {
            if((col == 1 && row < rowCount) || (col == colCount && row < rowCount) || (col != 1 && col != colCount && row == rowCount))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
        }
    }     
    // Letter R
    public static void printR(int row)
    {
        for(int col = 1;col <= colCount; col++)
                {
                    if(col == 1 || (row == 1 && col != colCount) || (row == mid && col != colCount) || (col == colCount && row != 1 && row < mid) || (row > mid && col > mid && row == col))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
    }

    public static void main(String [] args)
    {
        MAYUR(1);
    }
}
