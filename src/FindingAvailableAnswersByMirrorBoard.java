import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByMirrorBoard {

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
}
