import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByRollingBoard {

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
