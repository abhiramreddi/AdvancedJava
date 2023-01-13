package FirstSteps;

public class Casting {
    public static void main(String[] args) {
        int a = 90;
        double d = 50 + a;
        System.out.println(d);          // this is widening conversion

        int b = 90;
        byte k = 8;
        k = (byte) (k + b);             // this is narrowing conversion

    }
}


/**
 * Type casting *  is the process of converting one data type into another data type
 * It is of two types
 * widening conversion
 * narrowing conversion
 * <p>
 * Widening is the process of converting or storing smaller data types into larger data types
 * it is done automatically by the Computer
 * <p>
 * <p>
 * <p>
 * Narrowing is the process of converting or storing larger data types into smaller data types
 * it is done manually by specifying the desired data type front of the variable
 */