import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void newStack6() {
        for (int t = 0; t <= 6; t++) {
            for (int b = t; b <= 6; b++) {
                Domino domino = new Domino(t, b);
                pile.add(domino);
                b++;
            }
            t++;
        }
    }

    public void shuffle() {
        ArrayList<Domino> store = new ArrayList<>();
        Random random = new Random();
        while (!(store.size() == pile.size())) {
            int index = random.nextInt(pile.size());
            store.add(pile.get(index));
            pile.remove(index);
        }
    }
}
