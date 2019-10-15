import java.util.ArrayList;
import java.util.Arrays;

public class FindingAvailableAnswersByMovingSecondElementOfArray {

    /*
     This's method that iterate an array for availability by moving every element like:
    [[1, 1], [2, 5], [3, 8], [4, 6], [5, 3], [6, 7], [7, 2], [8, 4]] ->
    [[1, 4], [2, 1], [3, 5], [4, 8], [5, 6], [6, 3], [7, 7], [8, 2]] ->
    [[1, 2], [2, 4], [3, 1], [4, 5], [5, 8], [6, 6], [7, 3], [8, 7]] ->
    [[1, 7], [2, 2], [3, 4], [4, 1], [5, 5], [6, 8], [7, 6], [8, 3]] ->
    [[1, 3], [2, 7], [3, 2], [4, 4], [5, 1], [6, 5], [7, 8], [8, 6]] ->
    [[1, 6], [2, 3], [3, 7], [4, 2], [5, 4], [6, 1], [7, 5], [8, 8]] ->
    [[1, 8], [2, 6], [3, 3], [4, 7], [5, 2], [6, 4], [7, 1], [8, 5]] ->
    [[1, 5], [2, 8], [3, 6], [4, 3], [5, 7], [6, 2], [7, 4], [8, 1]]
     */
    static void movingElement(ArrayList<ArrayList<Integer>> list, int length) {
        Integer checking = list.get(0).get(1);

        for (int j = 0; j < length; j++) {
            Integer temp = 0;
            for (int i = 0; i < length-1; i++) {
                if (temp == 0) {
                    Integer get1 = list.get(i).get(1);
                    temp = list.get(i+1).get(1);
                    list.get(i).remove(1);
                    Integer last = list.get(list.size()-1).get(1);
                    list.get(i).add(last);
                    list.get(i+1).remove(1);
                    list.get(i+1).add(get1);
                } else {
                    Integer getTemp = temp;
                    temp = list.get(i+1).get(1);
                    list.get(i+1).remove(1);
                    list.get(i+1).add(getTemp);
                }
            }
            if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
                if (!list.get(0).get(1).equals(checking)) {
                    System.out.println("  answer: "+Arrays.deepToString(list.toArray()));
                }
            }
        }
    }
}
