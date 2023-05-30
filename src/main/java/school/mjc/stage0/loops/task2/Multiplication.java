package school.mjc.stage0.loops.task2;
public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int temp = multiplyByAndToInclusive;
        int i = 0;
        if (multiplyByAndToInclusive < 0) {
            while (multiplyByAndToInclusive <= 0) {
                int product = i * temp;
                System.out.println(product);
                multiplyByAndToInclusive++;
                i++;
            }
        } else if (multiplyByAndToInclusive > 0) {
            while (multiplyByAndToInclusive >= 0) {
                int product = i * temp;
                System.out.println(product);
                multiplyByAndToInclusive--;
                i++;
            }
        }
    }
}