package ArrayBasics.OneDArray;
import java.util.Scanner;
public class MultiplicationOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 1;
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        for(int i=0; i <= n-1; i++){
            sum = sum * arr[i];
        }
        System.out.println(sum);
    }
}

