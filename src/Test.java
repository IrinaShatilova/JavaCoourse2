import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {

//      Задание 1

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer<0){
                    return false;
            }
            return true;
            }
        };
        Predicate <Integer> predicate2 = x -> x>0;
        System.out.println(predicate1.test(-2));
        System.out.println(predicate2.test(2));

//      Задание 2

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + ", привет.");
            }
        };
        Consumer<String> consumer2 = s -> System.out.println(s + ", привет.");
        consumer1.accept("Ирина");
        consumer1.accept("Владимир");

//      Задание 3

        Function<Double,Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double a) {
                return Math.round(a);
            }
        };
        Function<Double,Long> function2 = a -> Math.round(a);
        System.out.println(function1.apply(3.7));
        System.out.println(function2.apply(-2.1));

//      Задание 4

        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*100);
            }
        };
        Supplier<Integer> supplier2 = () -> (int) (Math.random()*100);
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

//      Задание 5
        Function<Integer,Integer> function3 = x-> Math.min(x,-3);
        Function<Integer,Double> function4 = x-> Math.pow(x,2);
        System.out.println(ternaryOperator(predicate1,function4,function3).apply(-1));
        System.out.println(ternaryOperator(predicate1,function4,function3).apply(-4));
        System.out.println(ternaryOperator(predicate1,function4,function3).apply(5));
        }
    public static <T, U> Function<T, U> ternaryOperator(
                Predicate<? super T> condition,
                Function<? super T, ? extends U> ifTrue,
                Function<? super T, ? extends U> ifFalse){
        return x-> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
    }

