package ArrayBasics.OneDArray;

public class MaximumNumber {
    static void main(String[] args) {
        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int maxVal = arr[0];
        for(int i = 0; i<= n-1; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}
