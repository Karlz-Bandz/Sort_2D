import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;


public class SortClass implements Comparable<SortClass>
{
    private String name;
    private int[] co_ordinates;
    private Double result;

    SortClass(String name, int[] co_ordinates)
    {
        this.name = name;
        this.co_ordinates = co_ordinates;
        this.result = getDistance.apply(co_ordinates[0], co_ordinates[1]);
    }

    @Override
    public String toString()
    {
        return name + " " + Arrays.toString(co_ordinates);
    }

    @Override
    public int compareTo(SortClass o)
    {
        return getSort.apply(o.result);
    }

    Function<Double, Integer> getSort = x -> -(this.result.compareTo(x));

    BiFunction<Integer, Integer, Double> getDistance = (x, y) ->
    {
        return Math.sqrt((x * x) + (y * y));
    };
}