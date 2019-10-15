import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByRollingBoard {

    /*
     This's method that rolling a board at 90, 180, 270 degrees and check it for availability like:
    1,1 2,2 3,3 4,4
    1,4 2,3 3,2 4,1
     */
    static void rollingBoard(ArrayList<ArrayList<Integer>> list, int length) {
        for (int sides = 0; sides<3; sides++) {
            ArrayList<Integer> tempArray = new ArrayList<>();
            for (int indexElement = 0; indexElement<length; indexElement++) {
                tempArray.add(list.get(indexElement).get(1));
            }
            for (int i=1; i<=length; i++) {
                Integer index = tempArray.indexOf(i);
                Integer element = length-index;
                list.get(i-1).remove(1);
                list.get(i-1).add(element);
            }
            if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
                System.out.println("rolling: "+Arrays.deepToString(list.toArray()));
            }
        }
    }
}
