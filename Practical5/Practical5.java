class Practical5 {
    // Factorial using for loop
    public static int getFactorial1(int number) {
        int fact = 1;
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        } else {
            return -1; // Return -1 for invalid input
        }
        return fact;
    }

    // Factorial using while loop
    public static int getFactorial2(int number) {
        int fact = 1;
        int i = 1;
        if (number >= 0) {
            while (i <= number) {
                fact = fact * i;
                i++;
            }
        } else {
            return -1; // Return -1 for invalid input
        }
        return fact;
    }

    // Factorial without using any loop
    public static int getFactorial3(int num) {
        if (num == 1 || num == 0) { // Base case
            return 1;
        } else if (num > 0) {
            return num * getFactorial3(num - 1);
        } else {
            return -1; // Return -1 for invalid input
        }
    }

    // Sum of elements of an array using while loop
    public static int getSum1(int[] num) {
        int i = 0;
        int sum = 0;
        while (i < num.length) {
            sum = sum + num[i];
            i++;
        }
        return sum;
    }

    // Sum of elements of an array using recursion
    public static int getSum2(int[] number, int index) {
        // Base case: if index is less than 0, return 0
        if (index < 0) {
            return 0;
        } else {
            return number[index] + getSum2(number, index - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of -10 using for loop is: " + getFactorial1(-10));
        System.out.println("Factorial of 7 using while loop is: " + getFactorial2(7));
        System.out.println("Factorial of 2 using recursion is: " + getFactorial3(2));

        int[] a = {3,5,9,10};
        System.out.println("Sum of array a = {3,5,9,10} using while loop is: " + getSum1(a));
        int [] c = {10,20,50,50};
        System.out.println("Sum of array c = {10,20,50,50} using recursion is upto index  2: " + getSum2(c,2));
    }
}

