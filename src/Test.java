import java.util.*;

public class Test {

    public static final ArrayList<ArrayList<Integer>> list = fillArray();

    public static void main(String[] args) {
        swappingWithoutMoving(list);
    }

    /*
    This's method that iterate an array for availability by swapping every element like:
    1 <-> 2 3
    2 1 <-> 3
    <-> 2 3 1 <->
    1 <-> 3 2
    3 1 <-> 2
    <-> 3 2 1 <->
    1 2 3
     */
    public static void swappingWithoutMoving(ArrayList<ArrayList<Integer>> list) {
        System.out.println("   main: "+Arrays.deepToString(list.toArray()));
        int counter = 0;
        boolean flag = false;

        for (int e = 0; e<list.size(); e++) {
            System.out.println("---------------- "+e);
            for (int i = 0; i<list.size(); i++) {
                System.out.println("------------------------------- "+i);
                for (int j = 0; j<list.size(); j++) {
                    int num;
                    if (j == list.size()-1 && i == list.size()-1) {
                        break;
                    }
                    else if (j == i) {
                        j++;
                    }
                    else if (j > list.size()) {
                        j = 0;
                        flag = true;
                    }
                    num = list.get(i).get(1);
                    list.get(i).remove(1);

                    list.get(i).add(list.get(j).get(1));
                    list.get(j).remove(1);

                    list.get(j).add(num);
                    if (checkingAvailable(list)) {
                        System.out.println(" answer: "+Arrays.deepToString(list.toArray()));
                    } else {
//                    System.out.println("variant: "+Arrays.deepToString(list.toArray()));
                    }
                    if (flag) {
                        break;
                    }
                }
                flag = false;
                counter=counter++;
            }
        }
    }

    public static boolean checkingAvailable(ArrayList<ArrayList<Integer>> list) {
        int counter = 0;
        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<list.size(); j++) {
                if (checkingTwoElementToAvailability(list.get(i), list.get(j)) == false && !list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
        }
        if (counter != 0) return false;
        return true;
    }

    public static boolean checkingTwoElementToAvailability(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Integer one = arr2.get(0) - arr1.get(0);
        Integer two = arr2.get(1) - arr1.get(1);
        if (two < 0) two = two * -1;
        if (arr1.get(0) == arr2.get(0)) return false;
        if (arr1.get(0).equals(arr2.get(0))) return false;
        if (arr1.get(1).equals(arr2.get(1))) return false;
        if (one == two) return false;
        else return true;
    }

    //----------------------------------------------------------

    public static ArrayList<ArrayList<Integer>> fillArray() {
        ArrayList<ArrayList<Integer>> arrLong = new ArrayList<>();
        arrLong.add(new ArrayList<>(Arrays.asList(1, 1)));
        arrLong.add(new ArrayList<>(Arrays.asList(2, 5)));
        arrLong.add(new ArrayList<>(Arrays.asList(3, 8)));
        arrLong.add(new ArrayList<>(Arrays.asList(4, 6)));
        arrLong.add(new ArrayList<>(Arrays.asList(5, 3)));
        arrLong.add(new ArrayList<>(Arrays.asList(6, 7)));
        arrLong.add(new ArrayList<>(Arrays.asList(7, 2)));
        arrLong.add(new ArrayList<>(Arrays.asList(8, 4)));
        return arrLong;
    }
}
