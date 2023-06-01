package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder str = new StringBuilder();
        for (char aChar : chars) {
            str.append(aChar);
        }
        System.out.print(str);
    }
}
