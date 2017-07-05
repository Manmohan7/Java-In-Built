import java.lang.StringBuilder;

class Stringbuilder {
    public static void main(String[] args) {

        // constructor - creates an empty StringBuilder with intial capacity of 16 chars
        StringBuilder sb = new StringBuilder();

        // constructor - creates a StringBuilder object with minimum capacity sent as parameter
        StringBuider sb2 = new StringBuilder(18);

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


    }
}
