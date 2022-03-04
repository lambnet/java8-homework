import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Homework 1
        List<Integer> lst = Arrays.asList(1,21,11,24,61,123,2,4,6,17,19,12,56);
        // 1. Given a list of integers, find out all the even numbers exist in the list using Stream
        List<Integer> evenNumber = lst.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
        //System.out.println(evenNumber);

        // 2. Given a list of integers, find out all the numbers starting with 1 using Stream
        List<Integer> startWithOne = lst.stream().filter(e -> e.toString().startsWith("1")).collect(Collectors.toList());
        //System.out.println(startWithOne);

        // 3. Given a list of integers, find the total number of elements present in the list using Stream
        long totalNumber = lst.stream().count();
        long totalSum = lst.stream().reduce(0,(a,b) -> a + b);
        //System.out.println(totalSum);

        // 4. Given a list of integers, sort all the values present in it using Stream
        List<Integer> sortedLst = lst.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedLst);

    }
}
