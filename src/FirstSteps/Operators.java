package FirstSteps;

public class Operators {
    public static void main(String[] args) {
        /*
        Arithmetic Operators
        + - * / %
         */

        int a = 25;
        int b = 8;
        System.out.println("Arithmetic Operators");

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /*
        Unary Operator
        it is used on single operand
        is contains two types
        pre and post
        */
        System.out.println("Unary Operator");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        /*
        Shift Operator
        Left shift (m << n)
        in left shift, the bits of m are left shifted by n times
        value of m increases in left shift

        Right shift (m >> n)
        in right shift, the bits of m are right shifted by n times
        value of m decreases in right shift

        */

        System.out.println("Shift Operator");
        System.out.println(14 << 3);     //Left shift
        System.out.println(14 >> 3);     //Right shift


        /*
        Relational Operator
        < > <= >= == !=
         */

        /*
        Logical Operator
        && -> if both operands true -> true
        || -> if least one operand is true -> true
        ! -> results true if false, vice versa
         */

        /*
        bitwise operator
        bitwise AND &
        if both bits are 1, it results 1

        bitwise exclusive OR ^ (XOR)
        if either bits are 1, it results 1

        bitwise inclusive OR |
        if bits are different, it results 1, else it results 0
        */

        System.out.println("Bitwise Operator");
        System.out.println(2 & 3);
        System.out.println(7 | 8);
        System.out.println(8 ^ 14);


        /*
        Ternary Opertor
        ?:
         */
        System.out.println("Ternary Operator");
        int ter = (7 < 9) ? 35 : 89;
        System.out.println(ter);


        /*
        Assignment Operators

         */

        System.out.println("Assignment Operator");
        int k = 90;
        k += 90;
        System.out.println(k);
        k -= 90;
        System.out.println(k);
        k *= 10;
        System.out.println(k);
        k /= 9;

    }
}
