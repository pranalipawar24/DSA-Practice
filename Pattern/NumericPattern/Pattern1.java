package Pattern.NumericPattern;

public class Pattern1 {
    void main(){
        int n = 5;
        for(int row=1; row<=n; row++){
            for(int col =1; col<=row; col++){
                System.out.print(col+"  ");
            }
            System.out.println();
        }
    }
}
