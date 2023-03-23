import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number_of_tests;
        int tables;
        ArrayList<String> solutions = new ArrayList<>();
        try
        {
            System.out.println("Plese enter number of tests: ");
            number_of_tests = scanner.nextInt();

            for (int i = 0; i < number_of_tests; i++)
            {
                ArrayList<SortClass> data = new ArrayList<>();

                System.out.println("Please enter the number of points to calculate: ");
                tables = scanner.nextInt();
                for (int j = 0; j < tables; j++)
                {
                    String name;
                    int[] co_ordinates = new int[2];

                    System.out.println("Please enter the name of record: ");
                    name = scanner.next();
                    System.out.println("Please enter co-ordinates: ");
                    co_ordinates[0] = scanner.nextInt();
                    co_ordinates[1] = scanner.nextInt();

                    data.add(new SortClass(name, co_ordinates));
                }

                SortAll sortAll = new SortAll(data);
                String solution = sortAll.getRepo().toString() + "\n";

                solutions.add(solution);
            }
        } catch (Exception e)
        {
            System.exit(420);
        }

        System.out.println("Sorted co_ordinates are below");

        for (int s = 0; s < solutions.size(); s++)
        {
            System.out.println(solutions.get(s));
        }
        System.exit(666);
    }
}