import java.util.ArrayList;
import java.util.Collections;

public class SortAll {
    ArrayList<SortClass> repo = new ArrayList<>();

    SortAll(ArrayList<SortClass> repo) {
        Collections.sort(repo);
        this.repo = repo;
    }
}
