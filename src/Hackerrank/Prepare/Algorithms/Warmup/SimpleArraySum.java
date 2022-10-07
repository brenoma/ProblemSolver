package Hackerrank.Prepare.Algorithms.Warmup;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleArraySum {
    public static void main(String[] args) {
        simpleArraySum(List.of(1, 2, 3));
    }

    public static int simpleArraySum(List<Integer> ar) {
        AtomicInteger sum = new AtomicInteger();

        ar.forEach(e -> sum.addAndGet(e));

        return sum.get();
    }
}
