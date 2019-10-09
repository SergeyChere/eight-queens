import java.util.*;

public class Test {

    public static final int length = 8;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//    public static TreeSet<ArrayList<Integer>> map = new TreeSet(new MyArrayListComparator());

    public static void main(String[] args) {
        list = FindingFirstElement.findingFirstElement(length);
//        System.out.println(Arrays.deepToString(list.toArray()));
//        swappingWithoutMoving(list);
//        System.out.println("------------------------------- END");
//        System.out.println(Arrays.deepToString(map.toArray()));
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
        System.out.println("------------------------------- BEGIN");
        int counter = 0;
        boolean flag = false;

        for (int e = 0; e<list.size(); e++) {
//                System.out.println("--------------- "+e);
            for (int i = 0; i<list.size(); i++) {
//                    System.out.println("------------------------------- "+i);
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
//                        Adding to TreeSet not working
//                        for (int g = 0; g<list.size(); g++) {
//                            map.add(list.get(g));
//                        }
                        System.out.println(" answer: "+Arrays.deepToString(list.toArray()));
                    } else {
//                            System.out.println("variant: "+Arrays.deepToString(list.toArray()));
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
                if (CheckingTwoElements.checkingTwoElementToAvailability(list.get(i), list.get(j)) == false && !list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
        }
        if (counter != 0) return false;
        return true;
    }



    //----------------------------------------------------------

    public static ArrayList<ArrayList<Integer>> fillArray() {
        ArrayList<ArrayList<Integer>> arrLong = new ArrayList<>();
        arrLong.add(new ArrayList<>(Arrays.asList(1, 6)));
        arrLong.add(new ArrayList<>(Arrays.asList(2, 4)));
        arrLong.add(new ArrayList<>(Arrays.asList(3, 7)));
        arrLong.add(new ArrayList<>(Arrays.asList(4, 1)));
        arrLong.add(new ArrayList<>(Arrays.asList(5, 8)));
        arrLong.add(new ArrayList<>(Arrays.asList(6, 2)));
        arrLong.add(new ArrayList<>(Arrays.asList(7, 5)));
        arrLong.add(new ArrayList<>(Arrays.asList(8, 3)));
        return arrLong;
    }
}
