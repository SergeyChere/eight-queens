import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByAddingToEveryElement {

    /*
     This's method that iterate an array for availability by adding to every element like:
    [[1, 1], [2, 5], [3, 8], [4, 6], [5, 3], [6, 7], [7, 2], [8, 4]] ->
    [[1, 2], [2, 6], [3, 1], [4, 7], [5, 4], [6, 8], [7, 3], [8, 5]] ->
    [[1, 3], [2, 7], [3, 2], [4, 8], [5, 5], [6, 1], [7, 4], [8, 6]] ->
    [[1, 4], [2, 8], [3, 3], [4, 1], [5, 6], [6, 2], [7, 5], [8, 7]] ->
    [[1, 5], [2, 1], [3, 4], [4, 2], [5, 7], [6, 3], [7, 6], [8, 8]] ->
    [[1, 6], [2, 2], [3, 5], [4, 3], [5, 8], [6, 4], [7, 7], [8, 1]] ->
    [[1, 7], [2, 3], [3, 6], [4, 4], [5, 1], [6, 5], [7, 8], [8, 2]] ->
    [[1, 8], [2, 4], [3, 7], [4, 5], [5, 2], [6, 6], [7, 1], [8, 3]]
     */
    static void addingElements(ArrayList<ArrayList<Integer>> list, int length) {
        Integer checking = list.get(0).get(1);

        for (int i = 0; i < length; i++) {
            for (ArrayList<Integer> arr: list) {
                Integer get1 = arr.get(1)+1;
                if (get1 == 9) {
                    get1 = 1;
                }
                arr.remove(1);
                arr.add(get1);
            }
            if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
//                AddingRightAnswerToArray.addOneArrayToLongArray(list);
                if (!list.get(0).get(1).equals(checking)) {
                    System.out.println("  answer: "+Arrays.deepToString(list.toArray()));
                }
            }
        }
    }
}
