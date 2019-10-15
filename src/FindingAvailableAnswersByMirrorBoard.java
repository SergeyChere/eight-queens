import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByMirrorBoard {

    /*
     This's method that horizontal mirror the board and check it for availability like:
    [[1, 1], [2, 5], [3, 8], [4, 6], [5, 3], [6, 7], [7, 2], [8, 4]] ->
    [[1, 4], [2, 2], [3, 7], [4, 3], [5, 6], [6, 8], [7, 5], [8, 1]]
     */
    static void horizontalMirrorBoard(ArrayList<ArrayList<Integer>> list, int length) {
        for (int i = 0, j = length-1; i<length/2; i++, j--) {
            Integer temp = list.get(i).get(1);
            list.get(i).remove(1);
            list.get(i).add(list.get(j).get(1));
            list.get(j).remove(1);
            list.get(j).add(temp);
        }
        if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
            System.out.println(" mirror: "+Arrays.deepToString(list.toArray()));
        }
    }

    /*
     This's method that vertical mirror the board and check it for availability like:
    [[1, 1], [2, 5], [3, 8], [4, 6], [5, 3], [6, 7], [7, 2], [8, 4]] ->
    [[1, 8], [2, 4], [3, 1], [4, 3], [5, 6], [6, 2], [7, 7], [8, 5]]
     */
    static void verticalMirrorBoard(ArrayList<ArrayList<Integer>> list, int length) {
        for (int i = 0; i<length; i++) {
            Integer result = length - (list.get(i).get(1)-1);
            list.get(i).remove(1);
            list.get(i).add(result);
        }
        if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
            System.out.println(" mirror: "+Arrays.deepToString(list.toArray()));
        }
    }
}
