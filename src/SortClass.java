import java.util.Arrays;

public class SortClass implements Comparable<SortClass>{
    private String name;
    private int[] co_ordinates = new int[2];
    private Double result;

    SortClass(String name, int[] co_ordinates){
        this.name = name;
        this.co_ordinates = co_ordinates;
        this.result = Math.sqrt((co_ordinates[0]*co_ordinates[0])+(co_ordinates[1]*co_ordinates[1]));
    }

    public Double getResult(){
        return this.result;
    }

    @Override
    public String toString(){
        return name + " " + Arrays.toString(co_ordinates);
    }

    @Override
    public int compareTo(SortClass o) {
        int x = -(this.result.compareTo(o.result));
        return x;
    }
}
