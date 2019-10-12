import java.util.ArrayList;

public interface CheckingAvailability {

    static boolean checkingAvailabilityOfTwoArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Integer one = arr2.get(0) - arr1.get(0);
        Integer two = arr2.get(1) - arr1.get(1);
        if (two < 0) two = two * -1;
        if (arr1.get(0) == arr2.get(0)) return false;
        if (arr1.get(0).equals(arr2.get(0))) return false;
        if (arr1.get(1).equals(arr2.get(1))) return false;
        if (one == two) return false;
        else return true;
    }

    static boolean checkingAvailabilityOfDoubleArrayList(ArrayList<ArrayList<Integer>> list) {
        int counter = 0;
        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<list.size(); j++) {
                if (CheckingAvailability.checkingAvailabilityOfTwoArrayLists(list.get(i), list.get(j)) == false && !list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
        }
        if (counter != 0) return false;
        return true;
    }

    //Rename!
    static boolean checkingAllVariantsInMainArray(ArrayList<ArrayList<Integer>> mainArray, ArrayList<Integer> newArray) {
        int counter = 0;
        for (ArrayList<Integer> arr : mainArray) {
            if (CheckingAvailability.checkingAvailabilityOfTwoArrayLists(arr, newArray)) {
                counter++;
            }
        }
        return true ? counter == mainArray.size() : false;
    }
}
