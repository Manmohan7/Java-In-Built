import java.util.*;

class Array {
    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 6, 7, 20};

        // binarySearch(int[] arr, int key) - returns index
        // if not found, returns -(index) - 1
        // binary search is valid in sorted array
        Arrays.binarySearch(arr, 2);

        // binarySearch(int[] arr, int start, int end, int key)
        // returns index
        // if not found, returs -(index) - 1
        // throws IllegalArgument Exception if start > end
        // throws ArrayindexOutOfBounds if start < 0 || end > arr.length
        Arrays.binarySearch(arr, 0, arr.length, 4);

        // copyOf(int[] arr, int newLength) - returns int[]
        // makes a copy of arr having length newLength
        // if newLength > arr.length then it is filled with 0
        // throws NegativeArraySize Exception - if newLength is negative
        // throws NullPointer Exception - if arr is null
        Arrays.copyOf(arr, 10);

        // copyOfRange(int[] arr, int from, int to) - returns int[]
        // throws ArrayIndexOutOfBounds - if from < 0 || to > arr.length
        // throws IllegalArgument Exception - if from > to
        // throws NullPointerException - if arr is null
        Arrays.copyOfRange(arr, 2, 5);

        // equals(int[] a1, int[] a2) - returns boolean
        // returns true if both arrays contains same no of
        // elements at same index
        Arrays.equals(arr, arr2);

        // fill(int[] arr, int value) - returns void
        // assigns the value to each element of the arr
        Arrays.fill(arr, 5);

        // fill(int[] arr, int start, int end, int value) - returns void
        // assigns the value to each element of array from start to end
        // throws IllegalArgument Exception - start > end
        // throws ArrayIndexOutOfBounds - start < 0 || end > arr.length
        Arrays.fill(arr, 0, 2, 7);

        // sort(int[] arr) - returns void
        // sorts the array in ascending order
        Arrays.sort(arr);

        // sort(int[] arr, int start, int end) - returns void
        // sorts the array from start to end
        // throws IllegalArgument Exception - if start > end
        // throws ArrayIndexOutOfBounds Exception - if start < 0 || end > arr.length
        Arrays.sort(arr, 0, arr.length - 2);

        // toString(int[] arr) - returns String
        // returns string representation of array separated by commas (,)
        Arrays.toString(arr);

    }
}
