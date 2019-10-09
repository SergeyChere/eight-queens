import java.util.ArrayList;
import java.util.Arrays;

public class FindingFirstElement {

    public static ArrayList<ArrayList<Integer>> longList = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> findingFirstElement(int length) {
        ArrayList<Integer> firstTempShortArray = new ArrayList<>();

        for (int i = 0; i<length; i++) {
            if (longList.isEmpty()) {
                longList.add(new ArrayList<>(Arrays.asList(i+1, i+1)));
            }
            for (int j = 0; j<length; j++) {
                ArrayList<Integer> secondTempShortArray = new ArrayList<>();
                if (i == j) {
                    j++;
                }
                secondTempShortArray.add(i + 1);
                secondTempShortArray.add(j + 1);

                System.out.println(Arrays.deepToString(longList.toArray()));
                System.out.println(Arrays.deepToString(secondTempShortArray.toArray()));
                System.out.println(CheckingTwoElements.checkingTwoElementToAvailability(longList.get(i), secondTempShortArray));
                if (CheckingTwoElements.checkingTwoElementToAvailability(longList.get(i), secondTempShortArray)) {
                    longList.add(secondTempShortArray);
                    System.out.println(Arrays.deepToString(longList.toArray()));
                    break;
                }
            }
        }
        return longList;
    }
}
