/*
(Algebra: solve 2 * 2 linear equations) 
You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:

    ax + by = e
    cx + dy = f

     ed - bf         af - ec
x = ---------   y = ---------    
     ad - bc         ad - bc

Write a program that solves the following equation and displays the value for x and y:
    3.4x + 50.2y = 44.5
    2.1x + .55y = 5.9

*/

package chapter1;



public class exercise1_13 {
    public static void main(String[] args) {
        System.out.println("a = 3.4");
        System.out.println("b = 50.2");
        System.out.println("c = 2.1");
        System.out.println("d = 0.55");
        System.out.println("e = 44.5");
        System.out.println("f = 5.9");
        System.out.println("-------------------");
        System.out.println("x :");  // finding out the value of x using Cramer's rule
        System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.println("y :");  // finding out the value of y using Cramer's rule
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
    }
}
