import java.util.ArrayList;

public interface FindingAvailableAnswersByAddingToEveryElement {

    /*
     This's method that iterate an array for availability by adding to every element like:
    1,1 2,2 3,3
    1,2 2,3 3,1
    1,3 2,1 3,2
     */
    static void addingElements(ArrayList<ArrayList<Integer>> list, int length) {
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
                AddingRightAnswerToTree.addToTree(list);
            }
        }
    }
}
