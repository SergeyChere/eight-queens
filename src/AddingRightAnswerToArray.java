import java.util.ArrayList;
import java.util.Arrays;

public interface AddingRightAnswerToArray {

    ArrayList<ArrayList<ArrayList<Integer>>> mainArrayListOfAnswers = new ArrayList<>();

    static void addOneArrayToLongArray(ArrayList<ArrayList<Integer>> list) {
        System.out.println(Arrays.deepToString(list.toArray()));
        mainArrayListOfAnswers.add(list);
    }

    static void printArray() {
        for (int i = 0; i<mainArrayListOfAnswers.size(); i++) {
            System.out.println(Arrays.deepToString(mainArrayListOfAnswers.get(i).toArray()));
        }
    }
}
