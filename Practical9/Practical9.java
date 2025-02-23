class Practical9{

    public static int iterativeFactorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static int recursiveFactorial(int n) {
        return (n > 1) ? n * recursiveFactorial(n - 1) : 1;
    }

    public static void concatUsingString(String[] arr) {
        String result = "";
        for (String s : arr) {
            result += s;
        }
    }

    public static void concatUsingBuffer(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
    }

    public static void concatUsingBuilder(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
    }
        public static void main(String[] args) {
        long start, end;
        int iterationTime = 0, recursionTime = 0;
        long stringTime = 0, bufferTime = 0, builderTime = 0;
        
        int numSize = Integer.parseInt(args[0]);  
        int[] numArray = new int[numSize];

        // Generate random numbers using System.nanoTime()
        for (int i = numSize - 1; i >= 0; i--) {
            numArray[i] = (int) (System.nanoTime() % 100 + 1); 
        }

        // Performance test for factorial
   for (int i = 0; i < numArray.length; i++) {  
    int num = numArray[i]; 

    start = System.nanoTime();
    iterativeFactorial(num);
    end = System.nanoTime();
    iterationTime += (end - start);

    start = System.nanoTime();
    recursiveFactorial(num);
    end = System.nanoTime();
    recursionTime += (end - start);
}


        System.out.println("Avg time for Iterative Factorial: " + (iterationTime / numSize));
        System.out.println("Avg time for Recursive Factorial: " + (recursionTime / numSize));

        // Performance test for string operations
        int strSize = Integer.parseInt(args[1]);  
        String[] strArray = new String[strSize];

        for (int i = strSize - 1; i >= 0; i--) {
            strArray[i] = String.valueOf(System.nanoTime() % 100 + 1);
        }

        start = System.nanoTime();
        concatUsingString(strArray);
        end = System.nanoTime();
        stringTime = end - start;

        start = System.nanoTime();
        concatUsingBuffer(strArray);
        end = System.nanoTime();
        bufferTime = end - start;

        start = System.nanoTime();
        concatUsingBuilder(strArray);
        end = System.nanoTime();
        builderTime = end - start;

        System.out.println("Avg time for String Concatenation: " + (stringTime / strSize));
        System.out.println("Avg time for StringBuffer Concatenation: " + (bufferTime / strSize));
        System.out.println("Avg time for StringBuilder Concatenation: " + (builderTime / strSize));
    }
}
