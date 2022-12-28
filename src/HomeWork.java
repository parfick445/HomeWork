import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        replacingIntegers();
        fillingAnEmptyArray();
        replacementByMultiplicationByTwo();
        twoDimensionalIntegerArray();
        minimumAndMaximumValuesOfTheArray();
    }

    private static void replacingIntegers() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 0};
        for (int i : a) {
            if (i == 1) i--;
            else i++;
            System.out.print(" " + i);
        }
        System.out.println();

//        Другой вариант

        for (int i : a) {
            --i;
            if (i == -1) i = 1;
            System.out.print(" " + i);
        }
        System.out.println("\n_______________________");
    }

    private static void fillingAnEmptyArray() {
        int[] emptyArray = new int[8];
        for (int i = 0; i < 8; i++) {
            int y = i * 3;
            emptyArray[i] = y;
            System.out.print(" " + emptyArray[i]);
        }
        System.out.println("\n_______________________");
    }

    private static void replacementByMultiplicationByTwo() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : a) {
            if (i < 6) i *= 2;
            System.out.print(" " + i);
        }
        System.out.println("\n_______________________");
    }

    private static void twoDimensionalIntegerArray() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            a[i][i]++;
            for (int v = 0; v < a[0].length; v++) {
                if (i + v == 4) a[i][v]++;
                if (a[i][v] > 1) a[i][v]--;
                System.out.print(" " + a[i][v]);
            }
            System.out.println();
        }
        System.out.println("_______________________");
    }

    private static void minimumAndMaximumValuesOfTheArray() {
        int[] numbers = {134, 22, 15, 434, 34, 23, 7, 38, 59, 1250};
        for (int a = 0; a <= 9; a++) System.out.print(numbers[a] + ", ");
        System.out.println("\n" + Arrays.stream(numbers).max() + "\n" + Arrays.stream(numbers).min());
    }
}
