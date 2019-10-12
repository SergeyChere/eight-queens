import java.util.ArrayList;

public interface AddingRightAnswerToTree {
    ArrayList<ArrayList<ArrayList<Integer>>> mainArrayListOfAnswers = new ArrayList<>();

    static ArrayList<ArrayList<ArrayList<Integer>>> addToTree(ArrayList<ArrayList<Integer>> list) {
        //                        Adding to TreeSet not working
//                        for (int g = 0; g<list.size(); g++) {
//                            map.add(list.get(g));
//                        }
        boolean flag = false;
        if (mainArrayListOfAnswers.isEmpty()) {
            mainArrayListOfAnswers.add(list);
        } else {
          for (ArrayList<ArrayList<Integer>> arr: mainArrayListOfAnswers) {
              int counter = 1;
              for (int i = 0; i<arr.size(); i++) {
                  if (arr.get(i).get(1).equals(list.get(i).get(1))) {
                      counter++;
                  }
              }
              if (counter == 8) {
                  flag = true;
              }
          }
        }
        if (!flag) {
            mainArrayListOfAnswers.add(list);
        }
        return mainArrayListOfAnswers;
    }
}
