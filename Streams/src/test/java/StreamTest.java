import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamTest {
    @Test
    public void StreamTester() {
        Random r = new Random();
        OptionalDouble avg = IntStream.generate(() -> r.nextInt(150))
                .limit(10)
                .boxed()
                .sorted((o1, o2) -> {
                    if ((o1 > 9 && o1 < 100) || (o2 > 9 && o2 < 100))
                        return o1.compareTo(o2);
                    else
                        return 0;
                })
                .mapToDouble(a -> a)
                .average();
        System.out.println(avg);

        Pattern pattern = Pattern.compile("");
        Stream<String> stream = pattern.splitAsStream("ABC");
        Map<Long, String> firstMap = stream.map(StreamContainer::new).peek(e -> System.out.println(e.toString())).collect(Collectors.toMap(StreamContainer::getCount,
                StreamContainer::getName));

        Map<String, List<StreamContainer>> secondMap = new HashMap<>();
        secondMap.put("1", List.of(new StreamContainer("A"), new StreamContainer("B")));
        List<StreamContainer> streamContainers = secondMap.values()
                .stream()
                .flatMap(Collection::stream)
                .toList();
        long sum = streamContainers.stream().count();
        assertEquals(sum, 2);

        String newString = "1010101010";
        Boolean result = newString.chars().mapToObj((c) -> {
            return c == '1';
        }).reduce(false, (subtotal, element) -> subtotal && element);
        assertEquals(result, false);
    }
}






