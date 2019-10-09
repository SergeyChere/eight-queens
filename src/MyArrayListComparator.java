import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayListComparator implements Comparator<ArrayList> {

    @Override
    public int compare(ArrayList o1, ArrayList o2) {
        int firstFirst = (int) o1.get(0);
        int firstSecond = (int) o1.get(1);
        int secondFirst = (int) o2.get(0);
        int secondSecond = (int) o2.get(1);
        System.out.println("firstFirst: "+firstFirst+", firstSecond: "+firstSecond+", secondFirst: "+secondFirst+", secondSecond: "+secondSecond);
        if (firstFirst == secondFirst && firstSecond == secondSecond) {
            System.out.println("== ==");
            return 1;
        }
        if (firstFirst == secondFirst && firstSecond < secondSecond) {
            System.out.println("== <");
            return 1;
        }
        if (firstFirst < secondFirst) {
            System.out.println("<");
            return 1;
        }
        if (firstFirst > secondFirst) {
            System.out.println(">");
            return -1;
        }
        System.out.println("0");
        return 0;
    }
}
