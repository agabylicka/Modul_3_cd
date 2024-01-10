import org.trzcinska.Lorem;
import org.trzcinska.Word;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Word counter = new Word();
        HashMap<String,Integer> score = counter.countWords(Lorem.BASE);
        for (String key : score.keySet()) {
            System.out.println(key+": "+score.get(key));
        }
    }
}