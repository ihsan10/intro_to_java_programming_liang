package chapter1;

/* (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/

public class exercise1_12 {
    public static void main(String[] args) {
        System.out.println("Kilometers = " + (24 * 1.6));   // convert miles into kilometers
        System.out.println("Hours = " + (100 * 60 + 35)/(3600.0));  // convert time in single unit
        System.out.println("Speed = " + (24 * 1.6) / ((100 * 60 + 35)/(3600.0)) + " kph");   // calculate speed
    }
}
