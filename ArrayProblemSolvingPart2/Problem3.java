//Print extreme elements by 1 position
package ArrayProblemSolvingPart2;

public class Problem3 {

    static void alternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i <= j){
            if( i == j) {
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
        for (int a: arr){
            System.out.println(a + " ");
        }
    }

    static void main(String[] args) {
        int arr [] = {10, 13, 16, 20, 22};
        alternate(arr);
    }
}
