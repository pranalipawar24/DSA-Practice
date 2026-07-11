import java.util.Arrays;

public class SortingAlgorithms {
    // Bubble Sort
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) { // for rounds
            for (int j = 0; j < n-i-1; j++) { //for neighbouring nodes
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { //for rounds
            int minIndex = i; // comparison arr[j] and arr[minIndex]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //Insertion Sort
    static void insertionSort(int arr3[]){
        int n = arr3.length;
        for (int i = 1; i < n; i++) {
            //shifting logic
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr3[prev] > curr) {
                arr3[prev + 1] = arr3[prev];
                prev--;
            }
            //place the current value
            arr3[prev + 1] = curr;
        }
    }

    static void main(String[] args) {
        int arr[] = {5, 2, 1, 4, 3};
        int arr2[] = {5, 2, 1, 4, 3};
        int arr3[] = {5, 2, 1, 4, 3};
        bubbleSort(arr);
        selectionSort(arr2);
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        }
    }

