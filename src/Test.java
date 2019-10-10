import java.util.*;

public class Test {

    public static final int length = 8;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        list = FindingFirstElement.findingFirstElement(length);
        System.out.println("fill array: "+Arrays.deepToString(list.toArray()));
        NotCorrectSwapping.swappingWithoutMoving(list);
    }
}
