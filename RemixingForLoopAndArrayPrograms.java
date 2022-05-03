/*
 * Stella Castura
 * 5/3/2022
 * RemixingForLoopAndArrayPrograms.java
 * Remixing code given in Brightspace
 */
package remixing.pkgfor.loop.and.array.programs;
import java.util.Scanner;
/**
 *
 * @author stcas7054
 */
public class RemixingForLoopAndArrayPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Program 1
        System.out.println("-------Program 1-------");
        //Allows acess to the scanner thoughout all three programs.
        Scanner keyedInput = new Scanner (System.in);
        //initializes an array called numbers that can hold twenty integers
        int [ ] numbers = new int [20];
        //initializes a total and sets it to zero so you can add numbers to it
        int total = 0;
        //Asks the user for twenty numbers
        System.out.println("Enter twenty integers and they will be added together:");
        //runs through values of i from 0 to 19, for 20 total numbers
        //Each of these is the index of the next varible scanned
        //This basically takes exactly what the user imputs and puts it into an array
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //This totals all the numbers in the array
        //It goes through values of i from 0 to 19, and adds the values with the corresponding index to the total
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        //Prints out the sum
        System.out.println("The sum of those numbers is:");
        System.out.println(total);  
        
        //Program 2
        System.out.println("-------Program 2-------");
        //Creates a new array called friends that holds five string values
        String [ ] friends = new String [5];
        //Asks for names
        System.out.println("Enter the names of five friends:");
        //Takes the first five inputs and turns them into an array
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        //Output names
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[2]);
        System.out.println("Third: " + friends[3]);  
        System.out.println("Fourth" + friends[4]);
        
        //Program 3
        System.out.println("-------Program 3-------");
        //Creates an array named marks that holds the double values 65.8, 44.8, 88.6, 34.7, 54.1, 34.8, 99.6, 43.6 and 43.2
        double [ ] marks = {65.8, 44.8, 88.6, 34.7, 54.1, 34.8, 99.6, 43.6, 43.2};
        //This will hold the total number of marks
        double total2 = 0;
        //and this will hold the average
        double average;
        //output marks
        System.out.println("These are the marks:");
        //goes from index zero to index eight, i does the counting, and outputs the corresponding value
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        //Repeats lines 75-78, going through each value, but this time adds the grade to the total
        for (int i = 0; i<=8; i= i + 1)
        {
            total2 += marks[i];
        }
        //Divides the total by 9 to get an average
        average = total2/9;
        //Multiply by 10 so you can get 2 decimals
        average = average * 10;
        //rounds so there will only be 2 decimals
        average = Math.round(average);
        //Divides by 10 so it isn't greaer than 100
        average = average/10;
        //print average mark
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
