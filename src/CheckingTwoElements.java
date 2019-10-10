import java.util.ArrayList;

public interface CheckingTwoElements {
    static boolean checkingTwoElementToAvailability(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Integer one = arr2.get(0) - arr1.get(0);
        Integer two = arr2.get(1) - arr1.get(1);
        if (two < 0) two = two * -1;
        if (arr1.get(0) == arr2.get(0)) return false;
        if (arr1.get(0).equals(arr2.get(0))) return false;
        if (arr1.get(1).equals(arr2.get(1))) return false;
        if (one == two) return false;
        else return true;
    }
}
