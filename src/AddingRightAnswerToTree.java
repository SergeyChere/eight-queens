import java.util.ArrayList;
import java.util.Arrays;

public interface AddingRightAnswerToTree {
    static void addToTree(ArrayList<ArrayList<Integer>> list) {
        //                        Adding to TreeSet not working
//                        for (int g = 0; g<list.size(); g++) {
//                            map.add(list.get(g));
//                        }
        System.out.println("answer: "+ Arrays.deepToString(list.toArray()));
    }
}
