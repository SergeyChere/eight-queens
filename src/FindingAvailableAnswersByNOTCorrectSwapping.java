import java.util.ArrayList;
import java.util.Arrays;

public interface FindingAvailableAnswersByNOTCorrectSwapping {

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
    static void swappingWithoutMoving(ArrayList<ArrayList<Integer>> list) {
        System.out.println("  main: "+ Arrays.deepToString(list.toArray()));
//        System.out.println("------------------------------- BEGIN");
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
                    if (CheckingAvailability.checkingAvailabilityOfDoubleArrayList(list)) {
                        AddingRightAnswerToTree.addToTree(list);
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
}
