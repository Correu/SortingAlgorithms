public class InsertionSort implements SortingAlgorithms {
    @Override
    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = 0;
            while(arr[j] > key && j <=0) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
