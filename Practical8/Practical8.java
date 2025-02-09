class Practical8 {
    public static void pattern1(int size) {
        int num = size / 2 + 1;
        printUpperDiamond(num, 1);
        printLowerDiamond(num - 1, num);
        printVerticalPlus(size, 1);
    }

    public static void printUpperDiamond(int num, int row) {
        if (row > num) return;
        printSpaces(num - row);
        printStars(2 * row - 1);
        System.out.println();
        printUpperDiamond(num, row + 1);
    }

    public static void printLowerDiamond(int row, int num) {
        if (row == 0) return;
        printSpaces(num - row);
        printStars(2 * row - 1);
        System.out.println();
        printLowerDiamond(row - 1, num);
    }

    public static void printVerticalPlus(int size, int row) {
        if (row > size) return;
        printSpaces(2);
        System.out.println("+");
        printVerticalPlus(size, row + 1);
    }

    public static void pattern2(int size) {
        printAscendingTriangle(1, size + 1);
        printDescendingTriangle(size, 1);
    }

    private static void printAscendingTriangle(int row, int size) {
        if (row > size) return;
        printStars(row);
        System.out.println();
        printAscendingTriangle(row + 1, size);
    }

    private static void printDescendingTriangle(int row, int min) {
        if (row < min) return;
        printStars(row);
        System.out.println();
        printDescendingTriangle(row - 1, min);
    }

    public static void pattern3(int size) {
        printRightAlignedTriangle(1, size + 1);
        printCenteredHorizontalLine(size + 1);
        printInvertedSlashTriangle(1, size + 1);
    }

    public static void printRightAlignedTriangle(int row, int size) {
        if (row >= size) return;
        printSpaces(size - row);
        printStars(row);
        System.out.println();
        printRightAlignedTriangle(row + 1, size);
    }

    public static void printCenteredHorizontalLine(int size) {
        for (int col = 1; col <= size; col++) {
            System.out.print("+");
        }
        System.out.println();
    }

    public static void printInvertedSlashTriangle(int row, int size) {
        if (row > size) return;
        printSpaces(row);
        printSlashes(size - row);
        System.out.println();
        printInvertedSlashTriangle(row + 1, size);
    }

    public static void printSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void printStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        printStars(count - 1);
    }

    public static void printSlashes(int count) {
        if (count == 0) return;
        System.out.print("/");
        printSlashes(count - 1);
    }

    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(3);
        System.out.println();
        pattern3(3);
    }
}
