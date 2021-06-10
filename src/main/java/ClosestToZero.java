import java.util.List;

public class ClosestToZero {

    public static int find(List<Integer> numbers) {
        if (numbers.isEmpty())
            throw new IllegalArgumentException("input list cannot be empty");
        return numbers.stream()
                .reduce(numbers.get(0), ClosestToZero::pickClosest);
    }

    private static int pickClosest(Integer currentClosest, Integer current) {
        if (Math.abs(current) == Math.abs(currentClosest))
            return Math.max(current, currentClosest);
        if (Math.abs(current) < Math.abs(currentClosest))
            return current;

        return currentClosest;
    }
}
