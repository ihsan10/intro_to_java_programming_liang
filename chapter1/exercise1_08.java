package chapter1;

/*
(Area and perimeter of a circle) 
Write a program that displays the area and perimeter of a circle that has a radius of 5.5 
using the following formula:
    perimeter = 2 * radius * pi
    area = radius * radius * pi
*/

public class exercise1_08 {
    public static void main(String[] args) {
        System.out.println("Perimeter = " + (2 * 5.5 * (22.0/7)));
        System.out.println("Area = " + (5.5 * 5.5 * (22.0/7)));
    }
}

