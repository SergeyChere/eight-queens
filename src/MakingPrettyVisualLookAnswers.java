import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public interface MakingPrettyVisualLookAnswers {

    String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    static void makingVisualLook(ArrayList<ArrayList<Integer>> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++) {
            arrayList.add(letters[i]+""+list.get(i).get(1));
        }
        writeToFile(arrayList);
    }

    static void writeToFile(ArrayList<String> arrayList) {
        BufferedWriter writer = null;
        File file = new File("answers.txt");
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(Arrays.toString(arrayList.toArray()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
