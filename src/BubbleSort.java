public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        int n = arr.length;
        int temp = 0;
        System.out.println("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                // Press Alt+Enter with your caret at the highlighted text to see how
                // IntelliJ IDEA suggests fixing it.
                if (arr[j - 1] > arr[j]) {

                    // Press Shift+F9 to start debugging your code. We have set one breakpoint
                    // for you, but you can always add more by pressing Ctrl+F8.
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("Array after pass " + i + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    Utwórz metodę prywatną na inertoqanie tablicy
    private static void invertArray(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                // Press Alt+Enter with your caret at the highlighted text to see how
                // IntelliJ IDEA suggests fixing it.
                if (arr[j - 1] < arr[j]) {

                    // Press Shift+F9 to start debugging your code. We have set one breakpoint
                    // for you, but you can always add more by pressing Ctrl+F8.
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
