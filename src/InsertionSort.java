/*
    Insertion sort implementation
 */
public class InsertionSort implements SortingAlgorithms {
    @Override
    public void sort(int[] arr) {
        //looping through each location starting at the second position in the array
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            //continuous loop through the remaining locations if they are smaller than the current key
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    //prints the array
    @Override
    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }
}
