package practice;

public class Homework {
    /*Problem 1:

    Create a method that will accept 2 int arrays, a and b, of any length as a
    method parameter, return a new array with the first element of each array.

    Sample Output Example:
    arrayFirstElement([1, 2, 3], [7, 9, 8]) → [1, 7]
    arrayFirstElement([1], [2]) → [1, 2]

    */

    public int[] arrayFirstElement(int[] a, int[] b) {
        return new int[] {a[0],b[0]};

    }

    /*Problem 2:

    Create a method to return a new array containing the middle two elements from the original array.
     The original array will be length 2 or more and will be always even length.

    Sample Output Example:

    arrayMiddle([1, 2, 3, 4]) → [2, 3]
    arrayMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    arrayMiddle([1, 2]) → [1, 2]
    */

    public int[] arrayMiddle(int[] a) {
        return new int[] {a[a.length/2-1], a[a.length/2]};
    }

    /*Problem 3:
    Create a method that will return the summation of the array elements.
    Sample Output Example:

    arraySummation([1, 2, 3, 4]) → 10
    arraySummation([1, 2]) → 3
    */

    public int arraySummation(int[] a) {
     int sum = 0;
     for(int number: a) {
         sum += number;
     }
     return sum;
    }


}
