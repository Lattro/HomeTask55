import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listArray = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++)
        {
            listArray.add(random.nextInt(10)+1);
        }
        System.out.println(listArray.toString());
        ListIterator<Integer> listIterator = listArray.listIterator();
        while (listIterator.hasNext())
        {
            listIterator.next();
        }
        while(listIterator.hasPrevious())
        {
            Integer element = listIterator.previous();
            System.out.print(element+", ");
            listIterator.remove();
        }
        if(listArray.isEmpty())
        {
            System.out.println();
            System.out.println("Коллекция пуста");
        }
        else
        {
            System.out.println();
            System.out.println("Коллекция удалена не полностью");
        }
    }
}
