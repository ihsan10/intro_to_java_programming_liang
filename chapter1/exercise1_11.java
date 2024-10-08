package chapter1;

/*
(Population projection) 
The U.S. Census Bureau projects population based on the following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days. 
Hint: In Java, if two integers perform division, the result is an integer. 
The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
To get an accurate result with the fractional part, 
one of the values involved in the division must be a number with a decimal point.
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/

public class exercise1_11 {
    public static void main(String[] args) {
        System.out.println("Year 1 Projection:");
        System.out.println(
            312032486 + (   // Current population
              ((365 * 24 * 60 * 60) / 7)    // Number of births per year
            - ((365 * 24 * 60 * 60) / 13)   // Number of deaths per year
            + ((365 * 24 * 60 * 60) / 45)   // Number of immigrants per year
            * 1)    // Year of projection
            );

        System.out.println("Year 2 Projection:");
        System.out.println(
            312032486 + (   // Current population
              ((365 * 24 * 60 * 60) / 7)    // Number of births per year
            - ((365 * 24 * 60 * 60) / 13)   // Number of deaths per year
            + ((365 * 24 * 60 * 60) / 45)   // Number of immigrants per year
            * 2)    // Year of projection
            );

        System.out.println("Year 3 Projection:");
        System.out.println(
            312032486 + (   // Current population
              ((365 * 24 * 60 * 60) / 7)    // Number of births per year
            - ((365 * 24 * 60 * 60) / 13)   // Number of deaths per year
            + ((365 * 24 * 60 * 60) / 45)   // Number of immigrants per year
            * 3)    // Year of projection
            );

        System.out.println("Year 4 Projection:");
        System.out.println(
            312032486 + (   // Current population
              ((365 * 24 * 60 * 60) / 7)    // Number of births per year
            - ((365 * 24 * 60 * 60) / 13)   // Number of deaths per year
            + ((365 * 24 * 60 * 60) / 45)   // Number of immigrants per year
            * 4)    // Year of projection
            );

        System.out.println("Year 5 Projection:");
        System.out.println(
            312032486 + (   // Current population
              ((365 * 24 * 60 * 60) / 7)    // Number of births per year
            - ((365 * 24 * 60 * 60) / 13)   // Number of deaths per year
            + ((365 * 24 * 60 * 60) / 45)   // Number of immigrants per year
            * 5)    // Year of projection
            );
    }
}

