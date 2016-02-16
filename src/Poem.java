/**
 * Created by Dummyc0m on 2/16/16.
 */
public abstract class Poem {
    private int[] syllables;

    public Poem(int... syllables) {
        this.syllables = syllables;
    }

    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        for (int syllableCount : syllables) {
            if (syllableCount > 0) {
                StringBuilder sb = new StringBuilder().append("ta");
                for (int i = 1; i < syllableCount; i++) {
                    sb.append("-ta");
                }
                System.out.println(sb);
            }
        }
    }

    public class Haiku extends Poem {

        public Haiku() {
            super(5, 7, 5);
        }

        @Override
        public int numLines() {
            return syllables.length;
        }

        @Override
        public int getSyllables(int k) {
            return syllables[k];
        }
    }

    public class Limerick extends Poem {

        public Limerick() {
            super(9, 9, 6, 6, 9);
        }

        @Override
        public int numLines() {
            return syllables.length;
        }

        @Override
        public int getSyllables(int k) {
            return syllables[k];
        }
    }
}
