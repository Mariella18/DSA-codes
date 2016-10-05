import java.util.*;
public class FindMaxInt {
 public static void main(String[] args) {
  int[] numbers = { /* input integer values*/ 1, 3, 5, 15, 20};

  // for loop, print all numbers in the array
  for(int i = 0; i < numbers.length; i++) {
   System.out.println(numbers[i] + ", ");
  }

  // add all numbers
  int sum = 0;
  for (int i = 0; i < numbers.length; i++) {
   sum = sum + numbers[i];
  }
  // get the average
  double average = sum / numbers.length;
  System.out.println("Total = " + sum);
  System.out.println("Average = " + average);

  // find the largest number
  // compare first number to next, then assign as max
  int max = numbers[0];
  for (int i = 1; i < numbers.length; i++){ 
   if (numbers[i] > max) max = numbers[i];
  }
  System.out.println("Max = " + max);
 }
}