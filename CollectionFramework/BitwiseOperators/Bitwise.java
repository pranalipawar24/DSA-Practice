package CollectionFramework.BitwiseOperators;

public class Bitwise {
    static void main(String[] args) {

        //Basics
        int a = 5;
        int b = 6;
        System.out.println("AND Operation Result " +(a & b));

        System.out.println("OR Operation Result " +(a | b));

        System.out.println("XOR Operation Result " +(a ^ b));

        System.out.println("XOR Operation Result " +(~a));

        System.out.println("Left Shift " +(3 << 2)); // 3 * (2 * 2)

        System.out.println("Right Shift " +(16 >> 2)); // 16 / (2 * 2)

        //Even or Odd
        int n1 = 45;
        if ( (n1 & 1) == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

        //count no. of bit 1's in a number
        int n = 6;
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Bit Count is " + count);

        // power of Two
        int num = 16;
        if ((num & (num - 1)) == 0) {
            System.out.println("Power of Two");
        } else {
            System.out.println("Not a power of 2");
        }

        //Swap Using XOR
        int num1 = 5;
        int num2 = 8;

        System.out.println("Values before swapping " +num1 +" and " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Values after swapping " +num1 +" and " + num2);

        //find the element that appears only once problem using Bitwise XOR (^).
        // Logic:
        // a ^ a = 0
        // a ^ 0 = a
        int [] arr = { 10, 24, 17, 24, 10, 13, 17 };
        int result = 0;
        for (int i  : arr){
            result =  result ^ i;
        }
        System.out.println("Number occuring once: " +result);

        int number = 10;
        System.out.println(number & (number - 1)); //Remove last set bit
        System.out.println(number & (-number)); //extract last set bits from a number
    }
}
