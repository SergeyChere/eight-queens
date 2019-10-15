import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByMirrorBoard {

    /*
     This's method that horizontal mirror the board and check it for availability like:
    1,1 2,2 3,3 4,4
    1,4 2,3 3,2 4,1
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
    1,1 2,2 3,3 4,4
    1,4 2,3 3,2 4,1
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
