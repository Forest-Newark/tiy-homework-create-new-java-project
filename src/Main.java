/**
 *Created by forestnewark on 3/2/17.

 *Instructions:
 Create a Main class with a main() method.
 In the main() method write ten different expressions and output their values to the console.
 Add detailed comments to every line of code explaining what's going on.
 When done, commit and push your code to Github. Confirm that your code appeared correctly on Github.

 *Outline
 * Arithmetic Operators (Expressions #1-7)
 * Relational Operators (Expressions #8-13)
 * Logical Operators (Expressions #14-16)
 * Assignment Operators (#17-22)

 */


public class Main {
    public static void main(String[] args) {

        //Expressions 1 - 7 demonstrate the Arithmetic Operators.
        int p = 10;
        int q = 9;

        /*
        Expression 1 - Addition Operator (+).  This expression has one operator (+) and two operands (p & q). This expression adds the
        operand on the left (p) to the operand on the right (q). This will evaluate to 19. 19 will be printed to the console
         */
        System.out.println(p + q);

        /*
        Expression 2 - Subtraction Operator (-). This expression has one operator (-) and two operands (p & q). This expression subtracts the
        operand on the left (p) from the operand on the right (q). This will evaluate to 1. 1 will be printed to the console.
         */
        System.out.println(p - q);

        /*
        Expression 3 - Multiplication Operator (*). This expression has one operator (*) and two operands (p & q). This expression multiplies the
        operand on the left (p) with the operand on the right (q). This will evaluate to 90. 90 will be printed to the console.
         */
        System.out.println(p * q);

          /*
        Expression 4 - Division Operator (/). This expression has one operator (/) and two operands (p & q). This expression divides the
        operand on the left (p) with the operand on the right (q). This will evaluate to 1 as these are integer values.
        (the decimal point will be dropped). 1 will be printed to the console.
         */
        System.out.println(p / q);

          /*
        Expression 5 - Modulo/Remainder (%). This expression has one operator (%) and two operands (10 & 9). This expression divides the
        operand on the left (10) with the operand on the right (9) and returns the remainder. This will evaluate to 1. 1 will be printed to the console.
         */
        System.out.println(p % q);


         /*
        Expression 6 - Increment Operator (++). This expression has one operator (++) and one operand (thisIsAnInt). This expression increments the
        the value of the int variable "p" by 1. Then the variable is printed to the console using the
        println function. 11 will be printed to the console.
         */
        p++;
        System.out.println(p);

        /*
        Expression 7 - Decrement Operator (--). This expression has one operator (--) and one operand (p). This expression decreases the
        the value of the int variable "p" by 1. Then the variable is printed to the console using the
        println function. 10 will be printed to the console.
         */
        p--;
        System.out.println(p);




        //Expression 8 - 13 demonstrate the Relational Operators.
        int a = 10;
        int b = 20;

        /*
        Expression 8 - Equal Operator (==). This expressions has one operator (==) and two operands (a & b). This expression
        checks to see the variable a is EQUAL to the variable b.  10 does NOT equal 20 so the first println() statement will not run. The
        println() statement in the "else" block will run. "False!" will be printed to the console.
         */

        if (a == b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }


          /*
        Expression 9 - Not-Equal Operator (!=). This expressions has one operator (!=) and two operands (a & b). This expression
        checks to see the variable a is NOT EQUAL to the variable b.  10 is NOT equal to 20 so the first println() statement will run. The
        println() statement in the "else" block will not run. "True!" will be printed to the console.
         */

        if (a != b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

     /*
        Expression 10 - Greater Than Operator (>). This expressions has one operator (>) and two operands (a & b). This expression
        checks to see the variable a is GREATER THAN the variable b.  10 is LESS THAN  20 so the first println() statement will not run. The
        println() statement in the "else" block will run. "False!" will be printed to the console.
         */

        if (a > b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

        /*
        Expression 11 - Less Than Operator (<). This expressions has one operator (<) and two operands (a & b). This expression
        checks to see the variable a is LESS THAN the variable b.  10 is LESS THAN  20 so the first println() statement will run. The
        println() statement in the "else" block will not run. "True!" will be printed to the console.
         */

        if (a < b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

        /*
        Expression 12 - Less Than Or Equal To  Operator (<=). This expressions has one operator (<=) and two operands (a & b). This expression
        checks to see the variable a is LESS THAN OR EQUAL TO the variable b.  10 is LESS THAN  20 so the first println() statement will run. The
        println() statement in the "else" block will not run. "True!" will be printed to the console.
         */

        if (a <= b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

        /*
        Expression 13 - Greater Than Or Equal Operator (>=). This expressions has one operator (>=) and two operands (a & b). This expression
        checks to see the variable a is GREATER THAN OR EQUAL TO the variable b.  10 is LESS THAN  20 so the first println() statement will not run. The
        println() statement in the "else" block will run. "False!" will be printed to the console.
         */

        if (a >= b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }



        //Expression 14 - 16 demonstrate the Logical Operators.
        Boolean t = true;
        Boolean f = false;

        /*
        Expression 14 - AND Operator (&&). This expression has one operator (&&) and two operands (t & f). This expression
        checks to see if BOTH t and f evaluate as the boolean true. f evaluates as "false" so the first println() statement will NOT
        run. The println() statement in the else block will run. "False!" will print to the console.
         */
        if (t && f) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

        /*
        Expression 15 - OR Operator (||). This expression has one operator (||) and two operands (t & f). This expression
        checks to see if EITHER t OR f evaluate to true. t evaluates as "true" so the first println() statement will
        run. The println() statement in the else block will not run. "True!" will print to the console.
         */
        if (t || f) {
            System.out.println("True!");
        }else {
            System.out.println("False");
        }

                /*
        Expression 16 - NOT Operator (!). This expression has one operator (!) and one operands  (f). This expression
        checks to see if the OPPOSITE is true (mind blowing). f evaluates as "false",however we are asking if (f) is NOT true
         (which is true...) so the first println() statement will run. The println() statement in the else block will not run.
         "True!" will print to the console.
         */
        if (!f) {
            System.out.println("True!");
        }else {
            System.out.println("False");
        }




        //Expression 17 - 22 demonstrate the Assignment Operators.
        int x = 5;
        int y = 10;
        int z;

        /*
        Expression 17 - Assignment Operator (=). This expression has one operator (=) and two operands (z & 15). This expression assigns the
        operand on the right (15) to the operand on the left (z). Then the variable is printed
         to the console using the println function. 15 will be printed to the console.
         */
        z = 15;
        System.out.println(z);

        /*
        Expression 18 - Add And Assignment Operator (+=). This expression has one operator (+=) and two operands (z & 5). This expression first adds the
        operand on the right (5) to the operand on the left (z) then assigns the result to to operand on the left(z). Then the variable is printed
         to the console using the println function. 20 will be printed to the console.
         */

        System.out.println(z += 5);

        /*
        Expression 19 - Subtract And Assignment Operator (-=). This expression has one operator (-=) and two operands (z & 5). This expression first subtracts the
        operand on the right (5) from the operand on the left (z) then assigns the result to the operand on the left(z). The variable is printed
         to the console using the println function. 15 will be printed to the console.
         */

        System.out.println(z -= 5);


        /*
        Expression 20 - Multiply And Assignment Operator (*=). This expression has one operator (*=) and two operands (x & 2). This expression first multiplies the
        operand on the left (x) with the operand on the right (2) then assigns the result to the operand on the left(z). The variable is printed
         to the console using the println function. 10 will be printed to the console.
         */

        System.out.println(x *= 2);

        /*
        Expression 21 - Divide And Assignment Operator (/=). This expression has one operator (/=) and two operands (y & 2). This expression first divides the
        operand on the left (x) with the operand on the right (2) then assigns the result to the operand on the left(z). The variable is printed
         to the console using the println function. 5 will be printed to the console.
         */

        System.out.println(y /= 2);

        /*
        Expression 22 - Modulo And Assignment Operator (%=). This expression has one operator (%=) and two operands (y & 2). This expression first divides the
        operand on the left (x) with the operand on the right (2) then assigns the REMAINDER to the operand on the left(z). The variable is printed
         to the console using the println function. 1 will be printed to the console.
         */

        System.out.println(y %= 2);

    }
}
