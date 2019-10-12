import java.util.*;

public class Test {

    public static final int length = 25;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        list = FindingFirstAvailableAnswer.findingFirstElement(length);
        //ADDING
        System.out.println("------------------- ADDING ---------------------------");
        FindingAvailableAnswersByAddingToEveryElement.addingElements(list, length);
        //SWAPPING
        System.out.println("------------------- SWAPPING ---------------------------");
        FindingAvailableAnswersByNOTCorrectSwapping.swappingWithoutMoving(list);
    }
}
