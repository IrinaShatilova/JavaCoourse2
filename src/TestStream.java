import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

    Stream<Integer> stream = Stream.of(12,10,1,4,20,5,7);
    Stream<Integer> stream1 = Stream.of();
    BiConsumer<Integer,Integer> biConsumer = (min,max) -> System.out.println(" " + min + ", "+ max);
    Comparator<Integer> comparator = Comparator.reverseOrder();
    findMinMax(stream,comparator,biConsumer);
    findMinMax(stream1,comparator,biConsumer);
    findAndCountEvenNumbers(List.of(12,10,1,4,6,5,7,7,7));
    }

    public static <T> void findMinMax (
        Stream<? extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null,null);
        }else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size()-1));
        }
    }
        public static void findAndCountEvenNumbers(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate = (n) ->(n % 2 ==0);
        Stream<Integer> filterStream = stream.filter(predicate);
        filterStream.peek((e) -> System.out.print(" " + e)).collect(Collectors.toList());
        }
}
