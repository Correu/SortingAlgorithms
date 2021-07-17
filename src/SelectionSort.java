public class SelectionSort implements SortingAlgorithms {

    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < len; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else {

                }
            }
        }
    }

    @Override
    public void printArray(int[] arr) {

    }

    public void swap() {
        
    }
}
