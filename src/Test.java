import java.util.*;

public class Test {

    public static final int length = 8;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        //FIRST ELEMENT
        list = FindingFirstAvailableAnswer.findingFirstElement(length);
//        //ROLLING
//        FindingAvailableAnswersByRollingBoard.rollingBoard(list, length);
        //HORIZONTAL MIRROR
//        FindingAvailableAnswersByMirrorBoard.horizontalMirrorBoard(list, length);
        //VERTICAL MIRROR
//        FindingAvailableAnswersByMirrorBoard.verticalMirrorBoard(list, length);
        //ADDING
//        FindingAvailableAnswersByAddingToEveryElement.addingElements(list, length);
        //MOVING
//        FindingAvailableAnswersByMovingSecondElementOfArray.movingElement(list, length);

        //PRETTY LOOK - SHOULD BE ADDED AFTER ALL METHODS TO ADDING TO MAIN ARRAY CLASS
        MakingPrettyVisualLookAnswers.makingVisualLook(list);

        // TEST ALL ANSWERS
//        int counter = 1;
//        for (ArrayList<ArrayList<Integer>> list: AllAnswersHardlyAdded.fillingArray()) {
//            if (!CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
//                System.out.println("WRONG ARRAY: "+Arrays.deepToString(list.toArray()));
//            }
//            FindingAvailableAnswersByAddingToEveryElement.addingElements(list, length);
//            FindingAvailableAnswersByMovingSecondElementOfArray.movingElement(list, length);
//            counter++;
//        }

        //SWAPPING - NOT CORRECT
//        FindingAvailableAnswersByNOTCorrectSwapping.swappingWithoutMoving(list);
    }
}
