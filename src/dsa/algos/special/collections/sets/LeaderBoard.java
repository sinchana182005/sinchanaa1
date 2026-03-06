package dsa.algos.special.collections.sets;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class LeaderBoard {
    static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(450);
        scores.add(780);
        scores.add(340);
        System.out.println("LeaderBoard Starts:" +scores);
    }

}
