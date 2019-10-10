import java.util.ArrayList;
import java.util.Arrays;

public class FindingFirstElement {

    public static ArrayList<ArrayList<Integer>> longList = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> findingFirstElement(int length) {
        boolean flag = true;
        if (longList.isEmpty()) {
            longList.add(new ArrayList<>(Arrays.asList(1, 1)));
        }
        for (int i = 1; flag; i++) {
            if (longList.size() == length) {
                flag = false;
            }
            for (int j = 1; j<=length; j++) {
//                if (i >= length && j >= length) {
//                    System.out.println("Here something wrong!");
//                }
                if (i == j) {
                    j=j;
                }
                if (checkingAllVariantsInMainArray(longList, new ArrayList<>(Arrays.asList(i+1, j)))) {
                    if (longList.get(longList.size()-1).get(0).equals(i)) {
                        longList.add(new ArrayList<>(Arrays.asList(i+1, j)));
                    }
                    else {
                        i = longList.get(longList.size()-1).get(0);
                        j = longList.get(longList.size()-1).get(1);
                        longList.remove(longList.size()-1);
                        if (j == length) {
                            i++;
                            j=1;
                        } else {
                            i--;
                        }
                    }
                }
            }
        }
        return longList;
    }

    public static boolean checkingAllVariantsInMainArray(ArrayList<ArrayList<Integer>> mainArray, ArrayList<Integer> newArray) {
        int counter = 0;
        for (ArrayList<Integer> arr : longList) {
            if (CheckingTwoElements.checkingTwoElementToAvailability(arr, newArray)) {
                counter++;
            }
        }
        return true ? counter == longList.size() : false;
    }
}
