/**
 * Created by Dummyc0m on 2/16/16.
 */
public class Diploma {
    private String name;
    private String subject;

    public Diploma(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "This certifies that" + name + '\n' +
                "has completed a MOOC in '" + subject;
    }
}
