import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    }

    public int countVocabulary(List<String> words) {
        Set<String> wordSet = new HashSet<>(words);

       /* Set<String> wordSet = new HashSet<>();
        for ( String w:words){
            wordSet.add(w);
        }*/
    return wordSet.size();
    }

}

