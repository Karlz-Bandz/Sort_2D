import java.util.ArrayList;
import java.util.Collections;

public class SortAll
{
    private ArrayList<SortClass> repo;

    SortAll(ArrayList<SortClass> repo)
    {
        Collections.sort(repo);
        this.repo = repo;
    }

    public ArrayList<SortClass> getRepo()
    {
        return repo;
    }
}
