package ArrayBasics.OneDArray;

public class MinimumNumber {
    static void main(String[] args) {
        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int minVal = arr[0];
        for(int i = 0; i<= n-1; i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
}
