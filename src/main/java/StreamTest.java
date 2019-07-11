import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main (String[] s) {

        //get the sum of numbers from 0 to 10
        System.out.println(IntStream.rangeClosed(0,5).reduce(0,(a,b) -> a+b));

        //get the sum of square of nubers from 0 to 5
        System.out.println(IntStream.rangeClosed(0,5).reduce(0, (a,b) -> a + b*b));

        //concatenate the string.
        String[] str = {"a","b","c","d","e"};
        System.out.println(Arrays.stream(str).reduce("",(a,b)-> a+b));

        //capitalize the string and concatenate it
        System.out.println(Arrays.stream(str).reduce("",(a,b)->a+b.toUpperCase()));

        //find the largest number from an array
        int[] arr = {12,43,92,5,6,3,6,74,45,53,85};

        System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a > b ? a : b));
        System.out.println(Arrays.stream(arr).max().getAsInt());

        int[] arr1 = {50,62,5,62,40,6};
        System.out.println(Arrays.stream(arr1).reduce(0,(a,b)-> a+b));

        System.out.println(IntStream.rangeClosed(1,3).reduce(1,(a,b)-> a + b*b));
    }
}
