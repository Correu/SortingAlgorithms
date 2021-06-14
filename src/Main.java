public class Main {
    public static void main(String[] args) {
        int[] testArr = {6, 8, 4, 2, 98, 21, 42};

        /*
        InsertionSort iSort = new InsertionSort();
        iSort.sort(testArr);
        iSort.printArray(testArr);
         */

        BubbleSort bSort = new BubbleSort();
        bSort.sort(testArr);
        bSort.printArray(testArr);
    }
}
