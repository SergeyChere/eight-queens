import java.util.*;

public class Test {

    public static final int length = 8;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        list = FindingFirstAvailableAnswer.findingFirstElement(length);
        FindingAvailableAnswersByRollingBoard.rollingBoard(list, length);

        //ADDING
//        int counter = 1;
//        for (ArrayList<ArrayList<Integer>> list: AllAnswersHardlyAdded.fillingArray()) {
//            System.out.println("********************** "+counter+" ************************");
////            if (!CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
////                System.out.println("WRONG ARRAY: "+Arrays.deepToString(list.toArray()));
////            }
//            System.out.println("to check: "+Arrays.deepToString(list.toArray()));
//            System.out.println("------------------- ADDING ---------------------------");
//            FindingAvailableAnswersByAddingToEveryElement.addingElements(list, length);
//            System.out.println("------------------- MOVING ---------------------------");
//            FindingAvailableAnswersByMovingSecondElementOfArray.movingElement(list, length);
//            System.out.println();
//            counter++;
//        }

        //SWAPPING
//        System.out.println("------------------- SWAPPING ---------------------------");
//        FindingAvailableAnswersByNOTCorrectSwapping.swappingWithoutMoving(list);
    }
}
