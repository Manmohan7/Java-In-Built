import java.lang.*;
import java.util.*;

class Stringbuilder {
    public static void main(String[] args) {

        // constructor - creates an empty StringBuilder with intial capacity of 16 chars
        StringBuilder sb = new StringBuilder();

        // constructor - creates a StringBuilder object with minimum capacity sent as parameter
        StringBuilder sb2 = new StringBuilder(18);

        // constructor - creates a StringBiulder with contents of String
        String str = "Hello";
        StringBuilder sb3 = new StringBuilder(str);

        // append(Object obj) - returns StringBuilder
        // takes in any type of input such as int, boolean, char, String etc
        // and adds it at the end of the StringBuilder object
        sb.append(str);
        sb.append(" World");
        sb.append(21);
        System.out.println(sb);

        // capacity() - returns int
        // tells the capacity of the StringBuilder object
        System.out.println(sb.capacity());

        // charAt(int index) - returns char
        // returns the char present at index
        // throws IndexOutOfBoundsException if index > length
        System.out.println(sb.charAt(2));

        // delete(int start, int end) - returns StringBuilder
        // deletes all the elements starting from start (inclusive) to end (exclusive)
        // if start == end then no change is done
        // throws StringIndexOutOfBounds Exception if start is negative or
        // start > length or start > end
        System.out.println(sb.delete(0, 6));

        // deleteCharAt(int index) - returns StringBuilder
        // deletes char at index
        // throws StringIndexOutOfBounds Exception if index is negative or > or = to length
        System.out.println(sb.deleteCharAt(5));

        // ensureCapacity(int minimum) - returns void
        // ensures the capacity is atleast equal to the minimum specified
        // else it allocates memory
        // if minimum < 0, it doesnot do anything
        sb.ensureCapacity(15);

        // getChars(int srcBegin, int srcEnd, char[] dest, int destBegin) - returns void
        // copies the chars starting from srcBegin (inclusive) to srcEnd (exclusive) into
        // dest array starting form index destBegin and ending at destBegin + srcEnd - srcBegin - 1
        // throws NullPointer Exception - if dest is null
        // throws IndexOutOfBounds Exception - if srcBegin < 0 || destBegin < 0 ||
        // srcBegin > srcEnd || srcEnd > this.length || destBegin + srcEnd - srcBegin > dest.length
        char[] arr = new char[20];
        sb.getChars(0, 5, arr, 0);
        System.out.println(arr);

        // indexOf(String str) - returns int
        // returns the index of starting position of substring if str exsists in stringBuilder
        // if not found returns -1
        // throws NullPointer Exception if str == null
        System.out.println(sb.indexOf("ld"));

        // indexOf(String str, int begin) - returns int
        // returns the index of starting position of str if str is found in stringBuilder starting 
        // from begin
        // else returns -1
        // throws NullPointer Exception if str == null
        System.out.println(sb.indexOf("ld", 1));

        // insert(int index, String str) - returns StringBuilder
        // inserts the specified string at index in the StringBuilder
        // throws StringIndexOutOfBounds if index < 0 || index > stringbuilder.length()
        System.out.println(sb.insert(5, "Yes"));

        // insert(int index, char[] str, int strBegin, int strLength) - returns StringBuilder
        // inserts the chars of str from strBegin upto strLength in StringBuilder at specified index
        // throws StringIndexOutOfBounds if index < 0 || index > length || strBegin < 0 ||
        // strLength < 0 || strBegin + strLength > str.length
        arr = new char[] {'H', 'e', 'l', 'l', 'o', ' '};
        System.out.println(sb.insert(0, arr, 0, arr.length));

        // lastIndexOf(String str) - returns int
        // returns the index of last occurenece of str
        // if not found it returns -1
        // throws NullPointer Exception if str == null
        System.out.println(sb.lastIndexOf("ll"));

        // lastIndexOf(String str, int index) - returns int
        // returns the index of last occurence of str starting from index in StringBuilder
        // returns -1 if not found
        // throws NullPointer Exception if str == null
        System.out.println(sb.lastIndexOf("ll", 9));

        // length() - returns int
        // returns the length of the StringBuilder
        System.out.println(sb.length());

        // replace(int start, int end, String str) - returns StringBuilder
        // removes the sequence from start (inclusive) till end (exclusive) and adds
        // str at index start
        // throws StringIndexOutOfBounds if start < 0 || start > end || start > length
        System.out.println(sb.replace(0, 5, "Hola"));

        // reverse() - returns StringBuilder
        // reverses the sequence of the StringBuilder
        System.out.println(sb.reverse());

        // setCharAt(int index, char ch) - returns void
        // sets the char at index to char ch
        // throws IndexOutOfBounds Exception if index < 0 || index >= length
        sb.setCharAt(0, '7');
        System.out.println(sb);

        // setLength(int newLength) - returns void
        // sets the length of the stringBuilder to newLength
        // by truncating it or inserting null
        // throws IndexOutOfBounds Exception if newLength < 0
        sb.setLength(5);
        System.out.println(sb);

        // substring(int start) - returns String
        // returns a new String with characters starting from start (inclusive) in stringBuilder
        // throws StirngIndexOutOfBounds Exception if start < 0 || start > length
        sb.substring(2);
        System.out.println(sb);

        // substring(int start, int end) - returns String
        // returns String from start (inclusive) to end (exclusive) in StirngBuilder
        // throws StringIndexOutOfBounds if start < 0 || start > end || start > length || 
        // end < 0 || end > length
        System.out.println(sb.substring(0, 3));

        // toString() - returns String
        // returns a new String with the contents of current stringBuilder
        System.out.println(sb.toString());

        // trimToSize() - returns void
        // tries to remove unallocated memory
        // may affect the value returned by capacity
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
