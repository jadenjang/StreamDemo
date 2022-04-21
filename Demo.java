import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws IOException {


        //EXAMPLE ONE
        IntStream
                .range(1, 10)   //  (include, exclude]
                .forEach(System.out::print);
        System.out.println();



        //EXAMPLE TWO
        IntStream
                .range(1, 10)   //creates range of integers within specified bounds
                .skip(5)    //skips 1st 5 numbers in stream
                .forEach(System.out::print);
        System.out.println();



        ///EXAMPLE THREE
        System.out.println(IntStream
                .range(1, 5)
                .sum());



        //EXAMPLE FOUR
        Stream.of("Ava", "Anna", "Alberto", "Bob", "Charlie", "Dan", "Estafan")
                .sorted()   //can put custom Comparator in these parameters
                .findFirst()
                .ifPresent(System.out::println);



        //EXAMPLE FIVE
        String [] names = { "Ava", "Anna", "Alberto", "Bob", "Charlie", "Dan", "Estafan" };
        Arrays.stream(names)
                .filter(s -> s.startsWith("A"))
                .sorted()
                .forEach(System.out::println);



        //EXAMPLE SIX
        Arrays.stream(new int [] {4, 2, 1, 0})
                .map(n -> n*n)
                .average()
                .ifPresent(System.out::println);



        //EXAMPLE SEVEN
        List<String> people = Arrays.asList("Ava", "Anna", "Alberto", "Bob", "Charlie", "Dan", "Estafan");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);



        //EXAMPLE EIGHT
        Stream<String> bands = Files.lines(Paths.get("rockBands"));
        bands.sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }
}
