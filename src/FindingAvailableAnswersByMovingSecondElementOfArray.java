import java.util.ArrayList;
import java.util.Arrays;

public class FindingAvailableAnswersByMovingSecondElementOfArray {

    /*
     This's method that iterate an array for availability by moving every element like:
     1,1 2,2 3,3
     1,2 2,3 3,1
     1,3 2,1 3,2
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
