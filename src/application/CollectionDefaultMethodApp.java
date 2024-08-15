package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return 2 * integer;
            }
        });

        System.out.println(numbers);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        });

        System.out.println(numbers);
    }
}
