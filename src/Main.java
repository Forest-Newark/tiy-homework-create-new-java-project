/**
 *Created by forestnewark on 3/2/17.

 *Instructions:
 Create a Main class with a main() method.
 In the main() method write ten different expressions and output their values to the console.
 Add detailed comments to every line of code explaining what's going on.
 When done, commit and push your code to Github. Confirm that your code appeared correctly on Github.
 */
public class Main {
    public static void main(String[] args) {

        //Expressions 1 - 7 demonstrate the Arithmetic Operators

        /*
        Expression 1 - Addition Operator (+).  This expression has one operator (+) and two operands (4 & 5). This expression adds the
        operand on the left (4) to the operand on the right (5). This will evaluate to 9. 9 will be printed to the console
         */
        System.out.println(4 + 5);

        /*
        Expression 2 - Subtraction Operator (-). This expression has one operator (-) and two operands (4 & 5). This expression subtracts the
        operand on the left (4) from the operand on the right (5). This will evaluate to -1. -1 will be printed to the console.
         */
        System.out.println(4 - 5);

        /*
        Expression 3 - Multiplication Operator (*). This expression has one operator (*) and two operands (4 & 5). This expression multiplies the
        operand on the left (4) with the operand on the right (5). This will evaluate to 20. 20 will be printed to the console.
         */
        System.out.println(4 * 5);

          /*
        Expression 4 - Division Operator (/). This expression has one operator (/) and two operands (4 & 5). This expression divides the
        operand on the left (4) with the operand on the right (5). This will evaluate to 0 as these are integer values.
        (the decimal point will be dropped). 0 will be printed to the console.
         */
        System.out.println(4 / 5);

          /*
        Expression 5 - Modulo/Remainder (%). This expression has one operator (%) and two operands (10 & 9). This expression divides the
        operand on the left (10) with the operand on the right (9) and returns the remainder. This will evaluate to 1. 1 will be printed to the console.
         */
        System.out.println(10 % 9);


         /*
        Expression 6 - Increment Operator (++). This expression has one operator (++) and one operand (thisIsAnInt). This expression increments the
        the value of the int variable "thisIsAnInt" by 1. Then the variable, thisIsAnInt, is printed to the console using the
        println function. 6 will be printed to the console.
         */
        int thisIsAnInt = 5;
        thisIsAnInt ++;
        System.out.println(thisIsAnInt);

        /*
        Expression 8 - Decrement Operator (--). This expression has one operator (--) and one operand (thisIsAnInt). This expression decreases the
        the value of the int variable "thisIsAnInt" by 1. Then the variable, thisIsAnInt, is printed to the console using the
        println function. 5 will be printed to the console.
         */
        thisIsAnInt --;
        System.out.println(thisIsAnInt);


        //Expression 9 - 13 demonstrate The Relational Operators. They will rely on the following two int variables, a & b:
        int a = 10;
        int b = 20;

        /*
        Expression 9 - Equal Operator (==). This expressions has one operator (==) and two operands (a & b). This expression
        checks to see the variable a is EQUAL to the variable b.  10 does NOT equal 20 so the first println() statement will not run. The
        println() statement in the "else" block will run. "False!" will be printed to the console.
         */

        if (a == b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }


          /*
        Expression 10 - Not-Equal Operator (!=). This expressions has one operator (!=) and two operands (a & b). This expression
        checks to see the variable a is NOT EQUAL to the variable b.  10 is NOT equal to 20 so the first println() statement will run. The
        println() statement in the "else" block will not run. "True!" will be printed to the console.
         */

        if (a != b) {
            System.out.println("True!");
        }else {
            System.out.println("False!");
        }

     /*
        Expression 11 - Greater Than Operator (>). This expressions has one operator (>) and two operands (a & b). This expression
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

        // Logical Operators. They will rely on the following two boolean variables, t & f:
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
            System.out.println("False");
        }

        /*
        Expression 15 - OR Operator (||). This expression has one operator (||) and two operands (t & f). This expression
        checks to see if EITHER t OR f evaluate to true. t evaluates as "true" so the first println() statement will
        run. The println() statement in the else block will not run. "True!" will print to the console.
         */
        if (t && f) {
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




        //Assignment Operators
        int x = 5;
        int y = 10;
        int z;

        /*
        Expression 6 - Assignment Operator (=). This expression has one operator (=) and two operands (thisIsAnInt (of type int) & 5). This expression assigns the
        operand on the right (5) to the operand on the right, an int variable called "thisIsAnInt". Then the variable, thisIsAnInt, is printed
         to the console using the println function. 5 will be printed to the console.
         */





    }
}
